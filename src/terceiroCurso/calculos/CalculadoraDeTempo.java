package terceiroCurso.calculos;

import segundoCurso.modelos.Filme;

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

    public void inclui(Filme titulo){
        System.out.println("Adicionando duracao em minutos de: " + titulo.getNome());
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
