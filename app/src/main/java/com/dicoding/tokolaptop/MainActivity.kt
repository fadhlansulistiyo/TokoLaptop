package com.dicoding.tokolaptop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.dicoding.tokolaptop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Check the current theme and set the ActionBar color accordingly
        when (resources.configuration.uiMode and android.content.res.Configuration.UI_MODE_NIGHT_MASK) {
            android.content.res.Configuration.UI_MODE_NIGHT_NO -> {
                // Light theme
                binding.appBar.setBackgroundColor(ContextCompat.getColor(this, R.color.sage_light))
            }
            android.content.res.Configuration.UI_MODE_NIGHT_YES -> {
                // Dark theme
                binding.appBar.setBackgroundColor(ContextCompat.getColor(this, R.color.grey_dark))
            }
        }
        setSupportActionBar(binding.appBar)

        // show product list
        showRecyclerList()
    }

    private fun showRecyclerList() {
        val rvProduct = binding.rvLaptopShop
        val productData = ProductData.getProductData()
        val productAdapter = ListProductAdapter(productData)

        rvProduct.adapter = productAdapter
        rvProduct.layoutManager = GridLayoutManager(this, 2)
        rvProduct.setHasFixedSize(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.about_page) {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}