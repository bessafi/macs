package com.bombardier.macs.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bombardier.macs.model.Cahier;


import com.bombardier.macs.model.Workcenter;
import com.bombardier.macs.model.WorkcenterPart;


@Repository
public interface CahierRepository extends BaseRepository<Cahier, Long> {

    Optional<Cahier> findByName(String name);
    
   // Optional<Cahier> findByDescription(String description);
    List<Cahier> findByWorkcenter(Workcenter workcenter);
    
    @Query(value="SELECT * FROM cahier  WHERE id=?1", nativeQuery=true)
    List<Cahier> findCahierById(Long id);
  
   // List<Cahier> findBySector(Sector sector);
    
   // List<Cahier> findByProject(Project project);
    
}