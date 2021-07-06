package br.com.alura.orgs.extensions

import android.widget.ImageView
import coil.load

fun ImageView.tentaCarregarImagem(url: String? = null){
    load(url) {
        fallback(br.com.alura.orgs.R.drawable.erro)
        error(br.com.alura.orgs.R.drawable.erro)
        placeholder(br.com.alura.orgs.R.drawable.placeholder)
    }
}