package com.golivkin.warehouse.service.impl;


import com.golivkin.warehouse.model.Group;
import com.golivkin.warehouse.repository.GroupRepository;
import com.golivkin.warehouse.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class GroupServiceImpl implements GroupService {

    public final GroupRepository groupRepository;

    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public List<Group> findAll() {
        return groupRepository.findAll();
    }

    @Override
    public Group findById(Long id) {

        Group group = null;
        Optional<Group> optional = groupRepository.findById(id);
        if (optional.isPresent()){
            group = optional.get();
        }
        return group;
    }

    @Override
    public void deleteById(Long id) {

        groupRepository.deleteById(id);
    }

    @Override
    public void save(Group group) {

        groupRepository.save(group);
    }

}
