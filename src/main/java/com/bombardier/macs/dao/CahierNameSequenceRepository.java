package com.bombardier.macs.dao;

import org.springframework.stereotype.Repository;

import com.bombardier.macs.model.CahierNameSequence;
//import com.google.common.base.Optional;

@Repository
public interface CahierNameSequenceRepository extends BaseRepository<CahierNameSequence, Long> {

	CahierNameSequence findBySequenceKey(String sequenceKey);
}