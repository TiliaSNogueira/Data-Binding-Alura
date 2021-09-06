package br.com.alura.ceep.ui.databinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import br.com.alura.ceep.ui.extensions.carregaImagem

@BindingAdapter("carregaImagem")
fun carregaImagemporURL(view: ImageView, url: String){
    view.carregaImagem(url)
}

//ou
//fun ImageView.carregaImagemporURL(view: ImageView, url: String){
//    carregaImagem(url)
//}