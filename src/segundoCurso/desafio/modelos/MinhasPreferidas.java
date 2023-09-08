package segundoCurso.desafio.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() > 8){
            System.out.println(audio.getTitulo() + " eh considerado um sucesso!");
        }else{
            System.out.println(" curtido por todos!");
        }
    }
}
