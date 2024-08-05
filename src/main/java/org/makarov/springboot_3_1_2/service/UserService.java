package org.makarov.springboot_3_1_2.service;

import org.makarov.springboot_3_1_2.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    void saveUser(User user);

    void deleteUser(Long id);
}
