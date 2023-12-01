
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            String[] nomes = new String[10];
    
            // Lendo o vetor com 10 nomes de pessoas
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o nome " + (i + 1) + ": ");
                nomes[i] = scanner.nextLine();
            }
    
            // Peça que o usuário digite um nome de pessoa que deve ser buscado ao vetor
            System.out.print("Digite um nome para buscar: ");
            String nomeBuscado = scanner.nextLine();
    
            // Buscando o nome no vetor
            boolean achou = false;
            for (int i = 0; i < 10; i++) {
                if (nomes[i].equalsIgnoreCase(nomeBuscado)) {
                    achou = true;
                    break;
                }
            }
    
            // Exibindo a mensagem de resultado
            if (achou) {
                System.out.println("ACHEI");
            } else {
                System.out.println("NÃO ACHEI");
            }
    
            scanner.close();
        }
    } 

