package com.RubikCrush1.rubikcrushgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun playGame(view : View){
        val intent= Intent(applicationContext,PlayOptionsActivity::class.java)
        startActivity(intent)
    }
    fun scoreboar(view : View){
        val intent= Intent(applicationContext,ScoreBoardOptionsActivity::class.java)
        startActivity(intent)
    }
    fun oynanis(view : View){
        val intent= Intent(applicationContext,GamePlayOptions::class.java)
        startActivity(intent)
    }
    

}