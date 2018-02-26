package com.bombardier.macs.dao;

import com.bombardier.macs.model.Jalon;
//import com.google.common.base.Optional;

import java.util.Optional;

import org.springframework.stereotype.Repository;


@Repository
public interface JalonRepository extends BaseRepository<Jalon, Long> {

    Optional<Jalon> findByTitle(String title);
    
    //List<Jalon>  findByCahier(Cahier cahier);
    
   // List<Jalon>  findByWorkcenter(Workcenter workcenter);
    
}