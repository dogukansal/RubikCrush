package com.RubikCrush1.rubikcrushgame.mod3.FourColorGames

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
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import kotlinx.android.synthetic.main.activity_four_color_three3.*
import java.lang.Exception

class FourColorThree3 : AppCompatActivity() {
    lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four_color_three3)
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
        textView8.text = ""+sayac
        val rnds :ArrayList<Int> = arrayListOf<Int>()
        val butonsayisi : ArrayList<ImageButton> = arrayListOf<ImageButton>(
            imageButton436, imageButton442, imageButton443, // alındı

            imageButton414,  imageButton419, imageButton420,imageButton424, imageButton425, imageButton426,

            imageButton441, imageButton446, imageButton447, // alındı

            imageButton415,  imageButton421, imageButton422,  imageButton427, imageButton428, imageButton429,

            imageButton416, imageButton417,imageButton423, //alındı

            imageButton430, imageButton431, imageButton432,  imageButton437, imageButton438,  imageButton444,

            imageButton412, imageButton413,imageButton418, //alındı

            imageButton433, imageButton434, imageButton435, imageButton439, imageButton440,  imageButton445,
        )
        for (z in 0..35){
            val a = (0..11).random()
            rnds.add (a)
            //randomw sayilari tuttuk dışarıya çıkartma yüklemiyo !
        }
        for (i in 0..8) {
            kirmizi2(butonsayisi[i])
        }
        for (i in 9..17) {
            mavi2(butonsayisi[i])
        }
        for (i in 18..26) {
            yesil2(butonsayisi[i])
        }
        for (i in 27..35) {
            turuncu2(butonsayisi[i])
        }
        for (i in 0..35) {
            if(rnds[i]==0){
                imageButton448.performClick()
            }
            else if(rnds[i]==1){
                imageButton449.performClick()
            }
            else if(rnds[i]==2){
                imageButton450.performClick()
            }
            else if(rnds[i]==3){
                imageButton451.performClick()
            }
            else if(rnds[i]==4){
                imageButton452.performClick()
            }
            else if(rnds[i]==5){
                imageButton453.performClick()
            }
            else if(rnds[i]==6){
                imageButton466.performClick()
            }
            else if(rnds[i]==7){
                imageButton467.performClick()
            }
            else if(rnds[i]==8){
                imageButton468.performClick()
            }
            else if(rnds[i]==9){
                imageButton469.performClick()
            }
            else if(rnds[i]==10){
                imageButton470.performClick()
            }
            else if(rnds[i]==11){
                imageButton471.performClick()
            }
        }
        imageButton12.performClick()
        imageButton448.performClick()
        imageButton454.performClick()
        imageButton466.performClick()

        for (e in butonsayisi){
            e.setImageResource(android.R.color.transparent)
        }
        imageButton412.setImageResource(R.drawable.close)
        imageButton413.setImageResource(R.drawable.close)
        imageButton418.setImageResource(R.drawable.close)

        imageButton416.setImageResource(R.drawable.close)
        imageButton417.setImageResource(R.drawable.close)
        imageButton423.setImageResource(R.drawable.close)

        imageButton436.setImageResource(R.drawable.close)
        imageButton442.setImageResource(R.drawable.close)
        imageButton443.setImageResource(R.drawable.close)

        imageButton441.setImageResource(R.drawable.close)
        imageButton446.setImageResource(R.drawable.close)
        imageButton447.setImageResource(R.drawable.close)


        dene()

    var adRequest2 = AdRequest.Builder().build()

        InterstitialAd.load(this,"ca-app-pub-6469014985923539/6290567566", adRequest2, object : InterstitialAdLoadCallback() {
            override fun onAdFailedToLoad(adError: LoadAdError) {

                mInterstitialAd = null
            }

            override fun onAdLoaded(interstitialAd: InterstitialAd) {

                mInterstitialAd = interstitialAd
            }
        })
        mInterstitialAd?.fullScreenContentCallback = object: FullScreenContentCallback() {
            override fun onAdShowedFullScreenContent() {
                mInterstitialAd = null;
            }
        }
    }
    private var mInterstitialAd: InterstitialAd? = null

    var sayac=-40
    var x=0
    var runnable:Runnable = Runnable {  }
    var handler = Handler()
    fun dene(){
        x=0
        runnable = object : Runnable{
            override fun run() {
                x=x+1
                textView51.text=""+x
                handler.postDelayed(runnable,1000)
            }
        }
        handler.post(runnable)
    }

    fun check8(view : View){
        kontrol()
    }

    fun kontrol(){
        if( renkidalma1(imageButton412)==-16777216 && renkidalma1(imageButton413)==-16777216 && renkidalma1(imageButton424)==-5242848 &&
            renkidalma1(imageButton414)==-5242848 && renkidalma1(imageButton419)==-5242848 && renkidalma1(imageButton425)==-5242848 &&
            renkidalma1(imageButton418)==-16777216 && renkidalma1(imageButton420)==-5242848 && renkidalma1(imageButton426)==-5242848 &&
            //kırmızı
            renkidalma1(imageButton433)==-16777216 &&  renkidalma1(imageButton439)==-16777216 &&  renkidalma1(imageButton445)==-16777216 &&
            renkidalma1(imageButton434)==-16777216 &&  renkidalma1(imageButton440)==-16777216 &&  renkidalma1(imageButton446)==-16776961 &&
            renkidalma1(imageButton435)==-16777216 &&  renkidalma1(imageButton441)==-16776961 &&  renkidalma1(imageButton447)==-16776961 &&
            //siyah

            renkidalma1(imageButton415)==-16776961 && renkidalma1(imageButton421)==-16776961 && renkidalma1(imageButton427)==-16776961 &&
            renkidalma1(imageButton416)==-10053376 && renkidalma1(imageButton422)==-16776961 && renkidalma1(imageButton428)==-16776961 &&
            renkidalma1(imageButton417)==-10053376 && renkidalma1(imageButton423)==-10053376 && renkidalma1(imageButton429)==-16776961 &&
            //mavi

            renkidalma1(imageButton430)==-10053376 && renkidalma1(imageButton436)==-5242848 && renkidalma1(imageButton442)==-5242848 &&
            renkidalma1(imageButton431)==-10053376 && renkidalma1(imageButton437)==-10053376 && renkidalma1(imageButton443)==-5242848 &&
            renkidalma1(imageButton432)==-10053376 && renkidalma1(imageButton438)==-10053376 && renkidalma1(imageButton444)==-10053376 )
        //yesil

        {
            try {
                var deneme: Int = 0
                val veritabani = this.openOrCreateDatabase("DENEME4", Context.MODE_PRIVATE, null)
                veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun6 (id INTEGER PRİMARY KEY, color4sizee3 INTEGER UNIQUE)")
                val cursor1 = veritabani.rawQuery("SELECT * FROM oyun6", null)
                val idColumnIndex = cursor1.getColumnIndex("id")
                val isimColumnIndex = cursor1.getColumnIndex("color4sizee3")  //-1
                while (cursor1.moveToNext()) {
                    deneme = cursor1.getInt(isimColumnIndex)
                }
                if (deneme == 0) {
                    veritabani.execSQL("INSERT INTO oyun6 (id , color4sizee3 ) VALUES (1,$sayac)") // ilk başta veri yoksa tanımla
                } else {
                    if (sayac < deneme) {  // veri varsa bunu yap
                        veritabani.execSQL("INSERT OR IGNORE INTO oyun6 (id , color4sizee3 ) VALUES (1,$sayac)")
                    }
                }
            }
            catch (e : Exception){
            }
            if (mInterstitialAd != null) {
                mInterstitialAd?.show(this)
            }
            val alert = AlertDialog.Builder(this)
            alert.setTitle("Congratulations")
            alert.setMessage("Score: " + sayac + " Play Again?")
            alert.setCancelable(false)
            if(sayac<=130){
                alert.setIcon(R.drawable.star3)
            }
            else if (sayac<=160){
                alert.setIcon(R.drawable.star2)
            }
            else {
                alert.setIcon(R.drawable.star1)
            }
            alert.setPositiveButton("Yes") { dialogInterface: DialogInterface, i: Int ->

                // Evet butonuna tıklayınca olacaklar
                val intent= Intent(applicationContext, FourColorThree3::class.java)
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
    fun renkidalma1(imagebuton : ImageButton): Int {
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
    fun render(imagebuton1 : ImageButton, imagebuton2 : ImageButton, imagebuton3 : ImageButton, imagebuton4 : ImageButton, imagebuton5 : ImageButton, imagebuton6 : ImageButton){
        val a = renkidalma1(imagebuton1)
        val b = renkidalma1(imagebuton2)
        val c = renkidalma1(imagebuton3)
        val d = renkidalma1(imagebuton4)
        val e = renkidalma1(imagebuton5)
        val f = renkidalma1(imagebuton6)
        imagebuton1.setBackgroundColor(f)
        imagebuton2.setBackgroundColor(e)
        imagebuton3.setBackgroundColor(d)
        imagebuton4.setBackgroundColor(c)
        imagebuton5.setBackgroundColor(b)
        imagebuton6.setBackgroundColor(a)
    }
    fun render2(imagebuton1 : ImageButton, imagebuton2 : ImageButton, imagebuton3 : ImageButton, imagebuton4 : ImageButton){
        val a = renkidalma1(imagebuton1)
        val b = renkidalma1(imagebuton2)
        val c = renkidalma1(imagebuton3)
        val d = renkidalma1(imagebuton4)
        imagebuton1.setBackgroundColor(d)
        imagebuton2.setBackgroundColor(c)
        imagebuton3.setBackgroundColor(b)
        imagebuton4.setBackgroundColor(a)
    }

    fun rendercarpraz(imagebuton1 : ImageButton, imagebuton2 : ImageButton, imagebuton3 : ImageButton, imagebuton4 : ImageButton){
        val a = renkidalma1(imagebuton1)
        val b = renkidalma1(imagebuton2)
        val c = renkidalma1(imagebuton3)
        val d = renkidalma1(imagebuton4)

        imagebuton1.setBackgroundColor(d)
        imagebuton2.setBackgroundColor(c)
        imagebuton3.setBackgroundColor(b)
        imagebuton4.setBackgroundColor(a)

    }

    fun a11ust (view : View) {
        render(imageButton412, imageButton418, imageButton424, imageButton430, imageButton436, imageButton442)
        sayac++
        textView8.text = ""+sayac
    }
    fun a22ust (view : View) {
        render2( imageButton419, imageButton425, imageButton431, imageButton437 )
        sayac++
        textView8.text = ""+sayac
    }
    fun a33ust (view : View) {
        render(imageButton414, imageButton420, imageButton426, imageButton432, imageButton438, imageButton444)
        sayac++
        textView8.text = ""+sayac
    }
    fun a44ust (view : View) {
        render(imageButton415, imageButton421, imageButton427, imageButton433, imageButton439, imageButton445)
        sayac++
        textView8.text = ""+sayac
    }
    fun a55ust (view : View) {
        render2( imageButton422, imageButton428, imageButton434, imageButton440)
        sayac++
        textView8.text = ""+sayac
    }
    fun a66ust (view : View) {
        render(imageButton417, imageButton423, imageButton429, imageButton435, imageButton441, imageButton447)
        sayac++
        textView8.text = ""+sayac
    }

    fun a11yan (view : View) {
        render(imageButton412, imageButton413,imageButton414,imageButton415, imageButton416, imageButton417 )
        sayac++
        textView8.text = ""+sayac
    }
    fun a22yan (view : View) {
        render2( imageButton419, imageButton420, imageButton421, imageButton422 )
        sayac++
        textView8.text = ""+sayac
    }
    fun a33yan (view : View) {
        render(imageButton424, imageButton425, imageButton426, imageButton427, imageButton428, imageButton429)
        sayac++
        textView8.text = ""+sayac
    }
    fun a44yan (view : View) {
        render(imageButton430, imageButton431, imageButton432 , imageButton433, imageButton434, imageButton435)
        sayac++
        textView8.text = ""+sayac
    }
    fun a55yan (view : View) {
        render2( imageButton437, imageButton438, imageButton439, imageButton440)
        sayac++
        textView8.text = ""+sayac
    }
    fun a66yan (view : View) {
        render(imageButton442, imageButton443, imageButton444, imageButton445, imageButton446, imageButton447)
        sayac++
        textView8.text = ""+sayac
    }


    fun a11ustyedek (view : View) {
        render(imageButton412, imageButton418, imageButton424, imageButton430, imageButton436, imageButton442)
        sayac++
        textView8.text = ""+sayac
    }
    fun a22ustyedek (view : View) {
        render2( imageButton419, imageButton425, imageButton431, imageButton437 )
        sayac++
        textView8.text = ""+sayac
    }
    fun a33ustyedek (view : View) {
        render(imageButton414, imageButton420, imageButton426, imageButton432, imageButton438, imageButton444)
        sayac++
        textView8.text = ""+sayac
    }
    fun a44ustyedek (view : View) {
        render(imageButton415, imageButton421, imageButton427, imageButton433, imageButton439, imageButton445)
        sayac++
        textView8.text = ""+sayac
    }
    fun a55ustyedek (view : View) {
        render2( imageButton422, imageButton428, imageButton434, imageButton440)
        sayac++
        textView8.text = ""+sayac
    }
    fun a66ustyedek (view : View) {
        render(imageButton417, imageButton423, imageButton429, imageButton435, imageButton441, imageButton447)
        sayac++
        textView8.text = ""+sayac
    }

    fun a11yanyedek (view : View) {
        render(imageButton412, imageButton413,imageButton414,imageButton415, imageButton416, imageButton417 )
        sayac++
        textView8.text = ""+sayac
    }
    fun a22yanyedek (view : View) {
        render2( imageButton419, imageButton420, imageButton421, imageButton422 )
        sayac++
        textView8.text = ""+sayac
    }
    fun a33yanyedek (view : View) {
        render(imageButton424, imageButton425, imageButton426, imageButton427, imageButton428, imageButton429)
        sayac++
        textView8.text = ""+sayac
    }
    fun a44yanyedek (view : View) {
        render(imageButton430, imageButton431, imageButton432 , imageButton433, imageButton434, imageButton435)
        sayac++
        textView8.text = ""+sayac
    }
    fun a55yanyedek (view : View) {
        render2( imageButton437, imageButton438, imageButton439, imageButton440)
        sayac++
        textView8.text = ""+sayac
    }
    fun a66yanyedek (view : View) {
        render(imageButton442, imageButton443, imageButton444, imageButton445, imageButton446, imageButton447)
        sayac++
        textView8.text = ""+sayac
    }
    fun carprazsolust3 (view : View) {
        render2(imageButton412, imageButton413, imageButton416, imageButton417 )
        sayac++
        textView8.text = ""+sayac
    }
    fun carprazsagust3 (view : View) {
        render2(imageButton412, imageButton413, imageButton416, imageButton417 )
        sayac++
        textView8.text = ""+sayac
    }
    fun carprazsolalt3 (view : View) {
        render2(imageButton442, imageButton443, imageButton446, imageButton447)
        sayac++
        textView8.text = ""+sayac
    }
    fun carprazsagalt3 (view : View) {
        render2(imageButton442, imageButton443, imageButton446, imageButton447)
        sayac++
        textView8.text = ""+sayac
    }





}