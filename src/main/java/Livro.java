public class Livro {

    private Autor nomeLivro;
    private int paginas;

    public Livro(Autor nomeLivro, int paginas) {
        this.nomeLivro = nomeLivro;
        this.paginas = paginas;
    }

    public String obterLivro() {
        return "Livro{" +
                "nome='" + nomeLivro.getNomeLivro() + '\'' +
                ", páginas='" + this.paginas + '\'' +
                ", autor='" + nomeLivro.getNomeAutor() + '\'' +
                '}';
    }

}
