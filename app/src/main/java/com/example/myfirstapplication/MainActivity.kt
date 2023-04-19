package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

//im shai
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //when the user clicks on the "menu" button
        val menu_button = findViewById<Button>(R.id.menuButton)
        val reservation_button = findViewById<Button>(R.id.reservationButton)

        menu_button.setOnClickListener{
            val intent = Intent(this,Menu::class.java)
            startActivity(intent)

        }
        //when the user clicks on the "reserve seats" button
            reservation_button.setOnClickListener{
            val intent = Intent(this,ReservationActivity::class.java)
            startActivity(intent)

        }

    }

}