package data;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import data.models.Livro;

public class DataContext {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("BibliotecaPU");
    private EntityManager em = emf.createEntityManager();

    public Livro getLivro(int id) {
        return em.find(Livro.class, id);
    }

    public EntityManager getEntityManager() {
        return em;
    }
}
