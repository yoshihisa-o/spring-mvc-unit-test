package onoue.yoshihisa.spring_mvc_unit_test.domain.service;

public interface RegisterUserService {
	public static final int SUCCESS = 0;
	public static final int FAIL = 1;

	public int registerUser(String id, String name);
}
