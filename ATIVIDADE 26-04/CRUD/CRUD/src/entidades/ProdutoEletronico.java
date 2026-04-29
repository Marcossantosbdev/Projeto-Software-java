package entidades;

public class ProdutoEletronico  extends Produto{
    //Garantia
    private int garantiaMeses;

    public ProdutoEletronico(String nome, double preco, int quantidade, int garantiaMeses) {
        super(nome, preco, quantidade);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String getDescricao() {
        return  "Garantia " + garantiaMeses + "meses";
    }
}
