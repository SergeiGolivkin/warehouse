package com.golivkin.warehouse.controller;


import com.golivkin.warehouse.model.Group;
import com.golivkin.warehouse.service.GroupService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GroupController {
    private final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping("/groups")
    public List<Group> showAllGroups(){

        return groupService.findAll();
    }

    @GetMapping("/groups/{id}")
    public Group  getGroup(@PathVariable Long id){
        return groupService.findById(id);
    }

    @PostMapping("/groups")
    public Group addNewGroup(@RequestBody Group group){
        groupService.save(group);

        return group;
    }

    @PutMapping("/groups")
    public Group updateGroup(@RequestBody Group group){
        groupService.save(group);

        return group;
    }

    @DeleteMapping("/groups/{id}")
    public void deleteGroupById(@PathVariable Long id){

        groupService.deleteById(id);
    }
}
