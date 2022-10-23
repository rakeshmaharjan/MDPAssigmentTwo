package com.example.assignmenttwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val foodList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        foodList.add("Hamburger")
        foodList.add("Pizza")
        foodList.add("Mexican")
        foodList.add("American")
        foodList.add("Chinese")

//        val decideButton = findViewById<Button>(R.id.decideBT)
//        decideButton.setOnClickListener {
//
//        }

    }

    fun addNewFood(view: View)
    {
        val newFoodText = findViewById<EditText>(R.id.addNewFoodPT)
        val text = newFoodText.editableText.toString()
        foodList.add(text)
        newFoodText.text.clear()
        Toast.makeText(this, "Food Added", Toast.LENGTH_SHORT).show()
        Log.d("test", "addNewFood: "+text)
    }

    fun decideFood(view: View)
    {
        val randomNum = Random.nextInt(foodList.size)
        val randomFood = foodList.get(randomNum)
        val foodTextView = findViewById<TextView>(R.id.foodTV)
        foodTextView.text = randomFood
    }
}