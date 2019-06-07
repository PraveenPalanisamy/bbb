package com.lgin.sai.hcw.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lgin.sai.hcw.model.user;
import com.lgin.sai.hcw.repository.userrepository;
import com.lgin.sai.hcw.request.Loginform;

@RestController
@RequestMapping("/api/auth")
public class usercontroller {

	@Autowired
	userrepository urep;
	
	@PostMapping(value="/create")
	public user create(@RequestBody user us)
	{
		return urep.save(us);
	}
	

	@PostMapping("/signin")
	public ResponseEntity<String>lll(@RequestBody Loginform lf){
		if(urep.existsByemail(lf.getEmail())) {
			if(urep.existsByPassword(lf.getPassword())) {
				return ResponseEntity.ok().body("logged in");
			}
		}
		return ResponseEntity.ok().body("sorry");
	}
	
	@GetMapping(value="/display")
	public List<user> abc()
	{
		return urep.findAll();
	}
	
	@DeleteMapping("/dele")
	public void dee() {
	urep.deleteAll();
	}
	
	@DeleteMapping("/dele/{id}")
	public void delById(@PathVariable int id){
	 urep.deleteById(id);
	}


	@GetMapping(value="/display{id}")
	public ResponseEntity<String> disp(@PathVariable int id) {
		if(urep.findById(id))
		{
			urep.save(id);
			return ResponseEntity.ok().body("Displaying");
		}
	return ResponseEntity.ok().body("not displaying");
	}
	
}

