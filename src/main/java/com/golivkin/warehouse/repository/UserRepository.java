package com.golivkin.warehouse.repository;

import com.golivkin.warehouse.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
}
