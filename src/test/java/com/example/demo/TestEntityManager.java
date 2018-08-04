package com.example.demo;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;

import static org.junit.Assert.assertNotNull;

public class TestEntityManager {


    @Test
    public void entityManger() {
        ApplicationContext c = new ClassPathXmlApplicationContext("spring/jpa-context.xml");
        assertNotNull(c.getBean(EntityManagerFactory.class));
        assertNotNull(c.getBean(PlatformTransactionManager.class));

        c = new AnnotationConfigApplicationContext(JpaConfiguration.class);
        assertNotNull(c.getBean(EntityManagerFactory.class));
        assertNotNull(c.getBean(PlatformTransactionManager.class));
    }
}
