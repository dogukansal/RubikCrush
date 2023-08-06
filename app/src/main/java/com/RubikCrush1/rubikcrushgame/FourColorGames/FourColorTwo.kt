package com.RubikCrush1.rubikcrushgame.FourColorGames

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
import kotlinx.android.synthetic.main.activity_four_color_two.*
import java.lang.Exception

class FourColorTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four_color_two)
        textView7.text = ""+sayac
        val rnds :ArrayList<Int> = arrayListOf<Int>()
        val butonsayisi : ArrayList<ImageButton> = arrayListOf<ImageButton>(
            imageButton380, imageButton381,imageButton384, imageButton385,
            imageButton382,imageButton383, imageButton386,imageButton387,
            imageButton388, imageButton389,imageButton392, imageButton393,
            imageButton390,imageButton391, imageButton394,imageButton395)

        for (z in 0..15){
            val a = (0..7).random()
            rnds.add (a)
        }
        for (i in 0..3) {
            turuncu2(butonsayisi[i])

        }
        for (i in 4..7) {
            yesil2(butonsayisi[i])

        }
        for (i in 8..11) {
            mavi2(butonsayisi[i])
        }
        for (i in 12..15) {
            kirmizi2(butonsayisi[i])
        }

        for (i in 0..15) {
            if(rnds[i]==0){
                imageButton396.performClick()
            }
            else if(rnds[i]==1){
                imageButton397.performClick()
            }
            else if(rnds[i]==2){
                imageButton398.performClick()
            }
            else if(rnds[i]==3){
                imageButton399.performClick()
            }
            else if(rnds[i]==4){
                imageButton408.performClick()
            }
            else if(rnds[i]==5){
                imageButton409.performClick()
            }
            else if(rnds[i]==6){
                imageButton410.performClick()
            }
            else if(rnds[i]==7){
                imageButton411.performClick()
            }
        }
        for (e in butonsayisi){
            e.setImageResource(android.R.color.transparent)
        }
        dene()
    }
    var sayac=-16
    var x=0
    var runnable:Runnable = Runnable {  }
    var handler = Handler()
    fun dene(){
        x=0
        runnable = object : Runnable{
            override fun run() {
                x=x+1
                textView50.text=""+x
                handler.postDelayed(runnable,1000)
            }
        }
        handler.post(runnable)
    }

    fun check7(view : View){
        kontrol()
    }

    fun kontrol(){
        if(    renkidalma(imageButton380)==-5242848 && renkidalma(imageButton384)==-5242848
            && renkidalma(imageButton381)==-5242848 && renkidalma(imageButton385)==-5242848
            //kırmızı
            && renkidalma(imageButton390)==-16777216 && renkidalma(imageButton394)==-16777216
            && renkidalma(imageButton391)==-16777216 && renkidalma(imageButton395)==-16777216
            //siyah
            && renkidalma(imageButton382)==-16776961 && renkidalma(imageButton383)==-16776961
            && renkidalma(imageButton386)==-16776961 && renkidalma(imageButton387)==-16776961
            //mavi
            && renkidalma(imageButton388)==-10053376 && renkidalma(imageButton392)==-10053376
            && renkidalma(imageButton389)==-10053376 && renkidalma(imageButton393)==-10053376 )
            //yesil

        {
            try {
                var deneme: Int = 0
                val veritabani = this.openOrCreateDatabase("DENEME", Context.MODE_PRIVATE, null)
                veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun7 (id INTEGER PRİMARY KEY, color4sizee2 INTEGER UNIQUE)")
                val cursor1 = veritabani.rawQuery("SELECT * FROM oyun7", null)
                val idColumnIndex = cursor1.getColumnIndex("id")
                val isimColumnIndex = cursor1.getColumnIndex("color4sizee2")  //-1
                while (cursor1.moveToNext()) {
                    deneme = cursor1.getInt(isimColumnIndex)
                }
                if (deneme == 0) {
                    veritabani.execSQL("INSERT INTO oyun7 (id , color4sizee2 ) VALUES (1,$sayac)") // ilk başta veri yoksa tanımla
                } else {
                    if (sayac < deneme) {  // veri varsa bunu yap
                        veritabani.execSQL("INSERT OR IGNORE INTO oyun7 (id , color4sizee2 ) VALUES (1,$sayac)")
                    }
                }
            }
            catch (e : Exception){
            }
            val alert = AlertDialog.Builder(this)
            alert.setTitle("Congratulations")
            alert.setMessage("Score: " + sayac + " Play Again?")
            alert.setCancelable(false)
            alert.setPositiveButton("Yes") { dialogInterface: DialogInterface, i: Int ->
                // Evet butonuna tıklayınca olacaklar
                val intent= Intent(applicationContext, FourColorTwo::class.java)
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
    fun renkidalma(imagebuton : ImageButton): Int {
        val d = imagebuton.background as ColorDrawable
        val id =d.color
        return id
    }
    fun kirmizi2(imagebuton : ImageButton) {
        imagebuton.setBackgroundColor(-5242848)
    }
    fun mavi2(imagebuton : ImageButton) {
        imagebuton.setBackgroundColor(-16776961)
    }
    fun yesil2(imagebuton : ImageButton) {
        imagebuton.setBackgroundColor(-10053376)
    }
    fun turuncu2(imagebuton : ImageButton) {
        imagebuton.setBackgroundColor(-16777216 )
    }
    fun render(imagebuton1 : ImageButton, imagebuton2 : ImageButton, imagebuton3 : ImageButton, imagebuton4 : ImageButton){
        val a = renkidalma(imagebuton1)
        val b = renkidalma(imagebuton2)
        val c = renkidalma(imagebuton3)
        val d = renkidalma(imagebuton4)

        imagebuton1.setBackgroundColor(c)
        imagebuton2.setBackgroundColor(d)
        imagebuton3.setBackgroundColor(a)
        imagebuton4.setBackgroundColor(b)

    }
    fun a1ust (view : View) {
        render(imageButton380, imageButton384,imageButton388,imageButton392 )
        sayac++
        textView7.text = ""+sayac
    }
    fun a2ust (view : View) {
        render(imageButton381, imageButton385,imageButton389,imageButton393 )
        sayac++
        textView7.text = ""+sayac
    }
    fun a3ust (view : View) {
        render(imageButton382, imageButton386,imageButton390,imageButton394 )
        sayac++
        textView7.text = ""+sayac

    }
    fun a4ust (view : View) {
        render(imageButton383, imageButton387,imageButton391,imageButton395 )
        sayac++
        textView7.text = ""+sayac
    }
    fun a1yan (view : View) {
        render(imageButton380, imageButton381,imageButton382,imageButton383 )
        sayac++
        textView7.text = ""+sayac
    }
    fun a2yan (view : View) {
        render(imageButton384, imageButton385,imageButton386,imageButton387 )
        sayac++
        textView7.text = ""+sayac
    }
    fun a3yan (view : View) {
        render(imageButton388, imageButton389,imageButton390,imageButton391 )
        sayac++
        textView7.text = ""+sayac
    }
    fun a4yan (view : View) {
        render(imageButton392, imageButton393,imageButton394,imageButton395 )
        sayac++
        textView7.text = ""+sayac
    }


    fun a1ustyedek (view : View) {
        render(imageButton380, imageButton384,imageButton388,imageButton392 )
        sayac++
        textView7.text = ""+sayac
    }
    fun a2ustyedek (view : View) {
        render(imageButton381, imageButton385,imageButton389,imageButton393 )
        sayac++
        textView7.text = ""+sayac
    }
    fun a3ustyedek (view : View) {
        render(imageButton382, imageButton386,imageButton390,imageButton394 )
        sayac++
        textView7.text = ""+sayac
    }
    fun a4ustyedek (view : View) {
        render(imageButton383, imageButton387,imageButton391,imageButton395 )
        sayac++
        textView7.text = ""+sayac
    }
    fun a1yanyedek (view : View) {
        render(imageButton380, imageButton381,imageButton382,imageButton383 )
        sayac++
        textView7.text = ""+sayac
    }
    fun a2yanyedek (view : View) {
        render(imageButton384, imageButton385,imageButton386,imageButton387 )
        sayac++
        textView7.text = ""+sayac
    }
    fun a3yanyedek (view : View) {
        render(imageButton388, imageButton389,imageButton390,imageButton391 )
        sayac++
        textView7.text = ""+sayac
    }
    fun a4yanyedek (view : View) {
        render(imageButton392, imageButton393,imageButton394,imageButton395 )
        sayac++
        textView7.text = ""+sayac
    }
    }
