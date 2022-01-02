package com.example.changeimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.changeImgBtn)
        val imageWeather = findViewById<ImageView>(R.id.imageView)

        btn.setOnClickListener {
            changeImageWeather(imageWeather)
        }
    }

    fun changeImageWeather(imageWeather: ImageView) {
        if (imageWeather.tag == "rain") {
            imageWeather.setImageResource(R.drawable.sunny_weather)
            imageWeather.tag = "sunny"
        } else {
            imageWeather.setImageResource(R.drawable.raining)
            imageWeather.tag = "rain"
        }
    }
}