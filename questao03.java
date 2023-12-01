
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] matrizC = new int[3][3];

        // Lendo a matriz A
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o elemento [" + i + "][" + j + "] da matriz A:");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // Lendo a matriz B
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o elemento [" + i + "][" + j + "] da matriz B:");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Realizando a multiplicação das matrizes A x B = C
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizC[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Exibindo a matriz resultante C
        System.out.println("A matriz resultante C é:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }
    }
}

