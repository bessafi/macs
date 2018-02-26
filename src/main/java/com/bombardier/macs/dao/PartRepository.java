package com.bombardier.macs.dao;


import com.bombardier.macs.model.MasterPart;

import com.bombardier.macs.model.Workcenter;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PartRepository extends BaseRepository<MasterPart, String> {

    Optional<MasterPart> findByNumber(String number);

    /*  List<Part> findByCiLike(String likeCi); 
    List<Part> findByDescriptionLike(String likeDescr);*/
    
    List<MasterPart> findByPartNbr(Long partnbr);
   
    //@Query(value="SELECT * FROM part WHERE project_id=?1", nativeQuery=true)
    //List<Part> findByProjectId(Long projectId);
   // List<Part> findByProjectId(Long projectId);
   // List<Person> findByLastnameAndFirstnameAllIgnoreCase(String lastname, String firstname);

   // List<Part> findByProjectIdAndSectorId(Long projectId, Long sectorId);
    //List<Part> findByProjectIdAndSectorIdAndSubsectorId(Long projectId, Long sectorId, Long subsectorId);
    @Query(value="SELECT * FROM masterpart  WHERE project=?1 AND sector=?2 AND sub_sector=?3", nativeQuery=true)
    List<MasterPart> findByProjectIdAndSectorIdAndSubsectorId(String projectId, String sectorId, String subsectorId);
    List<MasterPart> findByWorkcenter(Workcenter wc);
    List<MasterPart> findByCahierId(Long cahierid);
    //List<Part> findByCahier(Cahier cahier);
    
   // List<Part> findByProject(Project project);
    
}