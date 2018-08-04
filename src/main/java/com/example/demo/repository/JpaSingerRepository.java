package com.example.demo.repository;

import com.example.demo.domain.Singer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class JpaSingerRepository implements SingerRepository{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Singer> findAll() {
        return entityManager
                .createNamedQuery(Singer.FIND_ALL, Singer.class)
                .getResultList();
    }

    @Override
    public List<Singer> findAllFetched() {
        return entityManager
                .createNamedQuery(Singer.FIND_ALL_FETCHED, Singer.class)
                .getResultList();
    }

    @Override
    public Singer findById(Long id) {
        return entityManager
                .createNamedQuery(Singer.FIND_BY_ID, Singer.class)
                .getSingleResult();
    }
}
