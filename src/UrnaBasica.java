import java.util.Scanner;

public class UrnaBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int votosC1 = 0, votosC2 = 0, votosC3 = 0;
        int totalVotos = 0;

        System.out.println("Ingresa el número del candidato (1, 2, 3). Ingresa 0 para terminar:");

        int voto = sc.nextInt();
        while (voto != 0) {
            if (voto == 1) {
                votosC1++;
            } else if (voto == 2) {
                votosC2++;
            } else if (voto == 3) {
                votosC3++;
            } else {
                System.out.println("Número inválido.");
            }
            totalVotos++;
            voto = sc.nextInt(); 
        }

        System.out.println("Total de votos: " + totalVotos);

        if (totalVotos > 0) {
            System.out.println("Candidato 1: " + (votosC1 * 100 / totalVotos) + "%");
            System.out.println("Candidato 2: " + (votosC2 * 100 / totalVotos) + "%");
            System.out.println("Candidato 3: " + (votosC3 * 100 / totalVotos) + "%");
        } else {
            System.out.println("No hubo votos.");
        }

        sc.close();
    }
}

