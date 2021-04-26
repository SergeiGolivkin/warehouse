package com.golivkin.warehouse.repository;

import com.golivkin.warehouse.model.Consumption;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ConsumptionRepository extends JpaRepository<Consumption, Long> {
}
