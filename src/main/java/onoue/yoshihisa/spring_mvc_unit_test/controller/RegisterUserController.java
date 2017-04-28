package onoue.yoshihisa.spring_mvc_unit_test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import onoue.yoshihisa.spring_mvc_unit_test.domain.service.RegisterUserService;
import onoue.yoshihisa.spring_mvc_unit_test.request.RegisterUserRequest;

@Controller
@RequestMapping("/registerUser")
public class RegisterUserController {

	@Autowired
	private RegisterUserService service;

	public boolean registerUser(RegisterUserRequest request) {
		return (service.registerUser(request.getId(), request.getName()) == RegisterUserService.SUCCESS);
	}
}
