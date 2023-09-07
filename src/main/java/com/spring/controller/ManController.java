package com.spring.controller;

import com.spring.model.Man;
import com.spring.services.ManServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ManController {

    @Autowired
    ManServices manServices;

    @GetMapping("/mans")
    public List<Man> findAll() {
        return manServices.findAll();
    }

    @GetMapping("/man")
    public Man findById(@RequestParam Long id) {
        return manServices.findById(id);
    }

    @PostMapping("/man")
    public void insertMan(@RequestBody Man man) {
        manServices.insertMan(man);
    }


}
