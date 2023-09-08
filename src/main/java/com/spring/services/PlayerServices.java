package com.spring.services;

import com.spring.model.Player;
import com.spring.model.projection.PlayerProjection;
import com.spring.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServices {


    @Autowired
    private PlayerRepository playerRepository;


    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    private Optional<Player> findById(Long id) {
        return playerRepository.findById(id);
    }

    public List<Player> findNameAndPositionSQL(){
        return playerRepository.findNameAndPositionSQL();
    }

    public List<Player> findNameAndPositionJPQL(Long id){
        return playerRepository.findNameAndPositionJPQL(id);
    }
    public List<PlayerProjection> getNameAngNumber(){
        return playerRepository.getNameAngNumber();
    }
    public void deleteP(Long id){
        playerRepository.deleteP(id);
    }


}
