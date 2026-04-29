package entidades;

import java.io.Serializable;

// Classe Pai
abstract class Produto implements Serializable {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public double calcularValorEstoque() {
        return preco * quantidade;
    }

    public abstract String getDescricao(); // Método Abstrato

    @Override
    public String toString() {
        return String.format("%s | %.2f | %d | %.2f | %s",
                nome, preco, quantidade, calcularValorEstoque(), getDescricao());
    }
}

// Filhas
class ProdutoEletronico extends Produto {
    private int garantiaMeses;
    public ProdutoEletronico(String n, double p, int q, int g) { super(n, p, q); this.garantiaMeses = g; }
    @Override public String getDescricao() { return "Garantia: " + garantiaMeses + " meses"; }
}

class ProdutoVestuario extends Produto {
    private String tamanho;
    public ProdutoVestuario(String n, double p, int q, String t) { super(n, p, q); this.tamanho = t; }
    @Override public String getDescricao() { return "Tamanho: " + tamanho; }
}

class ProdutoAlimenticio extends Produto {
    private String dataValidade;
    public ProdutoAlimenticio(String n, double p, int q, String d) { super(n, p, q); this.dataValidade = d; }
    @Override public String getDescricao() { return "Validade: " + dataValidade; }
}
