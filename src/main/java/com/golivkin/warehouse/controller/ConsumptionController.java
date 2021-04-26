package com.golivkin.warehouse.controller;


import com.golivkin.warehouse.model.Consumption;
import com.golivkin.warehouse.service.ConsumptionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ConsumptionController {
    private final ConsumptionService consumptionService;

    public ConsumptionController(ConsumptionService consumptionService) {
        this.consumptionService = consumptionService;
    }

    @GetMapping("/consumptions")
    public List<Consumption> showAllConsumptions(){

        return consumptionService.findAll();
    }

    @GetMapping("/consumptions/{id}")
    public Consumption  getConsumption(@PathVariable Long id){
        return consumptionService.findById(id);
    }

    @PostMapping("/consumptions")
    public Consumption addNewConsumption(@RequestBody Consumption consumption){
        consumptionService.save(consumption);

        return consumption;
    }

    @PutMapping("/consumptions")
    public Consumption updateConsumption(@RequestBody Consumption consumption){
        consumptionService.save(consumption);

        return consumption;
    }

    @DeleteMapping("/consumptions/{id}")
    public void deleteConsumptionById(@PathVariable Long id){

        consumptionService.deleteById(id);
    }
}
