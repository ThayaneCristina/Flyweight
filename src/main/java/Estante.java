import java.util.ArrayList;
import java.util.List;

public class Estante {

    private List<Livro> livros = new ArrayList<>();

    public void addLivro (String nomeLivro, int paginas, String nomeAutor) {
        Autor autor = AutorFactory.getAutor(nomeAutor, nomeLivro);
        Livro livro = new Livro(autor, paginas);
        livros.add(livro);
    }

    public List<String> obterLivros() {
        List<String> saida = new ArrayList<String>();
        for (Livro livro : this.livros) {
            saida.add(livro.obterLivro());
        }
        return saida;
    }

}
