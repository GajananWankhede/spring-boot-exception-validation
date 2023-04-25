package com.med.validation.repository;

import com.med.validation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Integer> {
    User findByUserId(int id);
}
