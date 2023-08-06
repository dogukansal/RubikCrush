package com.RubikCrush1.rubikcrushgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.RubikCrush1.GamePlayAlman
import com.RubikCrush1.GamePlayFrans

class GamePlayOptions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_play_options)
    }
    fun turkce(view : View){
        val intent= Intent(applicationContext, GameplayActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun ingilizce(view : View){
        val intent= Intent(applicationContext, GamePlayEn::class.java)
        startActivity(intent)
        finish()
    }
    fun almanca(view : View){
        val intent= Intent(applicationContext, GamePlayAlman::class.java)
        startActivity(intent)
        finish()
    }
    fun frans(view : View){
        val intent= Intent(applicationContext, GamePlayFrans::class.java)
        startActivity(intent)
        finish()
    }
}