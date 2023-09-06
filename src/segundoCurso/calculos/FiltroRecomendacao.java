package segundoCurso.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Esta entre os preferidos da galera");
        } else if(classificavel.getClassificacao() >= 3){
            System.out.println("Muito bem avaliado");
        } else {
            System.out.println("Coloque na sua lista para ver dps");
        }
    }
}
