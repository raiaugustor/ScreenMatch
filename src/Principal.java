import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Filme;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");


        Serie lost = new Serie();
        lost.setNome("Lost");


        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");

        var filmeDoPaulo = new Filme();
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        //A direita dizemos o tipo que vamos armazenar e a esquerda chamamos o construtor com o new ArrayList<>();
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);System.out.println("Tamanho da lista" + listaDeFilmes.size());
        System.out.println("Primeiro filme" + listaDeFilmes.get(0).getNome());


    }
}