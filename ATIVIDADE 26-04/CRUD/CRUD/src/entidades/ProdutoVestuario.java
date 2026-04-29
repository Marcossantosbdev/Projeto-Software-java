package entidades;

public class ProdutoVestuario extends Produto {
    //Tamanho
    private String tamanhoVestuario;

    public ProdutoVestuario(String nome, double preco, int quantidade, String tamanhoVestuario) {
        super(nome, preco, quantidade);
        this.tamanhoVestuario = tamanhoVestuario;
    }

    @Override
    public String getDescricao() {
        return "Tamanho " + tamanhoVestuario;
    }
}
