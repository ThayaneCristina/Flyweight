public class Autor {

    private String nomeAutor;
    private String nomeLivro;

    public Autor (String nomeAutor, String nomeLivro) {
        this.nomeAutor = nomeAutor;
        this.nomeLivro = nomeLivro;
    }
    public String getNomeAutor() {
        return nomeAutor;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }
}
