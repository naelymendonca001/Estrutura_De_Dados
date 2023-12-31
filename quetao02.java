import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] par = new int[20];
        int[] impar = new int[20];
        int countPar = 0, countImpar = 0;

        //ler 20 números inteiros
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            int number = scanner.nextInt();

            // Se o número for par
            if (number % 2 == 0) {
                par[countPar] = number;
                countPar++;
            } 
            // Se o número for ímpar
            else {
                impar[countImpar] = number;
                countImpar++;
            }
        }

        System.out.println("Números pares:");
        // imprimi os números pares
        for (int i = 0; i < countPar; i++) {
            System.out.println(par[i]);
        }

        System.out.println("Números impares:");
        // imprimi os números ímpares
        for (int i = 0; i < countImpar; i++) {
            System.out.println(impar[i]);
        }
    }
}