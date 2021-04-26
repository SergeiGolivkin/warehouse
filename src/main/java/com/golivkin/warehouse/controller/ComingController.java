package com.golivkin.warehouse.controller;

import com.golivkin.warehouse.model.Coming;
import com.golivkin.warehouse.service.ComingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ComingController {

    private final ComingService comingService;

    public ComingController(ComingService comingService) {
        this.comingService = comingService;
    }

    @GetMapping("/comings")
    public List<Coming> showAllComings(){

        return comingService.findAll();
    }

    @GetMapping("/comings/{id}")
    public Coming  getComing(@PathVariable Long id){
        return comingService.findById(id);
    }

    @PostMapping("/comings")
    public Coming addNewComing(@RequestBody Coming coming){
         comingService.save(coming);

         return coming;
    }

    @PutMapping("/comings")
    public Coming updateComing(@RequestBody Coming coming){
        comingService.save(coming);

        return coming;
    }

    @DeleteMapping("/comings/{id}")
    public void deleteComingById(@PathVariable Long id){

        comingService.deleteById(id);
    }

}
