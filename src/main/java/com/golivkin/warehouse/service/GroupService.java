package com.golivkin.warehouse.service;

import com.golivkin.warehouse.model.Group;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GroupService {

    List<Group> findAll();

    Group findById(Long id);

    void deleteById(Long id);

    void save(Group group);
}
