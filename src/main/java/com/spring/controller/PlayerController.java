package com.spring.controller;


import com.spring.model.Player;
import com.spring.model.projection.PlayerProjection;
import com.spring.services.PlayerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {


    @Autowired
    private PlayerServices playerServices;


    @GetMapping("/players")
    public List<Player> findAll() {
        return playerServices.findAll();
    }

    @GetMapping("/pp")
    public List<Player> findNameAndPositionSQL() {
        return playerServices.findNameAndPositionSQL();
    }

    @GetMapping("/ppp")
    public List<Player> findNameAndPositionJPQL(@RequestParam Long id) {
        return playerServices.findNameAndPositionJPQL(id);
    }
    @GetMapping("/pppp")
    public List<PlayerProjection> getNameAngNumber(){
      return   playerServices.getNameAngNumber();
    }

    @DeleteMapping("/pp")
    public void deleteP( @RequestParam Long id){
        playerServices.deleteP(id);
    }
}
