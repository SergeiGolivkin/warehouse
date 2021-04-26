package com.golivkin.warehouse.service;


import com.golivkin.warehouse.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> findAll();

    User findById(Long id);

    void deleteById(Long id);

    void save(User user);
}
