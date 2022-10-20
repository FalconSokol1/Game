package com.example.game

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Foreword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foreword)
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
    }

    fun lose(view: View) {
        val intent: Intent = Intent(this@Foreword, LooseArcher::class.java)
        when (view.id) {
            R.id.button3 -> startActivity(intent)
        }
    }

    fun lastWindow(view: View) {
        val intent: Intent = Intent(this@Foreword, Win::class.java)
        when (view.id) {
            R.id.button45 -> startActivity(intent)
        }
    }
}
