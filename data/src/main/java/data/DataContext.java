package data;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DataContext {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("BibliotecaPU");
    private EntityManager em = emf.createEntityManager();

    public EntityManager getEntityManager() {
        return em;
    }
}
