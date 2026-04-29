package entidades;

public class ProdutoAlimenticio extends Produto {
    //Validade
    private int dia;
    private int mes;
    private int ano;

    public ProdutoAlimenticio(String nome, double preco, int quantidade, int dia, int mes, int ano) {
        super(nome, preco, quantidade);
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String getDescricao() {
        return "Dia " + dia + ", Mes " + mes + ", Ano " + ano;
    }

}
