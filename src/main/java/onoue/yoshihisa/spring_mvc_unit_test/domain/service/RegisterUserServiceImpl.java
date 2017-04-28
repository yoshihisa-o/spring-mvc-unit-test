package onoue.yoshihisa.spring_mvc_unit_test.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onoue.yoshihisa.spring_mvc_unit_test.domain.repository.RegisterUserRepository;

@Service
public class RegisterUserServiceImpl implements RegisterUserService {

	@Autowired
	RegisterUserRepository repository;
	
	public int registerUser(String id, String name) {
		return 0;
	}

}
