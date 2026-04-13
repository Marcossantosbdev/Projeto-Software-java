import entidades.Produtos;
import entidades.Gerenciamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gerenciamento listaProdutos = new Gerenciamento();


        while (true) {
            System.out.println("GERENCIAMENTO DE PRODUTOS");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Alterar produto");
            System.out.println("4 - Remover produto");
            System.out.println("5 - sair");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1"-> {
                    System.out.println("Digite o nome do produto: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o valor do produto: ");
                    double valor = sc.nextDouble();

                    System.out.println("Digite a quantidade do produto: ");
                    int quantidade = sc.nextInt();

                    Produtos produto = new Produtos(nome, valor, quantidade);
                    listaProdutos.adicionarProdutos(produto);
                }

                case "2"-> {
                    System.out.println("PRODUTOS CADASTRADOS\n");
                    listaProdutos.listarProdutos();
                }

                case "3"-> {
                    System.out.println("ALTERAÇÃO DE PRODUTOS\nAQUI ESTÁ A LISTA DE PRODUTOS");
                    listaProdutos.listarProdutos();
                    int idProduto = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o nome do produto: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o valor do produto: ");
                    double valor = sc.nextDouble();

                    System.out.println("Digite a quantidade do produto: ");
                    int quantidade = sc.nextInt();

                    listaProdutos.alterarProdutos(idProduto, nome, valor, quantidade);
                }

                case "4"-> {
                    System.out.println("REMOÇÃO DE PRODUTOS\nAQUI ESTÁ A LISTA DE PRODUTOS");
                    listaProdutos.listarProdutos();

                    System.out.println("Digite o ID do produto: ");
                    int idProduto = sc.nextInt();
                    sc.nextLine();

                    listaProdutos.removerProdutos(idProduto);
                }

                case "5"-> {
                    System.out.println("Saindo do programa...");
                    return;
                }

            }
        }
    }
}