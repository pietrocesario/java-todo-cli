import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        while (true) {
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Remover tarefa");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o enter

            if (opcao == 1) {
                System.out.println("Você escolheu ADICIONAR");
                System.out.print("Digite a tarefa: ");
                String tarefa = scanner.nextLine();
                tarefas.add(tarefa);
                System.out.println("Tarefa adicionada");

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
                System.out.println("Você escolheu REMOVER");

                if (tarefas.size() == 0) {
                    System.out.println("Nenhuma tarefa para remover");
                    continue;
                }

                // mostra a lista antes de remover
                for (int i = 0; i < tarefas.size(); i++) {
                    System.out.println((i + 1) + " - " + tarefas.get(i));
                }

                System.out.print("Digite o número da tarefa: ");
                int numero = scanner.nextInt();
                scanner.nextLine();

                int indice = numero - 1;

                if (indice < 0 || indice >= tarefas.size()) {
                    System.out.println("Número inválido");
                    continue;
                }

                String removida = tarefas.remove(indice);
                System.out.println("Removida: " + removida);

            } else if (opcao == 4) {
                System.out.println("Você escolheu SAIR");
                break;

            } else {
                System.out.println("Opção inválida");
            }
        }

        scanner.close();
    }
}
