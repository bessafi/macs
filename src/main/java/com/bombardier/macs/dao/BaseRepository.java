package com.bombardier.macs.dao;

//import com.google.common.base.Optional;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends Repository<T, ID> {

    T save(T persisted);

    Optional<T> findOne(ID id);

    List<T> findAll();

    void delete(T deleted);
}