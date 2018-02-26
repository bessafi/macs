package com.bombardier.macs.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bombardier.macs.model.Workcenter;


@Repository  
public interface WorkcenterRepository extends BaseRepository<Workcenter, Long> {

    Optional<Workcenter> findByTitle(String name);

    List<Workcenter> findByTitleLike(String likeName);
    List<Workcenter> findBySubSectorId(String subsectorId);
    List<Workcenter> findBySectorId(String sectorId);
    
    
    List<Workcenter> findByProjectId(String projectId);
   
    @Query(value="SELECT * FROM workcenter  WHERE projectid=?1 AND wcnumber=?2", nativeQuery=true)
    List<Workcenter> findByProjectIdAndWcId(String projectId, String wcId);
  
    @Query(value="SELECT * FROM workcenter  WHERE projectid=?1 AND sectorid=?2 AND subsectorid=?3 AND wcnumber=?4", nativeQuery=true)
    Optional<Workcenter> findByProjectIdSectorIdSubSectorIdAndNumber(String projectId,String  sectorId, String subsectorId,  String number);
  
    
    @Query(value="SELECT * FROM workcenter  WHERE projectid=?1 AND sectorid=?2", nativeQuery=true)
    List<Workcenter> findByProjectIdAndSectorId(String projectId, String sectorId);
  
    @Query(value="SELECT * FROM workcenter  WHERE projectid=?1 AND sectorid=?2 AND subsectorid=?3", nativeQuery=true)
    List<Workcenter> findByProjectIdAndSectorIdAndSubsectorId(String projectId, String sectorId, String subsectorId);
    
   // List<Cahier> findByWorkcenter(Workcenter workcenter);
}