import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // cria um “leitor”. System.in é o teclado/entrada do console

        ArrayList <String> tarefas = new ArrayList<>();

        while (true) {
        System.out.println("1 - Adicionar tarefa");
        System.out.println("2 - Listar tarefas");
        System.out.println("3 - Sair");
        System.out.print("Escolha: ");

        int opcao = scanner.nextInt();  // lê um número inteiro que você digitou e guarda na variável opcao

        if (opcao == 1) {
            scanner.nextLine();
            System.out.println("Você escolheu ADICIONAR");
            System.out.println("Digite a tarefa: ");
            String tarefa = scanner.nextLine();
        System.out.println("Tarefa adicionada");
        tarefas.add(tarefa);

        } else if (opcao == 2) {
            System.out.println("Você escolheu LISTAR");

            if (tarefas.size() == 0) {
                System.out.println("Nenhuma tarefa cadastrada");
            } else {
                for (int i = 0; i < tarefas.size(); i++) {
                    System.out.println((i + 1) + " - " + tarefas.get(i));
                }
            }

        } else if (opcao == 3) {
            System.out.println("Você escolheu SAIR");
            break;
        }
        else {
            System.out.println("Opção inválida");
            }
        }
    scanner.close();
    }
}
