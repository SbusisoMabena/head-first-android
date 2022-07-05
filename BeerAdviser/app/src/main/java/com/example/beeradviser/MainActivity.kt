package com.example.beeradviser

import androidx.appcompat.app.AppCompatActivity
import com.example.beeradviser.BeerExpert
import android.os.Bundle
import android.view.View
import com.example.beeradviser.R
import android.widget.Spinner
import android.widget.TextView
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    private val expert = BeerExpert()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickFindBeer(view: View?) {
        val color = findViewById<Spinner>(R.id.color)
        val brands = findViewById<TextView>(R.id.brands)
        val beerType = color.selectedItem.toString()
        val brandsList = expert.getBrands(beerType)
        val brandsFormatted = brandsList.reduce { str, item -> str + '\n' + item }
        brands.text = brandsFormatted
    }
}