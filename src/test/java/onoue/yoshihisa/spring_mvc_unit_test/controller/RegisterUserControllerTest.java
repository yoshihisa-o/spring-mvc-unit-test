package onoue.yoshihisa.spring_mvc_unit_test.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import onoue.yoshihisa.spring_mvc_unit_test.controller.RegisterUserController;
import onoue.yoshihisa.spring_mvc_unit_test.request.RegisterUserRequest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
//ApplicationContext will be loaded from "classpath:/test-application-config.xml
@ContextConfiguration(locations="/test-application-config.xml")
public class RegisterUserControllerTest {
	// Never use "new" to instantiate. Otherwise Autowire in the following class will not work.
	@Autowired
	RegisterUserController controller;

	@Test
	public void register_user_success() {
		RegisterUserRequest request = new RegisterUserRequest();
		request.setId("test_user_id");
		request.setName("Test User");
		boolean result = controller.registerUser(request);
		assertThat(result, is(true));
	}
}
