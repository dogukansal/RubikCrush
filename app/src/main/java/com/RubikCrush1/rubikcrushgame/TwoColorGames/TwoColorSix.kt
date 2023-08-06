package com.RubikCrush1.rubikcrushgame.TwoColorGames

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.RubikCrush1.rubikcrushgame.PlayOptionsActivity
import com.RubikCrush1.rubikcrushgame.R
import kotlinx.android.synthetic.main.activity_two_color_six.*
import java.lang.Exception

class TwoColorSix : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_color_six)
        textView11.text = ""+sayac
        val rnds :ArrayList<Int> = arrayListOf<Int>()
        val butonsayisi : ArrayList<ImageButton> = arrayListOf<ImageButton>(
            imageButton969, imageButton970, imageButton971, imageButton972,
            imageButton973, imageButton974, imageButton975, imageButton976,
            imageButton772, imageButton773, imageButton774, imageButton775,
            imageButton780, imageButton781, imageButton782, imageButton783,
            imageButton788, imageButton789, imageButton790, imageButton791,
            imageButton796, imageButton797, imageButton798, imageButton799,
            imageButton808, imageButton809, imageButton810, imageButton811,
            imageButton816, imageButton817, imageButton818, imageButton819,
            imageButton824, imageButton825, imageButton826, imageButton827,
            imageButton832, imageButton833, imageButton834, imageButton835,
            imageButton989, imageButton990, imageButton991, imageButton992,
            imageButton997, imageButton998, imageButton999, imageButton1000,

            imageButton981, imageButton982, imageButton983, imageButton984,
            imageButton977, imageButton978, imageButton979, imageButton980,
            imageButton776, imageButton777, imageButton778, imageButton779,
            imageButton784, imageButton785, imageButton786, imageButton787,
            imageButton792, imageButton793, imageButton794, imageButton795,
            imageButton800, imageButton801, imageButton802, imageButton803,
            imageButton804, imageButton805, imageButton806, imageButton807,
            imageButton812, imageButton813, imageButton814, imageButton815,
            imageButton820, imageButton821, imageButton822, imageButton823,
            imageButton828, imageButton829, imageButton830, imageButton831,
            imageButton985, imageButton986, imageButton987, imageButton988,
            imageButton993, imageButton994, imageButton995, imageButton996,)
        for (z in 0..95){
            val a = (0..19).random()
            rnds.add (a)
            //randomw sayilari tuttuk dışarıya çıkartma yüklemiyo !
        }
        for (i in 0..47) {
            kirmizi222(butonsayisi[i])
        }
        for (i in 48..95) {
            mavi222(butonsayisi[i])
        }
        for (i in 0..35) {
            if(rnds[i]==0){
                imageButton837.performClick()
            }
            else if(rnds[i]==1){
                imageButton838.performClick()
            }
            else if(rnds[i]==2){
                imageButton839.performClick()
            }
            else if(rnds[i]==3){
                imageButton840.performClick()
            }
            else if(rnds[i]==4){
                imageButton841.performClick()
            }
            else if(rnds[i]==5){
                imageButton842.performClick()
            }
            else if(rnds[i]==6){
                imageButton843.performClick()
            }
            else if(rnds[i]==7){
                imageButton844.performClick()
            }

            else if(rnds[i]==8){
                imageButton861.performClick()
            }
            else if(rnds[i]==9){
                imageButton862.performClick()
            }
            else if(rnds[i]==10){
                imageButton863.performClick()
            }
            else if(rnds[i]==11){
                imageButton864.performClick()
            }
            else if(rnds[i]==12){
                imageButton865.performClick()
            }
            else if(rnds[i]==13){
                imageButton866.performClick()
            }
            else if(rnds[i]==14){
                imageButton867.performClick()
            }
            else if(rnds[i]==15){
                imageButton868.performClick()
            }
            else if(rnds[i]==16){
                imageButton1007.performClick()
            }
            else if(rnds[i]==17){
                imageButton1008.performClick()
            }
            else if(rnds[i]==18){
                imageButton1005.performClick()
            }
            else if(rnds[i]==19){
                imageButton1006.performClick()
            }
        }
        for (e in butonsayisi){
            e.setImageResource(android.R.color.transparent)
        }
        dene()
    }
    var sayac=-36
    var x=0
    var runnable:Runnable = Runnable {  }
    var handler = Handler()
    fun dene(){
        x=0
        runnable = object : Runnable{
            override fun run() {
                x=x+1
                textView44.text=""+x
                handler.postDelayed(runnable,1000)
            }
        }
        handler.post(runnable)
    }

    fun check11(view : View){
        kontrol()
    }

    fun kontrol(){
        if( renkidalma111(imageButton969)==-5242848   && renkidalma111(imageButton970)==-5242848    && renkidalma111(imageButton971)==-5242848  && renkidalma111(imageButton972)==-5242848 &&
            renkidalma111(imageButton973)==-5242848 && renkidalma111(imageButton974)==-5242848 && renkidalma111(imageButton975)==-5242848 && renkidalma111(imageButton976)==-5242848 &&
            renkidalma111(imageButton772)==-5242848 && renkidalma111(imageButton773)==-5242848 && renkidalma111(imageButton774)==-5242848 && renkidalma111(imageButton775)==-5242848 &&
            renkidalma111(imageButton780)==-5242848 && renkidalma111(imageButton781)==-5242848 && renkidalma111(imageButton782)==-5242848 && renkidalma111(imageButton783)==-5242848 &&
            renkidalma111(imageButton788)==-5242848 && renkidalma111(imageButton789)==-5242848 && renkidalma111(imageButton790)==-5242848 && renkidalma111(imageButton791)==-5242848 &&
            renkidalma111(imageButton796)==-5242848 && renkidalma111(imageButton797)==-5242848 && renkidalma111(imageButton798)==-5242848 && renkidalma111(imageButton799)==-5242848 &&
            renkidalma111(imageButton808)==-5242848 && renkidalma111(imageButton809)==-5242848 && renkidalma111(imageButton810)==-5242848 && renkidalma111(imageButton811)==-5242848 &&
            renkidalma111(imageButton816)==-5242848 && renkidalma111(imageButton817)==-5242848 && renkidalma111(imageButton818)==-5242848 && renkidalma111(imageButton819)==-5242848 &&
            renkidalma111(imageButton824)==-5242848 && renkidalma111(imageButton825)==-5242848 && renkidalma111(imageButton826)==-5242848 && renkidalma111(imageButton827)==-5242848 &&
            renkidalma111(imageButton832)==-5242848 && renkidalma111(imageButton833)==-5242848 && renkidalma111(imageButton834)==-5242848  && renkidalma111(imageButton835)==-5242848 &&
            renkidalma111(imageButton989)==-5242848 && renkidalma111(imageButton990)==-5242848 && renkidalma111(imageButton991)==-5242848 && renkidalma111(imageButton992)==-5242848 &&
            renkidalma111(imageButton997)==-5242848 && renkidalma111(imageButton999)==-5242848 && renkidalma111(imageButton999)==-5242848  && renkidalma111(imageButton1000)==-5242848 &&
            //kırmızı


            renkidalma111(imageButton981)==-16776961 && renkidalma111(imageButton982)==-16776961 && renkidalma111(imageButton983)==-16776961 && renkidalma111(imageButton984)==-16776961 &&
            renkidalma111(imageButton977)==-16776961 && renkidalma111(imageButton978)==-16776961 && renkidalma111(imageButton979)==-16776961 && renkidalma111(imageButton980)==-16776961 &&
            renkidalma111(imageButton776)==-16776961 && renkidalma111(imageButton777)==-16776961 && renkidalma111(imageButton778)==-16776961 && renkidalma111(imageButton779)==-16776961 &&
            renkidalma111(imageButton784)==-16776961 && renkidalma111(imageButton785)==-16776961 && renkidalma111(imageButton786)==-16776961 && renkidalma111(imageButton787)==-16776961 &&
            renkidalma111(imageButton792)==-16776961 && renkidalma111(imageButton793)==-16776961 && renkidalma111(imageButton794)==-16776961 && renkidalma111(imageButton795)==-16776961 &&
            renkidalma111(imageButton800)==-16776961 && renkidalma111(imageButton801)==-16776961 && renkidalma111(imageButton802)==-16776961 && renkidalma111(imageButton803)==-16776961 &&
            renkidalma111(imageButton804)==-16776961 && renkidalma111(imageButton805)==-16776961 && renkidalma111(imageButton806)==-16776961 && renkidalma111(imageButton807)==-16776961 &&
            renkidalma111(imageButton812)==-16776961 && renkidalma111(imageButton813)==-16776961 && renkidalma111(imageButton814)==-16776961 && renkidalma111(imageButton815)==-16776961 &&
            renkidalma111(imageButton820)==-16776961 && renkidalma111(imageButton821)==-16776961 && renkidalma111(imageButton822)==-16776961 && renkidalma111(imageButton823)==-16776961 &&
            renkidalma111(imageButton828)==-16776961 && renkidalma111(imageButton829)==-16776961 && renkidalma111(imageButton830)==-16776961 && renkidalma111(imageButton831)==-16776961 &&
            renkidalma111(imageButton985)==-16776961 && renkidalma111(imageButton986)==-16776961 && renkidalma111(imageButton987)==-16776961 && renkidalma111(imageButton988)==-16776961 &&
            renkidalma111(imageButton993)==-16776961 && renkidalma111(imageButton994)==-16776961 && renkidalma111(imageButton995)==-16776961 && renkidalma111(imageButton996)==-16776961
        //mavi
        )
        {
            try {
                var deneme: Int = 0
                val veritabani = this.openOrCreateDatabase("DENEME", Context.MODE_PRIVATE, null)
                veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun12 (id INTEGER PRİMARY KEY, color2sizee6 INTEGER UNIQUE)")
                val cursor1 = veritabani.rawQuery("SELECT * FROM oyun12", null)
                val idColumnIndex = cursor1.getColumnIndex("id")
                val isimColumnIndex = cursor1.getColumnIndex("color2sizee6")  //-1
                while (cursor1.moveToNext()) {
                    deneme = cursor1.getInt(isimColumnIndex)
                }
                if (deneme == 0) {
                    veritabani.execSQL("INSERT INTO oyun12 (id , color2sizee6 ) VALUES (1,$sayac)") // ilk başta veri yoksa tanımla
                } else {
                    if (sayac < deneme) {  // veri varsa bunu yap
                        veritabani.execSQL("INSERT OR IGNORE INTO oyun12 (id , color2sizee6 ) VALUES (1,$sayac)")
                    }
                }
            }
            catch (e : Exception){
            }
            val alert = AlertDialog.Builder(this)
            alert.setTitle("Congratulations")
            alert.setMessage("Score: " + sayac + " Play Again?")
            alert.setCancelable(false)
            if(sayac<=50){
                alert.setIcon(R.drawable.star3)
            }
            else if (sayac<=70){
                alert.setIcon(R.drawable.star2)
            }
            else {
                alert.setIcon(R.drawable.star1)
            }
            alert.setPositiveButton("Yes") { dialogInterface: DialogInterface, i: Int ->
                // Evet butonuna tıklayınca olacaklar
                val intent= Intent(applicationContext, TwoColorSix::class.java)
                startActivity(intent)
                finish()
            }

            alert.setNegativeButton("No") { dialogInterface: DialogInterface, i: Int ->
                val intent= Intent(applicationContext, PlayOptionsActivity::class.java)
                startActivity(intent)
                finish()
            }
            alert.show()
        }
        else{
            Toast.makeText(getApplicationContext(),"Keep Trying", Toast.LENGTH_LONG).show()

        }
    }

    fun renkidalma111(imagebuton : ImageButton): Int {
        val d = imagebuton.background as ColorDrawable
        val id =d.color
        return id
    }
    fun kirmizi222(imagebuton : ImageButton) {
        imagebuton.setBackgroundColor(-5242848)
    }
    fun mavi222(imagebuton : ImageButton) {
        imagebuton.setBackgroundColor(-16776961)
    }
    fun renderyan(imagebuton1 : ImageButton, imagebuton2 : ImageButton, imagebuton3 : ImageButton, imagebuton4 : ImageButton, imagebuton5 : ImageButton
                  , imagebuton6 : ImageButton, imagebuton7 : ImageButton, imagebuton8 : ImageButton
    ){
        val a = renkidalma111(imagebuton1)
        val b = renkidalma111(imagebuton2)
        val c = renkidalma111(imagebuton3)
        val d = renkidalma111(imagebuton4)
        val e = renkidalma111(imagebuton5)
        val f = renkidalma111(imagebuton6)
        val k = renkidalma111(imagebuton7)
        val l = renkidalma111(imagebuton8)
        imagebuton1.setBackgroundColor(e)
        imagebuton2.setBackgroundColor(f)
        imagebuton3.setBackgroundColor(k)
        imagebuton4.setBackgroundColor(l)
        imagebuton5.setBackgroundColor(a)
        imagebuton6.setBackgroundColor(b)
        imagebuton7.setBackgroundColor(c)
        imagebuton8.setBackgroundColor(d)
    }
    fun renderust(imagebuton1 : ImageButton, imagebuton2 : ImageButton, imagebuton3 : ImageButton, imagebuton4 : ImageButton, imagebuton5 : ImageButton
                  , imagebuton6 : ImageButton, imagebuton7 : ImageButton, imagebuton8 : ImageButton, imagebuton9 : ImageButton,imagebuton10 : ImageButton,
                  imagebuton11 : ImageButton, imagebuton12 : ImageButton,
    ){
        val a = renkidalma111(imagebuton1)
        val b = renkidalma111(imagebuton2)
        val c = renkidalma111(imagebuton3)
        val d = renkidalma111(imagebuton4)
        val e = renkidalma111(imagebuton5)
        val f = renkidalma111(imagebuton6)
        val k = renkidalma111(imagebuton7)
        val l = renkidalma111(imagebuton8)
        val aa = renkidalma111(imagebuton9)
        val bb = renkidalma111(imagebuton10)
        val cc = renkidalma111(imagebuton11)
        val dd = renkidalma111(imagebuton12)
        imagebuton1.setBackgroundColor(k)
        imagebuton2.setBackgroundColor(l)
        imagebuton3.setBackgroundColor(aa)
        imagebuton4.setBackgroundColor(bb)
        imagebuton5.setBackgroundColor(cc)
        imagebuton6.setBackgroundColor(dd)
        imagebuton7.setBackgroundColor(a)
        imagebuton8.setBackgroundColor(b)
        imagebuton9.setBackgroundColor(c)
        imagebuton10.setBackgroundColor(d)
        imagebuton11.setBackgroundColor(e)
        imagebuton12.setBackgroundColor(f)

    }

    fun b11ust (view : View) {
        renderust(imageButton969, imageButton973,imageButton772,imageButton780, imageButton788, imageButton796,   imageButton804, imageButton812,imageButton820,imageButton828,imageButton985,imageButton993)
        sayac++
        textView11.text = ""+sayac
    }
    fun b22ust (view : View) {
        renderust(imageButton970, imageButton974,imageButton773,imageButton781, imageButton789, imageButton797,   imageButton805, imageButton813, imageButton821, imageButton829,imageButton986,imageButton994 )
        sayac++
        textView11.text = ""+sayac
    }
    fun b33ust (view : View) {
        renderust(imageButton971, imageButton975,imageButton774,imageButton782, imageButton790, imageButton798,   imageButton806, imageButton814, imageButton822, imageButton830,imageButton987,imageButton995  )
        sayac++
        textView11.text = ""+sayac
    }
    fun b44ust (view : View) {
        renderust(imageButton972, imageButton976,imageButton775,imageButton783, imageButton791, imageButton799,   imageButton807, imageButton815, imageButton823, imageButton831,imageButton988,imageButton996 )
        sayac++
        textView11.text = ""+sayac
    }
    fun b55ust (view : View) {
        renderust(imageButton981, imageButton977,imageButton776,imageButton784, imageButton792, imageButton800,   imageButton808, imageButton816, imageButton824, imageButton832,imageButton989,imageButton997 )
        sayac++
        textView11.text = ""+sayac
    }
    fun b66ust (view : View) {
        renderust(imageButton982, imageButton978,imageButton777,imageButton785, imageButton793, imageButton801,   imageButton809, imageButton817, imageButton825, imageButton833,imageButton990,imageButton998 )
        sayac++
        textView11.text = ""+sayac
    }
    fun b77ust (view : View) {
        renderust(imageButton983, imageButton979,imageButton778,imageButton786, imageButton794, imageButton802, imageButton810, imageButton818, imageButton826, imageButton834,imageButton991,imageButton999 )
        sayac++
        textView11.text = ""+sayac
    }
    fun b88ust (view : View) {
        renderust(imageButton984, imageButton980,imageButton779,imageButton787, imageButton795, imageButton803, imageButton811, imageButton819, imageButton827, imageButton835,imageButton992,imageButton1000 )
        sayac++
        textView11.text = ""+sayac
    }


    fun b11yan (view : View) {
        renderyan(imageButton969, imageButton970,imageButton971,imageButton972, imageButton981, imageButton982, imageButton983, imageButton984 )
        sayac++
        textView11.text = ""+sayac
    }
    fun b22yan (view : View) {
        renderyan(imageButton973, imageButton974,imageButton975,imageButton976, imageButton977, imageButton978, imageButton979, imageButton980 )
        sayac++
        textView11.text = ""+sayac
    }

    fun b33yan (view : View) {
        renderyan(imageButton772, imageButton773,imageButton774,imageButton775, imageButton776, imageButton777, imageButton778, imageButton779)
        sayac++
        textView11.text = ""+sayac
    }
    fun b44yan (view : View) {
        renderyan(imageButton780, imageButton781,imageButton782,imageButton783, imageButton784, imageButton785, imageButton786, imageButton787 )
        sayac++
        textView11.text = ""+sayac
    }
    fun b55yan (view : View) {
        renderyan(imageButton788, imageButton789,imageButton790,imageButton791, imageButton792, imageButton793, imageButton794, imageButton795 )
        sayac++
        textView11.text = ""+sayac
    }
    fun b66yan (view : View) {
        renderyan(imageButton796, imageButton797,imageButton798,imageButton799, imageButton800, imageButton801, imageButton802, imageButton803)
        sayac++
        textView11.text = ""+sayac
    }
    fun b77yan (view : View) {
        renderyan(imageButton804, imageButton805,imageButton806,imageButton807, imageButton808, imageButton809, imageButton810, imageButton811)
        sayac++
        textView11.text = ""+sayac
    }

    fun b88yan (view : View) {
        renderyan(imageButton812, imageButton813,imageButton814,imageButton815, imageButton816, imageButton817, imageButton818, imageButton819)
        sayac++
        textView11.text = ""+sayac
    }
    fun b99yan (view : View) {
        renderyan(imageButton820, imageButton821,imageButton822,imageButton823, imageButton824, imageButton825, imageButton826, imageButton827)
        sayac++
        textView11.text = ""+sayac
    }
    fun b1010yan (view : View) {
        renderyan(imageButton828, imageButton829,imageButton830,imageButton831, imageButton832, imageButton833, imageButton834, imageButton835)
        sayac++
        textView11.text = ""+sayac
    }
    fun b1111yan (view : View) {
        renderyan(imageButton985, imageButton986,imageButton987,imageButton988, imageButton989, imageButton990, imageButton991, imageButton992)
        sayac++
        textView11.text = ""+sayac
    }
    fun b1212yan (view : View) {
        renderyan(imageButton993, imageButton994,imageButton995,imageButton996, imageButton997, imageButton998, imageButton999, imageButton1000)
        sayac++
        textView11.text = ""+sayac
    }
    fun b11ustyedek (view : View) {
        renderust(imageButton969, imageButton973,imageButton772,imageButton780, imageButton788, imageButton796,   imageButton804, imageButton812,imageButton820,imageButton828,imageButton985,imageButton993)
        sayac++
        textView11.text = ""+sayac
    }
    fun b22ustyedek (view : View) {
        renderust(imageButton970, imageButton974,imageButton773,imageButton781, imageButton789, imageButton797,   imageButton805, imageButton813, imageButton821, imageButton829,imageButton986,imageButton994 )
        sayac++
        textView11.text = ""+sayac
    }
    fun b33ustyedek (view : View) {
        renderust(imageButton971, imageButton975,imageButton774,imageButton782, imageButton790, imageButton798,   imageButton806, imageButton814, imageButton822, imageButton830,imageButton987,imageButton995  )
        sayac++
        textView11.text = ""+sayac
    }
    fun b44ustyedek (view : View) {
        renderust(imageButton972, imageButton976,imageButton775,imageButton783, imageButton791, imageButton799,   imageButton807, imageButton815, imageButton823, imageButton831,imageButton988,imageButton996 )
        sayac++
        textView11.text = ""+sayac
    }
    fun b55ustyedek (view : View) {
        renderust(imageButton981, imageButton977,imageButton776,imageButton784, imageButton792, imageButton800,   imageButton808, imageButton816, imageButton824, imageButton832,imageButton989,imageButton997 )
        sayac++
        textView11.text = ""+sayac
    }
    fun b66ustyedek (view : View) {
        renderust(imageButton982, imageButton978,imageButton777,imageButton785, imageButton793, imageButton801,   imageButton809, imageButton817, imageButton825, imageButton833,imageButton990,imageButton998 )
        sayac++
        textView11.text = ""+sayac
    }
    fun b77ustyedek (view : View) {
        renderust(imageButton983, imageButton979,imageButton778,imageButton786, imageButton794, imageButton802, imageButton810, imageButton818, imageButton826, imageButton834,imageButton991,imageButton999 )
        sayac++
        textView11.text = ""+sayac
    }
    fun b88ustyedek (view : View) {
        renderust(imageButton984, imageButton980,imageButton779,imageButton787, imageButton795, imageButton803, imageButton811, imageButton819, imageButton827, imageButton835,imageButton992,imageButton1000 )
        sayac++
        textView11.text = ""+sayac
    }


    fun b11yanyedek (view : View) {
        renderyan(imageButton969, imageButton970,imageButton971,imageButton972, imageButton981, imageButton982, imageButton983, imageButton984 )
        sayac++
        textView11.text = ""+sayac
    }
    fun b22yanyedek (view : View) {
        renderyan(imageButton973, imageButton974,imageButton975,imageButton976, imageButton977, imageButton978, imageButton979, imageButton980 )
        sayac++
        textView11.text = ""+sayac
    }

    fun b33yanyedek (view : View) {
        renderyan(imageButton772, imageButton773,imageButton774,imageButton775, imageButton776, imageButton777, imageButton778, imageButton779)
        sayac++
        textView11.text = ""+sayac
    }
    fun b44yanyedek (view : View) {
        renderyan(imageButton780, imageButton781,imageButton782,imageButton783, imageButton784, imageButton785, imageButton786, imageButton787 )
        sayac++
        textView11.text = ""+sayac
    }
    fun b55yanyedek (view : View) {
        renderyan(imageButton788, imageButton789,imageButton790,imageButton791, imageButton792, imageButton793, imageButton794, imageButton795 )
        sayac++
        textView11.text = ""+sayac
    }
    fun b66yanyedek (view : View) {
        renderyan(imageButton796, imageButton797,imageButton798,imageButton799, imageButton800, imageButton801, imageButton802, imageButton803)
        sayac++
        textView11.text = ""+sayac
    }
    fun b77yanyedek (view : View) {
        renderyan(imageButton804, imageButton805,imageButton806,imageButton807, imageButton808, imageButton809, imageButton810, imageButton811)
        sayac++
        textView11.text = ""+sayac
    }

    fun b88yanyedek (view : View) {
        renderyan(imageButton812, imageButton813,imageButton814,imageButton815, imageButton816, imageButton817, imageButton818, imageButton819)
        sayac++
        textView11.text = ""+sayac
    }
    fun b99yanyedek (view : View) {
        renderyan(imageButton820, imageButton821,imageButton822,imageButton823, imageButton824, imageButton825, imageButton826, imageButton827)
        sayac++
        textView11.text = ""+sayac
    }
    fun b1010yanyedek (view : View) {
        renderyan(imageButton828, imageButton829,imageButton830,imageButton831, imageButton832, imageButton833, imageButton834, imageButton835)
        sayac++
        textView11.text = ""+sayac
    }
    fun b1111yanyedek (view : View) {
        renderyan(imageButton985, imageButton986,imageButton987,imageButton988, imageButton989, imageButton990, imageButton991, imageButton992)
        sayac++
        textView11.text = ""+sayac
    }
    fun b1212yanyedek (view : View) {
        renderyan(imageButton993, imageButton994,imageButton995,imageButton996, imageButton997, imageButton998, imageButton999, imageButton1000)
        sayac++
        textView11.text = ""+sayac
    }

    }









