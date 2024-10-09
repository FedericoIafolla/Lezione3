package com.evento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EventoDAO {

    private EntityManagerFactory entityManagerFactory;

    public EventoDAO() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("gestioneeventiPU");
    }

    public void save(Evento evento) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(evento);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public Evento getById(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Evento evento = entityManager.find(Evento.class, id);
        entityManager.close();
        return evento;
    }

    public void delete(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Evento evento = entityManager.find(Evento.class, id);
        if (evento != null) {
            entityManager.remove(evento);
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
