package com.bombardier.macs.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bombardier.macs.model.Backend2UIMapping;

@Repository
public interface Backend2UIMappingRepository extends BaseRepository<Backend2UIMapping, Long> {
	
	@Query(value="SELECT uidCode FROM backend_ui_mapping  WHERE backEndCode=?1", nativeQuery=true)
    String findByBackendCode(String backEndCode);
	@Query(value="SELECT backEndCode FROM backend_ui_mapping  WHERE uidCode=?1", nativeQuery=true)
    String findByUICode(String backEndCode);
}