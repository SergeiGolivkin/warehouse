package com.golivkin.warehouse.repository;

import com.golivkin.warehouse.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GroupRepository extends JpaRepository<Group,Long> {
}
