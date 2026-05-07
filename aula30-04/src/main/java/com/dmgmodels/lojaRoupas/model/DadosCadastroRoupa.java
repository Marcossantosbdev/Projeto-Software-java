package com.dmgmodels.lojaRoupas.model;

public record DadosCadastroRoupa(
        String nomeProduto,
        String marca,
        Tamanho tamanho,
        double preco,
        int quantidade
) {
}
