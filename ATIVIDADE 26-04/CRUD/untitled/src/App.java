import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) {
        GerenciarProdutos gerencia = new GerenciarProdutos();
        Scanner sc = new Scanner(System.in);
        int op = 0;

        do {
            try {
                System.out.println("\n=== MENU DE OPÇÕES ===");
                System.out.println("1-Eletrônico 2-Vestuário 3-Alimentício 4-Listar 5-Atualizar 6-Remover 7-Sair");
                op = sc.nextInt();
                sc.nextLine();

                if (op >= 1 && op <= 3) {
                    System.out.print("Nome: "); String nome = sc.nextLine();
                    System.out.print("Preço: "); double preco = sc.nextDouble();
                    System.out.print("Qtd: "); int qtd = sc.nextInt();
                    sc.nextLine();

                    if (op == 1) {
                        System.out.print("Garantia (meses): "); int g = sc.nextInt();
                        gerencia.cadastrarProduto(new ProdutoEletronico(nome, preco, qtd, g));
                    } else if (op == 2) {
                        System.out.print("Tamanho: "); String t = sc.nextLine();
                        gerencia.cadastrarProduto(new ProdutoVestuario(nome, preco, qtd, t));
                    } else {
                        System.out.print("Validade: "); String v = sc.nextLine();
                        gerencia.cadastrarProduto(new ProdutoAlimenticio(nome, preco, qtd, v));
                    }
                } else if (op == 4) {
                    gerencia.listarProdutos();
                } else if (op == 5) {
                    System.out.print("ID para atualizar: "); int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Novo Nome: "); String n = sc.nextLine();
                    System.out.print("Novo Preço: "); double p = sc.nextDouble();
                    System.out.print("Nova Qtd: "); int q = sc.nextInt();
                    gerencia.atualizarProduto(id, n, p, q);
                } else if (op == 6) {
                    System.out.print("ID para remover: "); int id = sc.nextInt();
                    gerencia.removerProduto(id);
                }

            } catch (InputMismatchException e) {
                System.err.println("ERRO: Valor inválido inserido!");
                sc.nextLine(); // Limpa buffer
            }
        } while (op != 7);
    }
}