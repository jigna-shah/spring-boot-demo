package demo.service;

import demo.model.User;

public interface UserService {
	void save(User user);

    User findByUsername(String username);
}
