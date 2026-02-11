import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> contadorPalabras = new HashMap<>();

        System.out.println("Ingrese una oración:");
        String texto = scanner.nextLine();

        texto = texto.toLowerCase().replaceAll("[^a-záéíóúüñ0-9 ]", "");

        String[] palabras = texto.split("\\s+");

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                contadorPalabras.put(
                        palabra,
                        contadorPalabras.getOrDefault(palabra, 0) + 1
                );
            }
        }

        System.out.println("\nPalabras totales:");
        for (Map.Entry<String, Integer> entry : contadorPalabras.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        scanner.close();
    }
}
