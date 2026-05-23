package com.spring.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User,Long> {

    UserDetails findBylogin(String role);
}
