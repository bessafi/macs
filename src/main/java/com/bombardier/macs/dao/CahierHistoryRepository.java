package com.bombardier.macs.dao;

import com.bombardier.macs.model.CahierHistory;

import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface CahierHistoryRepository extends BaseRepository<CahierHistory, Long> {
	 List<CahierHistory> findByActionId(Integer actionId);
    
}