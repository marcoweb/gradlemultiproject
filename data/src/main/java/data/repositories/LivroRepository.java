package data.repositories;

import data.models.Livro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class LivroRepository {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("BibliotecaPU");
    private EntityManager em = emf.createEntityManager();

    public Livro fetch(int id) {
        return em.find(Livro.class, id);
    }
}
