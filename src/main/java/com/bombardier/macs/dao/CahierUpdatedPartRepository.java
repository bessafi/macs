package com.bombardier.macs.dao;

import com.bombardier.macs.model.CahierUpdatedPart;
import com.bombardier.macs.model.WorkcenterPart;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface CahierUpdatedPartRepository extends BaseRepository<CahierUpdatedPart, Long> {
	List<CahierUpdatedPart> findByPart(WorkcenterPart wcpart);
}