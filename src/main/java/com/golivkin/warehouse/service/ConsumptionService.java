package com.golivkin.warehouse.service;


import com.golivkin.warehouse.model.Consumption;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ConsumptionService  {

    List<Consumption> findAll();

    Consumption findById(Long id);

    void deleteById(Long id);

    void save(Consumption consumption);
}
