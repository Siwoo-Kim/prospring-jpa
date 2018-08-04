package com.example.demo.repository;

import com.example.demo.domain.Singer;

import java.util.List;

public interface SingerRepository {

    List<Singer> findAll();
    List<Singer> findAllFetched();
    Singer findById(Long id);

}
