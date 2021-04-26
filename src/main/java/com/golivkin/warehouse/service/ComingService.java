package com.golivkin.warehouse.service;

import com.golivkin.warehouse.model.Coming;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ComingService {

    List<Coming> findAll();

    Coming findById(Long id);

    void deleteById(Long id);

    void save(Coming coming);
}
