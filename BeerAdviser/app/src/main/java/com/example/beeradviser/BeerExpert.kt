package com.example.beeradviser

class BeerExpert {
    fun getBrands(color: String): List<String> {
        return when (color) {
            "amber" -> listOf("Jack Amber", "Red Moose")
            else -> listOf("Jail Pale Ale", "Gout Stout")
        }
    }
}