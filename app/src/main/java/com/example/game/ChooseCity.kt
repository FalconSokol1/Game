package com.example.game

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ChooseCity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_city)
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
    }
    fun frack(view: View) {
        val intent: Intent = Intent(this@ChooseCity, Loooser::class.java)
        when (view.id) {
            R.id.button45 -> startActivity(intent)
        }
    }

    fun winner(view: View) {
        val intent: Intent = Intent(this@ChooseCity, Winner::class.java)
        when (view.id) {
            R.id.button3 -> startActivity(intent)
        }
    }


}