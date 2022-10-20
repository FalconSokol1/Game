package com.example.game

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Winner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_winner)
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
    }
    fun main(view: View) {
        val intent: Intent = Intent(this@Winner, MainActivity::class.java)
        when (view.id) {
            R.id.button45 -> startActivity(intent)
}
    }
}
