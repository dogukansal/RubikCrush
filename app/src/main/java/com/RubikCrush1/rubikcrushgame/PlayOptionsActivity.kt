package com.RubikCrush1.rubikcrushgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.RubikCrush1.rubikcrushgame.FourColorGames.*
import com.RubikCrush1.rubikcrushgame.ThreeColorGames.*
import com.RubikCrush1.rubikcrushgame.TwoColorGames.*
import com.RubikCrush1.rubikcrushgame.mod2.FourColorGames.FourColorFour2
import com.RubikCrush1.rubikcrushgame.mod2.FourColorGames.FourColorThree2
import com.RubikCrush1.rubikcrushgame.mod2.ThreeColorGames.ThreeColorFour2
import com.RubikCrush1.rubikcrushgame.mod2.ThreeColorGames.ThreeColorThree2
import com.RubikCrush1.rubikcrushgame.mod2.TwoColorGames.TwoColorFour2
import com.RubikCrush1.rubikcrushgame.mod2.TwoColorGames.TwoColorThree2
import com.RubikCrush1.rubikcrushgame.mod2hard.FourColorGames.FourColorFourHard2
import com.RubikCrush1.rubikcrushgame.mod2hard.FourColorGames.FourColorThreeHard2
import com.RubikCrush1.rubikcrushgame.mod2hard.ThreeColorGames.ThreeColorFourHard2
import com.RubikCrush1.rubikcrushgame.mod2hard.ThreeColorGames.ThreeColorThreeHard2
import com.RubikCrush1.rubikcrushgame.mod2hard.TwoColorGames.TwoColorFourHard2
import com.RubikCrush1.rubikcrushgame.mod2hard.TwoColorGames.TwoColorThreeHard2
import com.RubikCrush1.rubikcrushgame.mod3.FourColorGames.FourColorFour3
import com.RubikCrush1.rubikcrushgame.mod3.FourColorGames.FourColorThree3
import com.RubikCrush1.rubikcrushgame.mod3.ThreeColorGames.ThreeColorFour3
import com.RubikCrush1.rubikcrushgame.mod3.ThreeColorGames.ThreeColorThree3
import com.RubikCrush1.rubikcrushgame.mod3.TwoColorGames.TwoColorFour3
import com.RubikCrush1.rubikcrushgame.mod3.TwoColorGames.TwoColorThree3
import com.RubikCrush1.rubikcrushgame.mod3hard.FourColorGames.FourColorFourHard3
import com.RubikCrush1.rubikcrushgame.mod3hard.FourColorGames.FourColorThreeHard3
import com.RubikCrush1.rubikcrushgame.mod3hard.ThreeColorGames.ThreeColorFourHard3
import com.RubikCrush1.rubikcrushgame.mod3hard.ThreeColorGames.ThreeColorThreeHard3
import com.RubikCrush1.rubikcrushgame.mod3hard.TwoColorGames.TwoColorFourHard3
import com.RubikCrush1.rubikcrushgame.mod3hard.TwoColorGames.TwoColorThreeHard3
import com.RubikCrush1.rubikcrushgame.mod4.FourColorGames.FourColorFour4
import com.RubikCrush1.rubikcrushgame.mod4.FourColorGames.FourColorThree4
import com.RubikCrush1.rubikcrushgame.mod4.ThreeColorGames.ThreeColorFour4
import com.RubikCrush1.rubikcrushgame.mod4.ThreeColorGames.ThreeColorThree4
import com.RubikCrush1.rubikcrushgame.mod4.TwoColorGames.TwoColorFour4
import com.RubikCrush1.rubikcrushgame.mod4.TwoColorGames.TwoColorThree4

class PlayOptionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_options)
    }
    fun twocolortwomod1(view : View){
        val intent= Intent(applicationContext, TwoColorTwo::class.java)
        startActivity(intent)

    }
    fun twocolorthreemod1(view : View){
        val intent= Intent(applicationContext, TwoColorThree::class.java)
        startActivity(intent)

    }
    fun twocolorfourmod1(view : View){
        val intent= Intent(applicationContext, TwoColorFour::class.java)
        startActivity(intent)

    }
    fun twocolorfivemod1(view : View){
        val intent= Intent(applicationContext, TwoColorFive::class.java)
        startActivity(intent)

    }
    fun twocolorsixmod1(view : View){
        val intent= Intent(applicationContext, TwoColorSix::class.java)
        startActivity(intent)

    }


    fun threecolortwomod1(view : View){
        val intent= Intent(applicationContext, ThreeColorTwo::class.java)
        startActivity(intent)

    }
    fun threecolorthreemod1(view : View){
        val intent= Intent(applicationContext, ThreeColorThree::class.java)
        startActivity(intent)

    }
    fun threecolorfourmod1(view : View){
        val intent= Intent(applicationContext, ThreeColorFour::class.java)
        startActivity(intent)

    }
    fun threecolorfivemod1(view : View){
        val intent= Intent(applicationContext, ThreeColurFive::class.java)
        startActivity(intent)

    }
    fun threecolorsixmod1(view : View){
        val intent= Intent(applicationContext, ThreeColorSix::class.java)
        startActivity(intent)
    }

    fun fourcolortwomod1(view : View){
        val intent= Intent(applicationContext, FourColorTwo::class.java)
        startActivity(intent)
    }
    fun fourcolorthreemod1(view : View){
        val intent= Intent(applicationContext, FourColorThree::class.java)
        startActivity(intent)
    }
    fun fourcolorfourmod1(view : View){
        val intent= Intent(applicationContext, FourColorFour::class.java)
        startActivity(intent)
    }
    fun fourcolorfivemod1(view : View){
        val intent= Intent(applicationContext, FourColorFive::class.java)
        startActivity(intent)

    }
    fun fourcolorsixmod1(view : View){
        val intent= Intent(applicationContext, FourColorSix::class.java)
        startActivity(intent)
    }



    fun twocolorthreemod2(view : View){
        val intent= Intent(applicationContext, TwoColorThree2::class.java)
        startActivity(intent)

    }
    fun twocolorfourmod2(view : View){
        val intent= Intent(applicationContext, TwoColorFour2::class.java)
        startActivity(intent)
    }

    fun threecolorthreemod2(view : View){
        val intent= Intent(applicationContext, ThreeColorThree2::class.java)
        startActivity(intent)
    }
    fun threecolorfourmod2(view : View){
        val intent= Intent(applicationContext, ThreeColorFour2::class.java)
        startActivity(intent)
    }

    fun fourcolorthreemod2(view : View){
        val intent= Intent(applicationContext, FourColorThree2::class.java)
        startActivity(intent)
    }
    fun fourcolorfourmod2(view : View){
        val intent= Intent(applicationContext, FourColorFour2::class.java)
        startActivity(intent)
    }

    fun twocolorthreemod2hard(view : View){
    val intent= Intent(applicationContext, TwoColorThreeHard2::class.java)
    startActivity(intent)
    }
    fun twocolorfourmod2hard(view : View){
        val intent= Intent(applicationContext, TwoColorFourHard2::class.java)
        startActivity(intent)
    }

    fun threecolorthreemod2hard(view : View){
        val intent= Intent(applicationContext, ThreeColorThreeHard2::class.java)
        startActivity(intent)
    }
    fun threecolorfourmod2hard(view : View){
        val intent= Intent(applicationContext, ThreeColorFourHard2::class.java)
        startActivity(intent)
    }

    fun fourcolorthreemod2hard(view : View){
        val intent= Intent(applicationContext, FourColorThreeHard2::class.java)
        startActivity(intent)

    }
    fun fourcolorfourmod2hard(view : View){
        val intent= Intent(applicationContext, FourColorFourHard2::class.java)
        startActivity(intent)
    }

    fun twocolorthreemod3(view : View){
        val intent= Intent(applicationContext, TwoColorThree3::class.java)
        startActivity(intent)
    }
    fun twocolorfourmod3(view : View){
        val intent= Intent(applicationContext, TwoColorFour3::class.java)
        startActivity(intent)
    }
    fun threecolorthreemod3(view : View){
        val intent= Intent(applicationContext, ThreeColorThree3::class.java)
        startActivity(intent)
    }
    fun threecolorfourmod3(view : View){
        val intent= Intent(applicationContext, ThreeColorFour3::class.java)
        startActivity(intent)
    }
    fun fourcolorthreemod3(view : View){
        val intent= Intent(applicationContext, FourColorThree3::class.java)
        startActivity(intent)
    }
    fun fourcolorfourmod3(view : View){
        val intent= Intent(applicationContext, FourColorFour3::class.java)
        startActivity(intent)
    }

    fun twocolorthreemod3hard (view : View){
        val intent= Intent(applicationContext, TwoColorThreeHard3::class.java)
        startActivity(intent)
    }
    fun twocolorfourmod3hard (view : View){
        val intent= Intent(applicationContext, TwoColorFourHard3::class.java)
        startActivity(intent)
    }
    fun threecolorthreemod3hard (view : View){
        val intent= Intent(applicationContext, ThreeColorThreeHard3::class.java)
        startActivity(intent)
    }
    fun threecolorfourmod3hard (view : View){
        val intent= Intent(applicationContext, ThreeColorFourHard3::class.java)
        startActivity(intent)
    }
    fun fourcolorthreemod3hard (view : View){
        val intent= Intent(applicationContext, FourColorThreeHard3::class.java)
        startActivity(intent)
    }
    fun fourcolorfourmod3hard (view : View){
        val intent= Intent(applicationContext, FourColorFourHard3::class.java)
        startActivity(intent)
    }

    fun twocolorthreemod4(view : View){
        val intent= Intent(applicationContext, TwoColorThree4::class.java)
        startActivity(intent)
    }
    fun twocolorfourmod4(view : View){
        val intent= Intent(applicationContext, TwoColorFour4::class.java)
        startActivity(intent)
    }
    fun threecolorthreemod4(view : View){
        val intent= Intent(applicationContext, ThreeColorThree4::class.java)
        startActivity(intent)
    }
    fun threecolorfourmod4(view : View){
        val intent= Intent(applicationContext, ThreeColorFour4::class.java)
        startActivity(intent)
    }
    fun fourcolorthreemod4(view : View){
        val intent= Intent(applicationContext, FourColorThree4::class.java)
        startActivity(intent)
    }
    fun fourcolorfourmod4(view : View){
        val intent= Intent(applicationContext, FourColorFour4::class.java)
        startActivity(intent)
    }










}