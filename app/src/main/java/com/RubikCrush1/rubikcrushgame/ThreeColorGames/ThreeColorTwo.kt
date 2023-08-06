package com.RubikCrush1.rubikcrushgame.ThreeColorGames

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
import kotlinx.android.synthetic.main.activity_three_color_two.*
import java.lang.Exception

class ThreeColorTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_color_two)
        textView4.text = ""+sayac
        val rnds :ArrayList<Int> = arrayListOf<Int>()
        val butonsayisi : ArrayList<ImageButton> = arrayListOf<ImageButton>(
            imageButton192, imageButton193, imageButton196, imageButton197
            , imageButton202, imageButton203, imageButton206, imageButton207
            , imageButton194, imageButton195, imageButton198, imageButton199
            , imageButton204, imageButton205, imageButton200, imageButton201 )

        for (z in 0..15){
            val a = (0..7).random()
            rnds.add (a)
        }
        for (i in 0..7) {
            kirmizi(butonsayisi[i])
        }
        for (i in 8..11) {
            mavi(butonsayisi[i])
        }
        for (i in 12..15) {
            yesil(butonsayisi[i])
        }
        for (i in 0..15) {
            if(rnds[i]==0){
                imageButton208.performClick()
            }
            else if(rnds[i]==1){
                imageButton209.performClick()
            }
            else if(rnds[i]==2){
                imageButton210.performClick()
            }
            else if(rnds[i]==3){
                imageButton211.performClick()
            }
            else if(rnds[i]==4){
                imageButton220.performClick()
            }
            else if(rnds[i]==5){
                imageButton221.performClick()
            }
            else if(rnds[i]==6){
                imageButton222.performClick()
            }
            else if(rnds[i]==7){
                imageButton223.performClick()
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
                textView45.text=""+x
                handler.postDelayed(runnable,1000)
            }
        }
        handler.post(runnable)
    }
    fun check4(view : View){
        kontrol()
    }



    fun kontrol(){
        if(    renkidalma(imageButton192)==-5242848 && renkidalma(imageButton193)==-5242848
            && renkidalma(imageButton196)==-5242848 && renkidalma(imageButton197)==-5242848
            && renkidalma(imageButton202)==-5242848 && renkidalma(imageButton203)==-5242848
            && renkidalma(imageButton206)==-5242848 && renkidalma(imageButton207)==-5242848
            //kırmızı
            && renkidalma(imageButton194)==-16776961 && renkidalma(imageButton195)==-16776961
            && renkidalma(imageButton198)==-16776961 && renkidalma(imageButton199)==-16776961
            //mavi
            && renkidalma(imageButton200)==-10053376 && renkidalma(imageButton201)==-10053376
            && renkidalma(imageButton204)==-10053376 && renkidalma(imageButton205)==-10053376 )

            //yesil

        {
            try {
                var deneme: Int = 0
                val veritabani = this.openOrCreateDatabase("DENEME", Context.MODE_PRIVATE, null)
                veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun4 (id INTEGER PRİMARY KEY, color3sizee2 INTEGER UNIQUE)")
                val cursor1 = veritabani.rawQuery("SELECT * FROM oyun4", null)
                val idColumnIndex = cursor1.getColumnIndex("id")
                val isimColumnIndex = cursor1.getColumnIndex("color3sizee2")  //-1
                while (cursor1.moveToNext()) {
                    deneme = cursor1.getInt(isimColumnIndex)
                }
                if (deneme == 0) {
                    veritabani.execSQL("INSERT INTO oyun4 (id , color3sizee2 ) VALUES (1,$sayac)") // ilk başta veri yoksa tanımla
                } else {
                    if (sayac < deneme) {  // veri varsa bunu yap
                        veritabani.execSQL("INSERT OR IGNORE INTO oyun4 (id , color3sizee2 ) VALUES (1,$sayac)")
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
                val intent= Intent(applicationContext, ThreeColorTwo::class.java)
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
    fun kirmizi(imagebuton : ImageButton) {
        imagebuton.setBackgroundColor(-5242848)
    }
    fun mavi(imagebuton : ImageButton) {
        imagebuton.setBackgroundColor(-16776961)
    }
    fun yesil(imagebuton : ImageButton) {
        imagebuton.setBackgroundColor(-10053376)
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
    fun a1ust3 (view : View) {
        render(imageButton192, imageButton196,imageButton200,imageButton204 )
        sayac++
        textView4.text = ""+sayac
    }
    fun a2ust3 (view : View) {
        render(imageButton193, imageButton197,imageButton201,imageButton205 )
        sayac++
        textView4.text = ""+sayac
    }
    fun a3ust3 (view : View) {
        render(imageButton194, imageButton198,imageButton202,imageButton206 )
        sayac++
        textView4.text = ""+sayac

    }
    fun a4ust3 (view : View) {
        render(imageButton195, imageButton199,imageButton203,imageButton207 )
        sayac++
        textView4.text = ""+sayac

    }
    fun a1yan3 (view : View) {
        render(imageButton192, imageButton193,imageButton194,imageButton195 )
        sayac++
        textView4.text = ""+sayac

    }
    fun a2yan3 (view : View) {
        render(imageButton196, imageButton197,imageButton198,imageButton199 )
        sayac++
        textView4.text = ""+sayac
    }
    fun a3yan3 (view : View) {
        render(imageButton200, imageButton201,imageButton202,imageButton203 )
        sayac++
        textView4.text = ""+sayac
    }
    fun a4yan3 (view : View) {
        render(imageButton204, imageButton205,imageButton206,imageButton207 )
        sayac++
        textView4.text = ""+sayac
    }

    fun a1ustyedek3 (view : View) {
        render(imageButton192, imageButton196,imageButton200,imageButton204 )
        sayac++
        textView4.text = ""+sayac
    }
    fun a2ustyedek3 (view : View) {
        render(imageButton193, imageButton197,imageButton201,imageButton205 )
        sayac++
        textView4.text = ""+sayac
    }
    fun a3ustyedek3 (view : View) {
        render(imageButton194, imageButton198,imageButton202,imageButton206 )
        sayac++
        textView4.text = ""+sayac
    }
    fun a4ustyedek3 (view : View) {
        render(imageButton195, imageButton199,imageButton203,imageButton207 )
        sayac++
        textView4.text = ""+sayac

    }
    fun a1yanyedek3 (view : View) {
        render(imageButton192, imageButton193,imageButton194,imageButton195 )
        sayac++
        textView4.text = ""+sayac
    }
    fun a2yanyedek3 (view : View) {
        render(imageButton196, imageButton197,imageButton198,imageButton199 )
        sayac++
        textView4.text = ""+sayac
    }
    fun a3yanyedek3 (view : View) {
        render(imageButton200, imageButton201,imageButton202,imageButton203 )
        sayac++
        textView4.text = ""+sayac
    }
    fun a4yanyedek3 (view : View) {
        render(imageButton204, imageButton205,imageButton206,imageButton207 )
        sayac++
        textView4.text = ""+sayac
    }
}
