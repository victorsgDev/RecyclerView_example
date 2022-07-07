package com.example.recyclerview_superheroes


import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_superheroes.databinding.ItemSuperheroListBinding
import com.squareup.picasso.Picasso


class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding=ItemSuperheroListBinding.bind(view)

    fun bind(superhero:Superhero){
        binding.tvSuperhero.text = superhero.superhero
        binding.tvRealName.text = superhero.realName
        binding.tvPublisher.text = superhero.publisher
        binding.ivAvatar.loadUrl(superhero.photo)
    }
    fun ImageView.loadUrl(url: String) {
        Picasso.get().load(url).into(this)
    }
}