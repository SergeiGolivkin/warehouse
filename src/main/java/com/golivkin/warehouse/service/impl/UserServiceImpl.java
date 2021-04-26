package com.golivkin.warehouse.service.impl;


import com.golivkin.warehouse.model.User;
import com.golivkin.warehouse.repository.UserRepository;
import com.golivkin.warehouse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    public final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {

        User user = null;
        Optional<User> optional = userRepository.findById(id);
        if (optional.isPresent()){
            user = optional.get();
        }
        return user;
    }

    @Override
    public void deleteById(Long id) {

        userRepository.deleteById(id);
    }

    @Override
    public void save(User user) {

        userRepository.save(user);
    }

}
