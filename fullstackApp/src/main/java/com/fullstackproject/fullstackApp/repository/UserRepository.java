package com.fullstackproject.fullstackApp.repository;

import com.fullstackproject.fullstackApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
