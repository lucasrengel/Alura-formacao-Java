package quartoCurso.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import quartoCurso.modelos.Titulo;
import quartoCurso.modelos.TituloOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um filme: ");
        var filme = scanner.nextLine();
        String endereco = "https://omdbapi.com/?t="+ filme.replace(" ", "+") +"&apikey=80d6e48a";

        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

            TituloOmdb meuTituloOmbd = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmbd);
            //try {
            Titulo meuTitulo = new Titulo(meuTituloOmbd);
            System.out.println("Titulo convertido");
            System.out.println(meuTitulo);
        }catch (NumberFormatException e){
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("Algum erro de argumento na busca, verifique o endereco.");
        }catch (Exception e){

        }

        System.out.println("Programa finalizado!");
    }
}
