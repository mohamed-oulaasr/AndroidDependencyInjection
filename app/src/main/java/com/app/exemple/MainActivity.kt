package com.app.exemple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Dependency
//        val shape1 = Shape()
//        shape1.draw()


        // Dependency Injection
        val rectangle = Rectangle()    // Height, Width
        val circle = Circle()
        val square = Square()

        val shape2 = Shape(rectangle, circle, square)
        shape2.draw()




    }
}