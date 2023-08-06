package com.RubikCrush1.rubikcrushgame.TwoColorGames

import android.content.Context
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
import kotlinx.android.synthetic.main.activity_two_color_two.*

class TwoColorTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_color_two)
        textView.text = ""+sayac
        val rnds :ArrayList<Int> = arrayListOf<Int>()
        val butonsayisi : ArrayList<ImageButton> = arrayListOf<ImageButton>(
              imageButton6, imageButton7, imageButton10, imageButton11
            , imageButton16, imageButton17, imageButton20, imageButton21
             , imageButton8, imageButton9, imageButton12, imageButton13
            , imageButton14, imageButton15, imageButton18, imageButton19)
        for (z in 0..15){
            val a = (0..7).random()
            rnds.add (a)
        }
        for (i in 0..7) {
            kirmizi(butonsayisi[i])
        }
        for (i in 8..15) {
            mavi(butonsayisi[i])
        }
        for (i in 0..15) {
            if(rnds[i]==0){
                imageButton79.performClick()
            }
            else if(rnds[i]==1){
                imageButton86.performClick()
            }
            else if(rnds[i]==2){
                imageButton87.performClick()
            }
            else if(rnds[i]==3){
                imageButton81.performClick()
            }
            else if(rnds[i]==4){
                imageButton82.performClick()
            }
            else if(rnds[i]==5){
                imageButton83.performClick()
            }
            else if(rnds[i]==6){
                imageButton84.performClick()
            }
            else if(rnds[i]==7){
                imageButton85.performClick()
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
                textView40.text=""+x
                handler.postDelayed(runnable,1000)
            }
        }
        handler.post(runnable)
    }

    fun check1(view : View){
        kontrol()
    }

    fun kontrol(){
        if( renkidalma(imageButton6)==-5242848 && renkidalma(imageButton7)==-5242848
            && renkidalma(imageButton10)==-5242848 && renkidalma(imageButton11)==-5242848
            && renkidalma(imageButton16)==-5242848 && renkidalma(imageButton17)==-5242848
            && renkidalma(imageButton20)==-5242848 && renkidalma(imageButton21)==-5242848
            //kırmızı
            && renkidalma(imageButton8)==-16776961 && renkidalma(imageButton9)==-16776961
            && renkidalma(imageButton12)==-16776961 && renkidalma(imageButton13)==-16776961
            && renkidalma(imageButton14)==-16776961 && renkidalma(imageButton15)==-16776961
            && renkidalma(imageButton18)==-16776961 && renkidalma(imageButton19)==-16776961 )
            //mavi
        {

            var deneme: Int = 0
            val veritabani = this.openOrCreateDatabase("DENEME", Context.MODE_PRIVATE, null)
            veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun1 (id INTEGER PRİMARY KEY, color2sizee2 INTEGER UNIQUE)")
            val cursor1 = veritabani.rawQuery("SELECT * FROM oyun1", null)
            val idColumnIndex = cursor1.getColumnIndex("id")
            val isimColumnIndex = cursor1.getColumnIndex("color2sizee2")  //-1
            while (cursor1.moveToNext()) {
                deneme = cursor1.getInt(isimColumnIndex)

            }

                if (deneme == 0) {
                    veritabani.execSQL("INSERT INTO oyun1 (id , color2sizee2 ) VALUES (1,$sayac)") // ilk başta veri yoksa tanımla

                }
                else {
                    if (sayac < deneme) {  // veri varsa bunu yap
                        veritabani.execSQL("INSERT OR IGNORE INTO oyun1 (id , color2sizee2 ) VALUES (1,$sayac)")

                    }
                }

            val alert = AlertDialog.Builder(this)
            alert.setTitle("Congratulations")
            alert.setMessage("Score: " + sayac + " Play Again?")
            alert.setCancelable(false)


            alert.setPositiveButton("Yes") { dialogInterface, i: Int ->
                // Evet butonuna tıklayınca olacaklar
                val intent= Intent(applicationContext, TwoColorTwo::class.java)
                startActivity(intent)
                finish()
            }
               alert.setNegativeButton("No") { dialogInterface, i: Int ->
                val intent= Intent(applicationContext, PlayOptionsActivity::class.java)
                startActivity(intent)
                   finish()
            }
            alert.show()

        }
        else{
            Toast.makeText(this,"Keep Trying", Toast.LENGTH_LONG).show()

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
    fun a1ustyedek (view : View) {
        render(imageButton6, imageButton10,imageButton14,imageButton18 )
        sayac++
        textView.text = ""+sayac


    }
    fun a2ustyedek (view : View) {
        render(imageButton7, imageButton11,imageButton15,imageButton19 )
        sayac++
        textView.text = ""+sayac
    }
    fun a3ustyedek (view : View) {
        render(imageButton8, imageButton12,imageButton16,imageButton20 )
        sayac++
        textView.text = ""+sayac

    }
    fun a4ustyedek (view : View) {
        render(imageButton9, imageButton13,imageButton17,imageButton21 )
        sayac++
        textView.text = ""+sayac

    }
    fun a1yanyedek (view : View) {
        render(imageButton6, imageButton7,imageButton8,imageButton9 )
        sayac++
        textView.text = ""+sayac

    }
    fun a2yanyedek (view : View) {
        render(imageButton10, imageButton11,imageButton12,imageButton13 )
        sayac++
        textView.text = ""+sayac

    }
    fun a3yanyedek (view : View) {
        render(imageButton14, imageButton15,imageButton16,imageButton17 )
        sayac++
        textView.text = ""+sayac

    }
    fun a4yanyedek (view : View) {
        render(imageButton18, imageButton19,imageButton20,imageButton21 )
        sayac++
        textView.text = ""+sayac
    }
    fun a1ust (view : View) {
        render(imageButton6, imageButton10,imageButton14,imageButton18 )
        sayac++
        textView.text = ""+sayac
        //


    }
    fun a2ust (view : View) {
        render(imageButton7, imageButton11,imageButton15,imageButton19 )
        sayac++
        textView.text = ""+sayac
        //

    }
    fun a3ust (view : View) {
        render(imageButton8, imageButton12,imageButton16,imageButton20 )
        sayac++
        textView.text = ""+sayac
        //

    }
    fun a4ust (view : View) {
        render(imageButton9, imageButton13,imageButton17,imageButton21 )
        sayac++
        textView.text = ""+sayac
        //

    }
    fun a1yan (view : View) {
        render(imageButton6, imageButton7,imageButton8,imageButton9 )
        sayac++
        textView.text = ""+sayac
        //

    }
    fun a2yan (view : View) {
        render(imageButton10, imageButton11,imageButton12,imageButton13 )
        sayac++
        textView.text = ""+sayac
        //


    }
    fun a3yan (view : View) {
        render(imageButton14, imageButton15,imageButton16,imageButton17 )
        sayac++
        textView.text = ""+sayac

    }
    fun a4yan (view : View) {
        render(imageButton18, imageButton19,imageButton20,imageButton21 )
        sayac++
        textView.text = ""+sayac


    }

    fun a1ust23(view: View) {
        render(imageButton6, imageButton10,imageButton14,imageButton18 )
        sayac++
        textView.text = ""+sayac
        //

    }
    }
