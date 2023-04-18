import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstanteTest {

    @Test
    void deveRetornarLivros() {
        Estante estante = new Estante();
        estante.addLivro("Fazendo Meu Filme", 336, "Paula Pimenta");
        estante.addLivro("Todo Dia é um Dia Especial", 144, "Max Lucado");
        estante.addLivro("Fazendo Meu Filme", 408, "Paula Pimenta");

        List<String> saida = Arrays.asList(
                "Livro{nome='Fazendo Meu Filme', páginas='336', autor='Paula Pimenta'}",
                "Livro{nome='Todo Dia é um Dia Especial', páginas='144', autor='Max Lucado'}",
                "Livro{nome='Fazendo Meu Filme', páginas='408', autor='Paula Pimenta'}");


        assertEquals(saida, estante.obterLivros());

    }

    @Test
    void deveRetornarTotalAutores() {
        Estante estante = new Estante();
        estante.addLivro("Fazendo Meu Filme", 336, "Paula Pimenta");
        estante.addLivro("Minha Vida Fora de Série", 408, "Paula Pimenta");
        estante.addLivro("Confissão", 80, "Paula Pimenta");
        estante.addLivro("Todo Dia é um Dia Especial", 144, "Max Lucado");

        assertEquals(2, AutorFactory.getTotalAutores());
    }

}
