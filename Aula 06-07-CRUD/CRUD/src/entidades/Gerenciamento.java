package entidades;

import java.util.ArrayList;

public class Gerenciamento {
    private ArrayList<Produtos> listaProdutos = new ArrayList();


    //create
    public void adicionarProdutos(Produtos produto){
        listaProdutos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    //read
    public void listarProdutos(){

        if(listaProdutos.isEmpty()){
            System.out.println("Nenhum produto cadastrado!");
        } else {
            System.out.printf(" | ID | NOME | PRECO | QUANTIDADE |\n");
            for (int i=0; i<listaProdutos.size(); i++){
                System.out.println("|" + i + listaProdutos.get(i));
            }
        }
    }

    //update
    public void alterarProdutos(int idProduto, String Produtos, double preco, int quantidade){

        Produtos produto = listaProdutos.get(idProduto);

        produto.setNome(Produtos);
        produto.setPreco(preco);
        produto.setQuantidade(quantidade);

        System.out.println("Produto alterado com sucesso!");
    }

    //delete
    public void removerProdutos(int idProduto){
        listaProdutos.remove(idProduto);
        System.out.println("Produto removido com sucesso!");
    }

}
