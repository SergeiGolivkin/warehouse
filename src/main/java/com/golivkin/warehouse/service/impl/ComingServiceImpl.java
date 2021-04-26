package com.golivkin.warehouse.service.impl;

import com.golivkin.warehouse.model.Coming;
import com.golivkin.warehouse.repository.ComingRepository;
import com.golivkin.warehouse.service.ComingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ComingServiceImpl implements ComingService {

    public final ComingRepository comingRepository;

    public ComingServiceImpl(ComingRepository comingRepository) {
        this.comingRepository = comingRepository;
    }

    @Override
    public List<Coming> findAll() {
        return comingRepository.findAll();
    }

    @Override
    public Coming findById(Long id) {

        Coming coming = null;
        Optional<Coming> optional = comingRepository.findById(id);
        if (optional.isPresent()){
            coming = optional.get();
        }
        return coming;
    }

    @Override
    public void deleteById(Long id) {

        comingRepository.deleteById(id);
    }

    @Override
    public void save(Coming coming) {

        comingRepository.save(coming);
    }

}
