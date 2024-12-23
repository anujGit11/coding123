package com.demo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entity.Registration;
import com.demo.repository.RegistrationRepository;

@SpringBootTest
class Demo2ApplicationTests {

	@Autowired
	private RegistrationRepository registrationRepository;

	@Test
	void createRegistration() {
		Registration reg = new Registration();
		reg.setName("MIKA");
		reg.setSurname("SINGH");
		reg.setEmail("MS@gmail.com");
		reg.setEnroll(90);
		reg.setMobile(7777996655L);

		registrationRepository.save(reg);

	}

	@Test
	void deleteRegistration() {
		registrationRepository.deleteById(2);
	}

	@Test
	void getAllRegistrations() {
		Iterable<Registration> registrations = registrationRepository.findAll(); 
		for (Registration registration : registrations) {
			System.out.println(registration.getId());
			System.out.println(registration.getName());
			System.out.println(registration.getSurname());
			System.out.println(registration.getEmail());
			System.out.println(registration.getEnroll());
			System.out.println(registration.getMobile());
		}

	}

	@Test
	void getRegistrationById() {
		Optional<Registration> byId = registrationRepository.findById(3);
		if (byId.isPresent()) {
			Registration registration = byId.get(); //converting optional to entity object through get method.
			System.out.println(registration.getId());
			System.out.println(registration.getName());
			System.out.println(registration.getSurname());
			System.out.println(registration.getEmail());
			System.out.println(registration.getEnroll());
			System.out.println(registration.getMobile());
		} else {
			System.out.println("Record nt found!!!");
		}
	}

	@Test
	void checkRegistrationExistsByEmail() {
		boolean val = registrationRepository.existsByEmail("AS@gmail.com");
		System.out.println(val);
	}

	@Test
	void checkRegistrationExistsById() {
		boolean val = registrationRepository.existsById(3);
		System.out.println(val);
	}

	@Test
	void checkRegistrationExistsByMobile() {
		boolean val = registrationRepository.existsByMobile(9988776655L);
		System.out.println(val);
	}

	@Test
	void getRegistrationExistsByEmail() {
		Optional<Registration> val = registrationRepository.findByEmail("VM@gmail.com");
		if (val.isPresent()) {
			Registration registration = val.get();
			System.out.println(registration.getId());
			System.out.println(registration.getName());
			System.out.println(registration.getSurname());
			System.out.println(registration.getEmail());
			System.out.println(registration.getEnroll());
			System.out.println(registration.getMobile());
		} else {
			System.out.println("Record is not present...");
		}
	}

	@Test
	void getRegistrationExistsByMobile() {
		Optional<Registration> val = registrationRepository.findByMobile(6688996655L);
		if (val.isPresent()) {
			Registration registration = val.get();
			System.out.println(registration.getId());
			System.out.println(registration.getName());
			System.out.println(registration.getSurname());
			System.out.println(registration.getEmail());
			System.out.println(registration.getEnroll());
			System.out.println(registration.getMobile());
		} else {
			System.out.println("Record is not present...");
		}
	}

	@Test
	void getRegistrationBySurname() {
		Iterable<Registration> regs = registrationRepository.findBySurname("SINGH");
		for (Registration registration : regs) {
			System.out.println(registration.getId());
			System.out.println(registration.getName());
			System.out.println(registration.getSurname());
			System.out.println(registration.getEmail());
			System.out.println(registration.getEnroll());
			System.out.println(registration.getMobile());
		}

	}

	@Test
	void getRegistrationByEmailAndMobile() {
		Optional<Registration> val = registrationRepository.findByEmailAndMobile("SN@gmail.com", 7788996655L);
		Registration registration = val.get();
		System.out.println(registration.getId());
		System.out.println(registration.getName());
		System.out.println(registration.getSurname());
		System.out.println(registration.getEmail());
		System.out.println(registration.getEnroll());
		System.out.println(registration.getMobile());
	}

	@Test
	void getRegistrationByEmailOrMobile() {
		Iterable<Registration> regs = registrationRepository.findByEmailOrMobile("SN@gmail.com", 9988776655L);
		for (Registration registration : regs) {
			System.out.println(registration.getId());
			System.out.println(registration.getName());
			System.out.println(registration.getSurname());
			System.out.println(registration.getEmail());
			System.out.println(registration.getEnroll());
			System.out.println(registration.getMobile());
		}
	}

}
