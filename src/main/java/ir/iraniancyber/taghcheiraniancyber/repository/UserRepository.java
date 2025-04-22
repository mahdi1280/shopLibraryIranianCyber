package ir.iraniancyber.taghcheiraniancyber.repository;

import ir.iraniancyber.taghcheiraniancyber.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsernameAndPassword(String username, String password);

    User findByUsername(String username);
}
