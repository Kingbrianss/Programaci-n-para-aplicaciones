import java.util.Scanner;

public class App {
    
    public static void verificarNumero(int numero) throws Exception {
        if (numero % 2 != 0) {
            throw new Exception(" es impar.");
        } else {
            System.out.println("es par.");
        }
    }

    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce un número entero: ");
            int numero = scanner.nextInt();

            try {
                verificarNumero(numero);
            } catch (Exception e) {
                System.out.println("Excepción capturada: " + e.getMessage());
            }
        }
    }
}
