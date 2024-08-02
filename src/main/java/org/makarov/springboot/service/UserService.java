package org.makarov.springboot.service;

import org.makarov.springboot.model.User;


import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void saveUser(User user);
    void deleteUser(Long id);
}