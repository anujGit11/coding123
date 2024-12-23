package com.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.demo.entity.Registration;

public interface RegistrationRepository extends CrudRepository<Registration, Integer> {

	boolean existsByEmail(String email);

	boolean existsByMobile(long mobile);

	Optional<Registration> findByEmail(String email);
	// @Query("SELECT r FROM Registration r WHERE r.email = :email")
	// Optional<Registration> findByEmail(@Param("x")String email);

	Optional<Registration> findByMobile(long mobile);

	Iterable<Registration> findBySurname(String surname);

	Optional<Registration> findByEmailAndMobile(String email, long mobile);
	// Query("SELECT r FROM Registration r WHERE r.email = :x AND r.mobile = :y;")
	// Optional<Registration> findByEmailAndMobile(@Param("x") String email,
	// @Param("y") long mobile);
	
	
	Iterable<Registration> findByEmailOrMobile(String email, long mobile);
}
