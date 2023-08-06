package com.RubikCrush1.rubikcrushgame.mod3hard.ThreeColorGames

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
import kotlinx.android.synthetic.main.activity_three_color_four_hard3.*
import java.lang.Exception

class ThreeColorFourHard3 : AppCompatActivity() {
    lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_color_four_hard3)
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
        textView6.text = ""+sayac
        val rnds :ArrayList<Int> = arrayListOf<Int>()
        val butonsayisi : ArrayList<ImageButton> = arrayListOf<ImageButton>(
            imageButton323,imageButton331, imageButton332, imageButton339, imageButton340,imageButton341, //alındı
            imageButton286,imageButton318,imageButton325,
            imageButton293,imageButton294,
            imageButton300,imageButton302,
            imageButton307, imageButton308,imageButton309,

            imageButton320, imageButton321, imageButton322,
            imageButton327,  imageButton329,
            imageButton335, imageButton336,
            imageButton343,

            imageButton283, imageButton284,imageButton285,imageButton291, imageButton292,imageButton299, //alındı
            imageButton330,imageButton337, imageButton338,imageButton344, imageButton345, imageButton346, //alındı
            imageButton287, imageButton301,imageButton310,imageButton319,imageButton328,
            imageButton295, imageButton296,
            imageButton303,  imageButton305,
             imageButton312, imageButton313, imageButton314,
            //mavi
            imageButton315, imageButton316,imageButton317,
            imageButton324,imageButton326,imageButton304,
            imageButton333,imageButton334,imageButton311,
            imageButton342,
            imageButton288, imageButton289, imageButton290,
            imageButton297, imageButton298,
            imageButton306,
            //yesil
        )



        for (z in 0..63){
            val a = (0..15).random()
            rnds.add (a)
            //randomw sayilari tuttuk dışarıya çıkartma yüklemiyo !
        }
        for (i in 0..23) {
            kirmizi111(butonsayisi[i])
        }
        for (i in 24..47) {
            mavi111(butonsayisi[i])
        }
        for (i in 48..63) {
            yesil111(butonsayisi[i])
        }
        for (i in 0..35) {
            if(rnds[i]==0){
                imageButton347.performClick()
            }
            else if(rnds[i]==1){
                imageButton348.performClick()
            }
            else if(rnds[i]==2){
                imageButton349.performClick()
            }
            else if(rnds[i]==3){
                imageButton350.performClick()
            }
            else if(rnds[i]==4){
                imageButton351.performClick()
            }
            else if(rnds[i]==5){
                imageButton352.performClick()
            }
            else if(rnds[i]==6){
                imageButton353.performClick()
            }
            else if(rnds[i]==7){
                imageButton354.performClick()
            }
            else if(rnds[i]==8){
                imageButton371.performClick()
            }
            else if(rnds[i]==9){
                imageButton372.performClick()
            }
            else if(rnds[i]==10){
                imageButton373.performClick()
            }
            else if(rnds[i]==11){
                imageButton374.performClick()
            }
            else if(rnds[i]==12){
                imageButton375.performClick()
            }
            else if(rnds[i]==13){
                imageButton376.performClick()
            }
            else if(rnds[i]==14){
                imageButton377.performClick()
            }
            else if(rnds[i]==15){
                imageButton378.performClick()
            }
        }
        imageButton378.performClick()
        imageButton354.performClick()
        imageButton363.performClick()
        imageButton362.performClick()
        imageButton81.performClick()
        imageButton81.performClick()

        for (e in butonsayisi){
            e.setImageResource(android.R.color.transparent)
        }

        imageButton283.setImageResource(R.drawable.close)
        imageButton284.setImageResource(R.drawable.close)
        imageButton285.setImageResource(R.drawable.close)
        imageButton291.setImageResource(R.drawable.close)
        imageButton292.setImageResource(R.drawable.close)
        imageButton299.setImageResource(R.drawable.close)
        imageButton301.setImageResource(R.drawable.close)
        imageButton310.setImageResource(R.drawable.close)

        imageButton288.setImageResource(R.drawable.close)
        imageButton289.setImageResource(R.drawable.close)
        imageButton290.setImageResource(R.drawable.close)
        imageButton297.setImageResource(R.drawable.close)
        imageButton298.setImageResource(R.drawable.close)
        imageButton306.setImageResource(R.drawable.close)
        imageButton311.setImageResource(R.drawable.close)
        imageButton304.setImageResource(R.drawable.close)

        imageButton323.setImageResource(R.drawable.close)
        imageButton331.setImageResource(R.drawable.close)
        imageButton332.setImageResource(R.drawable.close)
        imageButton339.setImageResource(R.drawable.close)
        imageButton340.setImageResource(R.drawable.close)
        imageButton341.setImageResource(R.drawable.close)
        imageButton318.setImageResource(R.drawable.close)
        imageButton325.setImageResource(R.drawable.close)

        imageButton330.setImageResource(R.drawable.close)
        imageButton338.setImageResource(R.drawable.close)
        imageButton337.setImageResource(R.drawable.close)
        imageButton344.setImageResource(R.drawable.close)
        imageButton345.setImageResource(R.drawable.close)
        imageButton346.setImageResource(R.drawable.close)
        imageButton319.setImageResource(R.drawable.close)
        imageButton328.setImageResource(R.drawable.close)

        dene()

    var adRequest2 = AdRequest.Builder().build()

        InterstitialAd.load(this,"ca-app-pub-6469014985923539/1477224580", adRequest2, object : InterstitialAdLoadCallback() {
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
    var sayac=-42
    var x=0
    var runnable:Runnable = Runnable {  }
    var handler = Handler()
    fun dene(){
        x=0
        runnable = object : Runnable{
            override fun run() {
                x=x+1
                textView47.text=""+x
                handler.postDelayed(runnable,1000)
            }
        }
        handler.post(runnable)
    }
    fun check6(view : View){
        kontrol()
    }

    fun kontrol(){
        if( renkidalma111(imageButton283)==-16776961 && renkidalma111(imageButton284)==-16776961 && renkidalma111(imageButton285)==-16776961 && renkidalma111(imageButton286)==-5242848 &&
            renkidalma111(imageButton291)==-16776961 && renkidalma111(imageButton292)==-16776961 && renkidalma111(imageButton293)==-5242848 && renkidalma111(imageButton294)==-5242848 &&
            renkidalma111(imageButton299)==-16776961 && renkidalma111(imageButton300)==-5242848 && renkidalma111(imageButton301)==-16776961 && renkidalma111(imageButton302)==-5242848 &&
            renkidalma111(imageButton307)==-5242848 && renkidalma111(imageButton308)==-5242848 && renkidalma111(imageButton309)==-5242848 && renkidalma111(imageButton310)==-16776961 &&
            renkidalma111(imageButton319)==-16776961 && renkidalma111(imageButton320)==-5242848 && renkidalma111(imageButton321)==-5242848 && renkidalma111(imageButton322)==-5242848 &&
            renkidalma111(imageButton327)==-5242848 && renkidalma111(imageButton328)==-16776961 && renkidalma111(imageButton329)==-5242848 && renkidalma111(imageButton330)==-16776961 &&
            renkidalma111(imageButton335)==-5242848 && renkidalma111(imageButton336)==-5242848 && renkidalma111(imageButton337)==-16776961 && renkidalma111(imageButton338)==-16776961 &&
            renkidalma111(imageButton343)==-5242848 && renkidalma111(imageButton344)==-16776961 && renkidalma111(imageButton345)==-16776961 && renkidalma111(imageButton346)==-16776961 &&
            //kırmızı
            renkidalma111(imageButton315)==-10053376 && renkidalma111(imageButton316)==-10053376 && renkidalma111(imageButton317)==-10053376 && renkidalma111(imageButton318)==-5242848 &&
            renkidalma111(imageButton323)==-5242848 && renkidalma111(imageButton324)==-10053376 && renkidalma111(imageButton325)==-5242848 && renkidalma111(imageButton326)==-10053376 &&
            renkidalma111(imageButton331)==-5242848 && renkidalma111(imageButton332)==-5242848 && renkidalma111(imageButton333)==-10053376 && renkidalma111(imageButton334)==-10053376 &&
            renkidalma111(imageButton339)==-5242848 && renkidalma111(imageButton340)==-5242848 && renkidalma111(imageButton341)==-5242848 && renkidalma111(imageButton342)==-10053376 &&
            //yesil
            renkidalma111(imageButton287)==-16776961 && renkidalma111(imageButton288)==-10053376 && renkidalma111(imageButton289)==-10053376 && renkidalma111(imageButton290)==-10053376 &&
            renkidalma111(imageButton295)==-16776961 && renkidalma111(imageButton296)==-16776961 && renkidalma111(imageButton297)==-10053376 && renkidalma111(imageButton298)==-10053376 &&
            renkidalma111(imageButton303)==-16776961 && renkidalma111(imageButton304)==-10053376 && renkidalma111(imageButton305)==-16776961 && renkidalma111(imageButton306)==-10053376 &&
            renkidalma111(imageButton311)==-10053376 && renkidalma111(imageButton312)==-16776961 && renkidalma111(imageButton313)==-16776961 && renkidalma111(imageButton314)==-16776961
        //mavi
        )
        {
            try {
                var deneme: Int = 0
                val veritabani = this.openOrCreateDatabase("DENEME5", Context.MODE_PRIVATE, null)
                veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun5 (id INTEGER PRİMARY KEY, color3sizee4 INTEGER UNIQUE)")
                val cursor1 = veritabani.rawQuery("SELECT * FROM oyun5", null)
                val idColumnIndex = cursor1.getColumnIndex("id")
                val isimColumnIndex = cursor1.getColumnIndex("color3sizee4")  //-1
                while (cursor1.moveToNext()) {
                    deneme = cursor1.getInt(isimColumnIndex)
                }
                if (deneme == 0) {
                    veritabani.execSQL("INSERT INTO oyun5 (id , color3sizee4 ) VALUES (1,$sayac)") // ilk başta veri yoksa tanımla
                } else {
                    if (sayac < deneme) {  // veri varsa bunu yap
                        veritabani.execSQL("INSERT OR IGNORE INTO oyun5 (id , color3sizee4 ) VALUES (1,$sayac)")
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
            alert.setPositiveButton("Yes") { dialogInterface: DialogInterface, i: Int ->

                // Evet butonuna tıklayınca olacaklar
                val intent= Intent(applicationContext, ThreeColorFourHard3::class.java)
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
            Toast.makeText(getApplicationContext(),"Keep Trying", Toast.LENGTH_SHORT).show()
        }
    }

    fun renkidalma111(imagebuton : ImageButton): Int {
        val d = imagebuton.background as ColorDrawable
        val id =d.color
        return id
    }

    fun kirmizi111(imagebuton : ImageButton) {
        imagebuton.setBackgroundColor(-5242848)
    }
    fun mavi111(imagebuton : ImageButton) {
        imagebuton.setBackgroundColor(-16776961)
    }
    fun yesil111(imagebuton : ImageButton) {
        imagebuton.setBackgroundColor(-10053376)
    }
    fun render(imagebuton1 : ImageButton, imagebuton2 : ImageButton, imagebuton3 : ImageButton, imagebuton4 : ImageButton, imagebuton5 : ImageButton, imagebuton6 : ImageButton, imagebuton7 : ImageButton, imagebuton8 : ImageButton){
        val a = renkidalma111(imagebuton1)
        val b = renkidalma111(imagebuton2)
        val c = renkidalma111(imagebuton3)
        val d = renkidalma111(imagebuton4)
        val e = renkidalma111(imagebuton5)
        val f = renkidalma111(imagebuton6)
        val k = renkidalma111(imagebuton7)
        val l = renkidalma111(imagebuton8)
        imagebuton1.setBackgroundColor(l)
        imagebuton2.setBackgroundColor(k)
        imagebuton3.setBackgroundColor(f)
        imagebuton4.setBackgroundColor(e)
        imagebuton5.setBackgroundColor(d)
        imagebuton6.setBackgroundColor(c)
        imagebuton7.setBackgroundColor(b)
        imagebuton8.setBackgroundColor(a)
    }
    fun render1(imagebuton1 : ImageButton, imagebuton2 : ImageButton, imagebuton3 : ImageButton, imagebuton4 : ImageButton){
        val a = renkidalma111(imagebuton1)
        val b = renkidalma111(imagebuton2)
        val c = renkidalma111(imagebuton3)
        val d = renkidalma111(imagebuton4)
        imagebuton1.setBackgroundColor(d)
        imagebuton2.setBackgroundColor(c)
        imagebuton3.setBackgroundColor(b)
        imagebuton4.setBackgroundColor(a)

    }
    fun rendercarpraz(imagebuton1 : ImageButton, imagebuton2 : ImageButton, imagebuton3 : ImageButton, imagebuton4 : ImageButton, imagebuton5 : ImageButton, imagebuton6 : ImageButton, imagebuton7 : ImageButton, imagebuton8 : ImageButton){
        val a = renkidalma111(imagebuton1)
        val b = renkidalma111(imagebuton2)
        val c = renkidalma111(imagebuton3)
        val d = renkidalma111(imagebuton4)
        val e = renkidalma111(imagebuton5)
        val f = renkidalma111(imagebuton6)
        val k = renkidalma111(imagebuton7)
        val l = renkidalma111(imagebuton8)
        imagebuton1.setBackgroundColor(l)
        imagebuton2.setBackgroundColor(a)
        imagebuton3.setBackgroundColor(b)
        imagebuton4.setBackgroundColor(c)
        imagebuton5.setBackgroundColor(d)
        imagebuton6.setBackgroundColor(e)
        imagebuton7.setBackgroundColor(f)
        imagebuton8.setBackgroundColor(k)
    }


    fun a111ust3 (view : View) {
        render(imageButton283, imageButton291,imageButton299,imageButton307, imageButton315, imageButton323, imageButton331, imageButton339 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a222ust3 (view : View) {
        render1( imageButton300,imageButton308, imageButton316, imageButton324 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a333ust3 (view : View) {
        render1( imageButton293,imageButton309, imageButton317,  imageButton333 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a444ust3 (view : View) {
        render(imageButton286, imageButton294,imageButton302,imageButton310, imageButton318, imageButton326, imageButton334, imageButton342 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a555ust3 (view : View) {
        render(imageButton287, imageButton295,imageButton303,imageButton311, imageButton319, imageButton327, imageButton335, imageButton343 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a666ust3 (view : View) {
        render1( imageButton296,imageButton312, imageButton320,  imageButton336 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a777ust3 (view : View) {
        render1( imageButton305,imageButton313, imageButton321, imageButton329 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a888ust3 (view : View) {
        render(imageButton290, imageButton298,imageButton306,imageButton314, imageButton322, imageButton330, imageButton338, imageButton346 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a111yan3 (view : View) {
        render(imageButton283, imageButton284,imageButton285,imageButton286, imageButton287, imageButton288, imageButton289, imageButton290 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a222yan3 (view : View) {
        render1( imageButton293,imageButton294, imageButton295, imageButton296 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a333yan3 (view : View) {
        render1( imageButton300,imageButton302, imageButton303, imageButton305 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a444yan3 (view : View) {
        render(imageButton307, imageButton308,imageButton309,imageButton310, imageButton311, imageButton312, imageButton313, imageButton314 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a555yan3 (view : View) {
        render(imageButton315, imageButton316,imageButton317,imageButton318, imageButton319, imageButton320, imageButton321, imageButton322 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a666yan3 (view : View) {
        render1( imageButton324,imageButton326, imageButton327,  imageButton329)
        sayac++
        textView6.text = ""+sayac
    }
    fun a777yan3 (view : View) {
        render1( imageButton333,imageButton334, imageButton335, imageButton336)
        sayac++
        textView6.text = ""+sayac
    }

    fun a888yan3 (view : View) {
        render(imageButton339, imageButton340,imageButton341,imageButton342, imageButton343, imageButton344, imageButton345, imageButton346)
        sayac++
        textView6.text = ""+sayac
    }


    fun a111ustyedek3 (view : View) {
        render(imageButton283, imageButton291,imageButton299,imageButton307, imageButton315, imageButton323, imageButton331, imageButton339 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a222ustyedek3 (view : View) {
        render1( imageButton300,imageButton308, imageButton316, imageButton324 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a333ustyedek3 (view : View) {
        render1( imageButton293,imageButton309, imageButton317,  imageButton333 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a444ustyedek3 (view : View) {
        render(imageButton286, imageButton294,imageButton302,imageButton310, imageButton318, imageButton326, imageButton334, imageButton342 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a555ustyedek3 (view : View) {
        render(imageButton287, imageButton295,imageButton303,imageButton311, imageButton319, imageButton327, imageButton335, imageButton343 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a666ustyedek3 (view : View) {
        render1( imageButton296,imageButton312, imageButton320,  imageButton336 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a777ustyedek3 (view : View) {
        render1( imageButton305,imageButton313, imageButton321, imageButton329 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a888ustyedek3 (view : View) {
        render(imageButton290, imageButton298,imageButton306,imageButton314, imageButton322, imageButton330, imageButton338, imageButton346 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a111yanyedek3 (view : View) {
        render(imageButton283, imageButton284,imageButton285,imageButton286, imageButton287, imageButton288, imageButton289, imageButton290 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a222yanyedek3 (view : View) {
        render1( imageButton293,imageButton294, imageButton295, imageButton296 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a333yanyedek3 (view : View) {
        render1( imageButton300,imageButton302, imageButton303, imageButton305 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a444yanyedek3 (view : View) {
        render(imageButton307, imageButton308,imageButton309,imageButton310, imageButton311, imageButton312, imageButton313, imageButton314 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a555yanyedek3 (view : View) {
        render(imageButton315, imageButton316,imageButton317,imageButton318, imageButton319, imageButton320, imageButton321, imageButton322 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a666yanyedek3 (view : View) {
        render1( imageButton324,imageButton326, imageButton327,  imageButton329)
        sayac++
        textView6.text = ""+sayac
    }
    fun a777yanyedek3 (view : View) {
        render1( imageButton333,imageButton334, imageButton335, imageButton336)
        sayac++
        textView6.text = ""+sayac
    }

    fun a888yanyedek3 (view : View) {
        render(imageButton339, imageButton340,imageButton341,imageButton342, imageButton343, imageButton344, imageButton345, imageButton346)
        sayac++
        textView6.text = ""+sayac
    }

    fun carprazsolust5 (view : View) {
        rendercarpraz(imageButton346, imageButton337,imageButton328, imageButton319, imageButton310, imageButton301,imageButton292, imageButton283  )
        sayac++
        textView6.text = ""+sayac
    }
    fun carprazsagust5 (view : View) {
        rendercarpraz(imageButton339, imageButton332,imageButton325, imageButton318, imageButton311, imageButton304, imageButton297, imageButton290)
        sayac++
        textView6.text = ""+sayac
    }
    fun carprazsolalt5 (view : View) {
        rendercarpraz(imageButton290, imageButton297,imageButton304, imageButton311, imageButton318, imageButton325, imageButton332, imageButton339)
        sayac++
        textView6.text = ""+sayac
    }
    fun carprazsagalt5 (view : View) {
        rendercarpraz(imageButton283, imageButton292,imageButton301, imageButton310, imageButton319, imageButton328,imageButton337, imageButton346  )
        sayac++
        textView6.text = ""+sayac
    }
}