package com.bombardier.macs.dao;

import com.bombardier.macs.model.Cahier;
import com.bombardier.macs.model.MasterPart;
import com.bombardier.macs.model.Workcenter;
import com.bombardier.macs.model.WorkcenterPart;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface WorkcenterPartRepository extends BaseRepository<WorkcenterPart, String> {

    Optional<WorkcenterPart> findByNumber(String number);
   
    List<WorkcenterPart> findByWorkcenter(Workcenter wc);
    List<WorkcenterPart> findByCahier(Cahier cahier);
    @Query(value="SELECT * FROM wc_part  WHERE id=?1", nativeQuery=true)
    List<WorkcenterPart> findPartById(String id);
  
    
}