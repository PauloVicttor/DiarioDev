package com.paulovictor.DiarioDev.repositories;

import com.paulovictor.DiarioDev.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long > {
    static User save() {
    }

    User FindyUserName(String login);

    User findByUsername(String name);
}
