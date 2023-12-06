package com.dicoding.tokolaptop

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.tokolaptop.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityDetailBinding

    // get data if item clicked
    companion object {
        const val EXTRA_PRODUCT = "extra_product"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Check the current theme and set the ActionBar color accordingly
        when (resources.configuration.uiMode and android.content.res.Configuration.UI_MODE_NIGHT_MASK) {
            android.content.res.Configuration.UI_MODE_NIGHT_NO -> {
                // Light theme
                binding.appBarDetail.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        R.color.sage_light
                    )
                )
            }

            android.content.res.Configuration.UI_MODE_NIGHT_YES -> {
                // Dark theme
                binding.appBarDetail.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        R.color.grey_dark
                    )
                )
            }
        }

        setSupportActionBar(binding.appBarDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // get data if item clicked
        val data = if (Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra(EXTRA_PRODUCT, Product::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra(EXTRA_PRODUCT)
        }

        // set data
        if (data != null) {
            Glide.with(this)
                .load(data.image)
                .apply(RequestOptions())
                .into(binding.ivImage)

            binding.tvName.text = data.name
            binding.tvType.text = data.type
            binding.tvDesc.text = data.desc
            binding.tvPrice.text = data.price
            binding.tvCondition.text = data.condition
            binding.tvWeight.text = data.weight
            binding.tvBrand.text = data.brand
            binding.tvReleaseDate.text = data.releaseDate
        }

        binding.btnAdd.setOnClickListener(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_detail, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_share) {
            // get data
            val data = if (Build.VERSION.SDK_INT >= 33) {
                intent.getParcelableExtra(EXTRA_PRODUCT, Product::class.java)
            } else {
                @Suppress("DEPRECATION")
                intent.getParcelableExtra(EXTRA_PRODUCT)
            }

            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                val content = "${data?.name}, \n\n${data?.desc}, \n\n${data?.price}"
                putExtra(Intent.EXTRA_TEXT, content)
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_add) {
            Toast.makeText(this, "Successfully added to cart.", Toast.LENGTH_SHORT).show()
        }
    }
}