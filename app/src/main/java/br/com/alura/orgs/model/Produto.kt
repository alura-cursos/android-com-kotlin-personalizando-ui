package br.com.alura.orgs.model

import java.math.BigDecimal

data class Produto(
        val nome: String,
        val descricao: String,
        val valor: BigDecimal
)
