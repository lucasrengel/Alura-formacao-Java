package terceiroCurso.calculos;

import segundoCurso.modelos.Filme;
import terceiroCurso.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duracao em minutos de: " + titulo.getNome());
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
