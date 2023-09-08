package com.spring.repository;

import com.spring.model.Player;
import com.spring.model.projection.PlayerProjection;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface PlayerRepository extends JpaRepository<Player, Long> {


    @Query(value = "select pla from Player pla where pla.id = :id")
    public List<Player> findNameAndPositionJPQL(Long id);


    @Query(value = " select * from player", nativeQuery = true)
    public List<Player> findNameAndPositionSQL();


    @Query(value = "select pla from Player pla")
    public List<PlayerProjection> getNameAngNumber();


    @Transactional //must in updatable methods
    @Modifying  //must in updatable methods
    @Query(value = "delete  from Player p where p.id = :id")
    public void deleteP(Long id);

}
