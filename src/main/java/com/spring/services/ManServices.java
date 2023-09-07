package com.spring.services;

import com.spring.model.Man;
import com.spring.repository.ManRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManServices {

    @Autowired
    ManRepository manRepository;


    public List<Man> findAll() {
        return manRepository.findAll();
    }

    public Man findById(Long id) {
        return manRepository.findById(id).get();
    }


    public void insertMan(Man man) {
        manRepository.save(man);
    }
}
