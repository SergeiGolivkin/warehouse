package com.golivkin.warehouse.service.impl;


import com.golivkin.warehouse.model.Consumption;
import com.golivkin.warehouse.repository.ConsumptionRepository;
import com.golivkin.warehouse.service.ConsumptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ConsumptionServiceImpl implements ConsumptionService {


    public final ConsumptionRepository consumptionRepository;

    public ConsumptionServiceImpl(ConsumptionRepository consumptionRepository) {
        this.consumptionRepository = consumptionRepository;
    }

    @Override
    public List<Consumption> findAll() {
        return consumptionRepository.findAll();
    }

    @Override
    public Consumption findById(Long id) {

        Consumption consumption = null;
        Optional<Consumption> optional = consumptionRepository.findById(id);
        if (optional.isPresent()){
            consumption = optional.get();
        }
        return consumption;
    }

    @Override
    public void deleteById(Long id) {

        consumptionRepository.deleteById(id);
    }

    @Override
    public void save(Consumption consumption) {

        consumptionRepository.save(consumption);
    }
}
