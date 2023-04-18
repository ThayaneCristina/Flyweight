import java.util.HashMap;
import java.util.Map;

public class AutorFactory {

    private static Map<String, Autor> autores = new HashMap<>();

    public static Autor getAutor (String nomeAutor, String nomeLivro) {
        Autor autor = autores.get(nomeAutor);
        if (autor == null) {
            autor = new Autor(nomeAutor, nomeLivro);
            autores.put(nomeAutor, autor);
        }
        return autor;
    }

    public static int getTotalAutores() {
        return autores.size();
    }
}
