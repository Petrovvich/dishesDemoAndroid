package ru.petrovvich.time.myapplication

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val ROUND_VALUE = 7f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setCornerRadius()
    }

    private fun setCornerRadius() {
        val meal = BitmapFactory.decodeResource(resources, R.drawable.meal_main)
        val pasta = BitmapFactory.decodeResource(resources, R.drawable.pasta_main)
        val salad = BitmapFactory.decodeResource(resources, R.drawable.salad_main)
        val desert = BitmapFactory.decodeResource(resources, R.drawable.desert_main)
        val roundedMeal = RoundedBitmapDrawableFactory.create(resources, meal)
        val roundedPasta = RoundedBitmapDrawableFactory.create(resources, pasta)
        val roundedSalad = RoundedBitmapDrawableFactory.create(resources, salad)
        val roundedDesert = RoundedBitmapDrawableFactory.create(resources, desert)
        roundedMeal.cornerRadius = ROUND_VALUE
        roundedPasta.cornerRadius = ROUND_VALUE
        roundedSalad.cornerRadius = ROUND_VALUE
        roundedDesert.cornerRadius = ROUND_VALUE
        mealImage.setImageDrawable(roundedMeal)
        pastaImage.setImageDrawable(roundedPasta)
        saladImage.setImageDrawable(roundedSalad)
        desertImage.setImageDrawable(roundedDesert)
    }
}
