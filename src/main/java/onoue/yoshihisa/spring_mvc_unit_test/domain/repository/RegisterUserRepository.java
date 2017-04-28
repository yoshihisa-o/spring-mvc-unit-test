package onoue.yoshihisa.spring_mvc_unit_test.domain.repository;

import onoue.yoshihisa.spring_mvc_unit_test.domain.entity.User;

public interface RegisterUserRepository {
	public int registerUser(User user);
}
