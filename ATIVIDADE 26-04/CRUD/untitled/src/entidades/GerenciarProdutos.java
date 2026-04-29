package entidades;

import java.io.*;
import java.util.ArrayList;

public class GerenciarProdutos {
    private ArrayList<Produto> lista = new ArrayList<>();
    private final String ARQUIVO = "produtos.txt";

    public void cadastrarProduto(Produto produto) {
        lista.add(produto);
        salvarNoArquivo();
    }

    public void listarProdutos() {
        System.out.println("\nID | Nome | Preço | Qtd | Estoque | Descrição");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " | " + lista.get(i));
        }
    }

    public void atualizarProduto(int id, String nome, double preco, int quantidade) {
        if (id >= 0 && id < lista.size()) {
            Produto p = lista.get(id);
            p.setNome(nome);
            p.setPreco(preco);
            p.setQuantidade(quantidade);
            salvarNoArquivo();
            System.out.println("Produto atualizado!");
        } else {
            System.out.println("ID inválido.");
        }
    }

    public void removerProduto(int id) {
        if (id >= 0 && id < lista.size()) {
            lista.remove(id);
            salvarNoArquivo();
            System.out.println("Produto removido!");
        }
    }

    // Persistência Simples (Salvando como String para o TXT ser legível)
    private void salvarNoArquivo() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARQUIVO))) {
            for (Produto p : lista) {
                writer.println(p.toString());
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar: " + e.getMessage());
        }
    }
}