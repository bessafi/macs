package com.bombardier.macs.dao;
import com.bombardier.macs.model.CahierAction;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public interface CahierActionRepository extends BaseRepository<CahierAction, Integer> { 
	Optional<CahierAction> findByType(String type);
}