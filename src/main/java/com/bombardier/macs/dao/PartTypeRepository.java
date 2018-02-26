package com.bombardier.macs.dao;
import com.bombardier.macs.model.PartType;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public interface PartTypeRepository extends BaseRepository<PartType, Integer> { 
	Optional<PartType> findByType(String type);
}