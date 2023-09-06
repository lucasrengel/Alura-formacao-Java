package primeiroCurso;

public class Temperatura {
    public static void main(String[] args) {
        double celsius = 16;
        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println(celsius + " graus em Celsius equivale a: " + fahrenheit + " graus em fahreinheit");

        int fahrenheitInt = (int) fahrenheit;

        System.out.println("Temperatura inteira em Fahreinheit: " + fahrenheitInt);
    }
}
