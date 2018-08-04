package com.example.demo.repository;

import com.example.demo.JpaConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class TestJpaSingerRepository {

    SingerRepository singerRepository;

    @Before
    public void setup() {
        singerRepository = new AnnotationConfigApplicationContext(JpaConfiguration.class)
                .getBean(SingerRepository.class);
    }

    @Test
    public void findAll() {
        assertEquals(singerRepository.findAll().size(), 3);
        System.out.println(singerRepository.findAll());
        assertEquals(singerRepository.findAllFetched().get(0).getAlbums().size(), 2);
        System.out.println(singerRepository.findAllFetched().get(0).getAlbums());
    }
}
