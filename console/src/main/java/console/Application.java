package console;

import data.models.Livro;
import data.repositories.LivroRepository;

public class Application {
    public static void main(String[] args) {
        LivroRepository repo = new LivroRepository();

        Livro livro = repo.fetch(1);

        System.out.println(livro.getTitulo());
    }
}
