package quartoCurso.excecao;

public class ErroAnoException extends RuntimeException {
    private String mensagem;

    public ErroAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}