package com.example.game

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
    }

    fun start(view: View){
        val intent: Intent = Intent(this@MainActivity, Foreword::class.java)
        when(view.id){
            R.id.button1 -> startActivity(intent)
        }
        }
    }
