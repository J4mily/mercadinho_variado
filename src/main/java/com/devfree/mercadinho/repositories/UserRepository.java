package com.devfree.mercadinho.repositories;

import com.devfree.mercadinho.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> finUsers();
}
