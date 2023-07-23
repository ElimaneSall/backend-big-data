package com.example.backendweather;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class LogImpl {

    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("puMeteo");

    public LogEntity saveLog(LogEntity logEntity) {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction et = null;
        try {
            et = em.getTransaction();
            et.begin();
            em.persist(logEntity);
            et.commit();
        } catch (RuntimeException e) {
            if (et != null && et.isActive()) {
                et.rollback();
            }
            throw e;
        } finally {
            em.close();
        }
//        System.out.println("Success");
        return logEntity;
    }

    public List<LogEntity> getAllLogs() {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        try {
            return em.createQuery("SELECT c FROM LogEntity c order by c.dateLog desc ", LogEntity.class).getResultList();
        } finally {
            em.close();
        }
    }
}
