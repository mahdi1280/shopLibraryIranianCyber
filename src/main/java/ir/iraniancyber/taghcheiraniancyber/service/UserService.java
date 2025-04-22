package ir.iraniancyber.taghcheiraniancyber.service;

import ir.iraniancyber.taghcheiraniancyber.model.User;

import java.util.List;

public interface UserService {

    void save(User user);

    User findByUsernameAndPassword(String username, String password);

    List<User> findAll();

    boolean existsByUsername(String username);
}
