package terceiroCurso.principal;

import terceiroCurso.modelos.Filme;
import terceiroCurso.modelos.Serie;
import terceiroCurso.modelos.Titulo;

import java.util.ArrayList;

public class MainComListas {
    public static void main(String[] args) {
        Filme filme = new Filme("Carros", 2007);
        filme.avalia(10);
        Filme filme2 = new Filme("Guardioes da galaxia 3", 2023);
        filme2.avalia(9);
        Filme filme3 = new Filme("GranTurismo", 2023);
        filme3.avalia(8);
        Serie serie = new Serie("Carros atraves da estrada", 2022);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie);

        for (Titulo item: lista){
            System.out.println(item);
            Filme titulo = (Filme) item;
            System.out.println(titulo.getClassificacao());
        }
    }
}