package entidades;

public class Produtos {

    //Modelo
    private String nome;
    private double preco;
    private int quantidade;

    //Construtor

    public Produtos(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Setter

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //ToString

    public String toString() {
        return " | " + nome + " | " + preco + " | " + quantidade + " | ";
    }
}
