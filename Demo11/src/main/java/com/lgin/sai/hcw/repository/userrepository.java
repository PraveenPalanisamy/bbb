package com.lgin.sai.hcw.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lgin.sai.hcw.model.user;

public interface userrepository extends JpaRepository<user, Long>{

	boolean existsByemail(String email);

	boolean existsByPassword(String password);

	Optional<user> findById(int id);

	void deleteById(int id);

	void save(int id);

	

}
