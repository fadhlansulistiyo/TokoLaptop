package com.dicoding.tokolaptop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.dicoding.tokolaptop.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Check the current theme and set the ActionBar color accordingly
        when (resources.configuration.uiMode and android.content.res.Configuration.UI_MODE_NIGHT_MASK) {
            android.content.res.Configuration.UI_MODE_NIGHT_NO -> {
                // Light theme
                binding.appBarAbout.setBackgroundColor(ContextCompat.getColor(this, R.color.sage_light))
            }
            android.content.res.Configuration.UI_MODE_NIGHT_YES -> {
                // Dark theme
                binding.appBarAbout.setBackgroundColor(ContextCompat.getColor(this, R.color.grey_dark))
            }
        }
        setSupportActionBar(binding.appBarAbout)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}