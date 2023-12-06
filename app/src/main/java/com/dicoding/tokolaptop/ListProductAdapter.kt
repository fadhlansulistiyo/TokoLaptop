package com.dicoding.tokolaptop

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dicoding.tokolaptop.databinding.ProductCardBinding

class ListProductAdapter(
    private val listProduct: List<Product>
) : RecyclerView.Adapter<ListProductViewHolder>() {

    private lateinit var binding: ProductCardBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListProductViewHolder {
        binding = ProductCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListProductViewHolder(binding)
    }

    override fun getItemCount(): Int = listProduct.size

    override fun onBindViewHolder(holder: ListProductViewHolder, position: Int) {
        val (name, type, desc, image, price, condition, weight, brand, releaseDate) = listProduct[position]

        Glide.with(holder.itemView.context)
            .load(image)
            .into(holder.binding.imgItemPhoto)

        holder.binding.tvItemName.text = name
        holder.binding.tvItemPrice.text = price

        // on item clicked
        holder.itemView.setOnClickListener {
            // detail product
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_PRODUCT, listProduct[holder.adapterPosition])
            holder.itemView.context.startActivity(intent)
        }
    }

}