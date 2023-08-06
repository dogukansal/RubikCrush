package com.RubikCrush1.rubikcrushgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class ScoreBoardOptionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score_board_options)
    }
    fun mod1score(view : View){
        val intent= Intent(applicationContext, ScoreBoardActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun mod2score(view : View){
        val intent= Intent(applicationContext, ScoreBoard2Activity::class.java)
        startActivity(intent)
        finish()
    }
    fun mod3score(view : View){
        val intent= Intent(applicationContext, ScoreBoard3Activity::class.java)
        startActivity(intent)
        finish()
    }fun mod4score(view : View){
        val intent= Intent(applicationContext, ScoreBoard4Activity::class.java)
        startActivity(intent)
        finish()
    }

}