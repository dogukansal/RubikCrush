package com.RubikCrush1.rubikcrushgame.mod4.ThreeColorGames

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
import kotlinx.android.synthetic.main.activity_three_color_four4.*
import java.lang.Exception

class ThreeColorFour4 : AppCompatActivity() {
    lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_color_four4)
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)


        textView6.text = ""+sayac
        val rnds :ArrayList<Int> = arrayListOf<Int>()
        val butonsayisi : ArrayList<ImageButton> = arrayListOf<ImageButton>(
            imageButton283, imageButton284,imageButton285,imageButton286,
            imageButton291, imageButton316,imageButton324,
            imageButton299, imageButton301,imageButton302,
            imageButton307, imageButton309,imageButton310,
            //kırmızı
            imageButton319, imageButton320,  imageButton322,
            imageButton327, imageButton328,  imageButton330,
             imageButton338,imageButton332,imageButton333,imageButton334,
            imageButton343, imageButton344, imageButton345, imageButton346,
            //kırmızı
            imageButton287, imageButton288, imageButton289, imageButton290,
             imageButton298,
            imageButton303, imageButton304,  imageButton306,
            imageButton311, imageButton312, imageButton314,
            imageButton292,imageButton293,imageButton294,imageButton300,imageButton308,
            imageButton321,imageButton329,imageButton335, imageButton336, imageButton337,
            //mavi
            imageButton315, imageButton317,imageButton318,
            imageButton323, imageButton325,imageButton326,
            imageButton331, imageButton295, imageButton296, imageButton297,imageButton305,imageButton313,
            imageButton339, imageButton340,imageButton341,imageButton342,
            //yesil
        )



        for (z in 0..63){
            val a = (0..15).random()
            rnds.add (a)
            //randomw sayilari tuttuk dışarıya çıkartma yüklemiyo !
        }
        for (i in 0..26) {
            kirmizi111(butonsayisi[i])
        }
        for (i in 27..47) {
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
        for (i in 0..35) {
            if(rnds[i]==0){
                imageButton80.performClick()
            }
            else if(rnds[i]==1){
                imageButton81.performClick()
            }
            else if(rnds[i]==2){
                imageButton79.performClick()
            }
            else if(rnds[i]==3){
                imageButton21.performClick()
            }
            else if(rnds[i]==4){
                imageButton348.performClick()
            }
            else if(rnds[i]==5){
                imageButton353.performClick()
            }
            else if(rnds[i]==6){
                imageButton348.performClick()
            }
            else if(rnds[i]==7){
                imageButton353.performClick()
            }
            else if(rnds[i]==8){
                imageButton80.performClick()
            }
            else if(rnds[i]==9){
                imageButton81.performClick()
            }
            else if(rnds[i]==10){
                imageButton79.performClick()
            }
            else if(rnds[i]==11){
                imageButton21.performClick()
            }
            else if(rnds[i]==12){
                imageButton80.performClick()
            }
            else if(rnds[i]==13){
                imageButton81.performClick()
            }
            else if(rnds[i]==14){
                imageButton79.performClick()
            }
            else if(rnds[i]==15){
                imageButton21.performClick()
            }
        }
        for (e in butonsayisi){
            e.setImageResource(android.R.color.transparent)
        }

        imageButton292.setImageResource(R.drawable.close)
        imageButton293.setImageResource(R.drawable.close)
        imageButton294.setImageResource(R.drawable.close)
        imageButton295.setImageResource(R.drawable.close)
        imageButton296.setImageResource(R.drawable.close)
        imageButton297.setImageResource(R.drawable.close)

        imageButton332.setImageResource(R.drawable.close)
        imageButton333.setImageResource(R.drawable.close)
        imageButton334.setImageResource(R.drawable.close)
        imageButton335.setImageResource(R.drawable.close)
        imageButton336.setImageResource(R.drawable.close)
        imageButton337.setImageResource(R.drawable.close)

        imageButton300.setImageResource(R.drawable.close)
        imageButton308.setImageResource(R.drawable.close)
        imageButton316.setImageResource(R.drawable.close)
        imageButton324.setImageResource(R.drawable.close)

        imageButton305.setImageResource(R.drawable.close)
        imageButton313.setImageResource(R.drawable.close)
        imageButton321.setImageResource(R.drawable.close)
        imageButton329.setImageResource(R.drawable.close)

        dene()
        var adRequest2 = AdRequest.Builder().build()

        InterstitialAd.load(this,"ca-app-pub-6469014985923539/8090734396", adRequest2, object : InterstitialAdLoadCallback() {
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
    var sayac=-72
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
        if( renkidalma111(imageButton283)==-5242848 && renkidalma111(imageButton284)==-5242848 && renkidalma111(imageButton285)==-5242848 && renkidalma111(imageButton286)==-5242848 &&
            renkidalma111(imageButton291)==-5242848 && renkidalma111(imageButton292)==-16776961 && renkidalma111(imageButton293)==-16776961 && renkidalma111(imageButton294)==-16776961 &&
            renkidalma111(imageButton299)==-5242848 && renkidalma111(imageButton300)==-16776961 && renkidalma111(imageButton301)==-5242848 && renkidalma111(imageButton302)==-5242848 &&
            renkidalma111(imageButton307)==-5242848 && renkidalma111(imageButton308)==-16776961 && renkidalma111(imageButton309)==-5242848 && renkidalma111(imageButton310)==-5242848 &&
            renkidalma111(imageButton319)==-5242848 && renkidalma111(imageButton320)==-5242848 && renkidalma111(imageButton321)==-16776961 && renkidalma111(imageButton322)==-5242848 &&
            renkidalma111(imageButton327)==-5242848 && renkidalma111(imageButton328)==-5242848 && renkidalma111(imageButton329)==-16776961 && renkidalma111(imageButton330)==-5242848 &&
            renkidalma111(imageButton335)==-16776961 && renkidalma111(imageButton336)==-16776961 && renkidalma111(imageButton337)==-16776961 && renkidalma111(imageButton338)==-5242848 &&
            renkidalma111(imageButton343)==-5242848 && renkidalma111(imageButton344)==-5242848 && renkidalma111(imageButton345)==-5242848 && renkidalma111(imageButton346)==-5242848 &&
            //kırmızı
            renkidalma111(imageButton315)==-10053376 && renkidalma111(imageButton316)==-5242848 && renkidalma111(imageButton317)==-10053376 && renkidalma111(imageButton318)==-10053376 &&
            renkidalma111(imageButton323)==-10053376 && renkidalma111(imageButton324)==-5242848 && renkidalma111(imageButton325)==-10053376 && renkidalma111(imageButton326)==-10053376 &&
            renkidalma111(imageButton331)==-10053376 && renkidalma111(imageButton332)==-5242848 && renkidalma111(imageButton333)==-5242848 && renkidalma111(imageButton334)==-5242848 &&
            renkidalma111(imageButton339)==-10053376 && renkidalma111(imageButton340)==-10053376 && renkidalma111(imageButton341)==-10053376 && renkidalma111(imageButton342)==-10053376 &&
            //yesil
            renkidalma111(imageButton287)==-16776961 && renkidalma111(imageButton288)==-16776961 && renkidalma111(imageButton289)==-16776961 && renkidalma111(imageButton290)==-16776961 &&
            renkidalma111(imageButton295)==-10053376 && renkidalma111(imageButton296)==-10053376 && renkidalma111(imageButton297)==-10053376 && renkidalma111(imageButton298)==-16776961 &&
            renkidalma111(imageButton303)==-16776961 && renkidalma111(imageButton304)==-16776961 && renkidalma111(imageButton305)==-10053376 && renkidalma111(imageButton306)==-16776961 &&
            renkidalma111(imageButton311)==-16776961 && renkidalma111(imageButton312)==-16776961 && renkidalma111(imageButton313)==-10053376 && renkidalma111(imageButton314)==-16776961
        //mavi
        )
        {
            try {
                var deneme: Int = 0
                val veritabani = this.openOrCreateDatabase("DENEME6", Context.MODE_PRIVATE, null)
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
            if(sayac<=150){
                alert.setIcon(R.drawable.star3)
            }
            else if (sayac<=170){
                alert.setIcon(R.drawable.star2)
            }
            else {
                alert.setIcon(R.drawable.star1)
            }
            alert.setPositiveButton("Yes") { dialogInterface: DialogInterface, i: Int ->

                // Evet butonuna tıklayınca olacaklar
                val intent= Intent(applicationContext, ThreeColorFour4::class.java)
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
    fun render(imagebuton1 : ImageButton, imagebuton2 : ImageButton, imagebuton3 : ImageButton, imagebuton4 : ImageButton, imagebuton5 : ImageButton
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
        imagebuton1.setBackgroundColor(l)
        imagebuton2.setBackgroundColor(k)
        imagebuton3.setBackgroundColor(f)
        imagebuton4.setBackgroundColor(e)
        imagebuton5.setBackgroundColor(d)
        imagebuton6.setBackgroundColor(c)
        imagebuton7.setBackgroundColor(b)
        imagebuton8.setBackgroundColor(a)
    }
    fun render2(imagebuton1 : ImageButton, imagebuton2 : ImageButton, imagebuton3 : ImageButton, imagebuton4 : ImageButton, imagebuton5 : ImageButton
                , imagebuton6 : ImageButton
    ){
        val a = renkidalma111(imagebuton1)
        val b = renkidalma111(imagebuton2)
        val c = renkidalma111(imagebuton3)
        val d = renkidalma111(imagebuton4)
        val e = renkidalma111(imagebuton5)
        val f = renkidalma111(imagebuton6)

        imagebuton1.setBackgroundColor(f)
        imagebuton2.setBackgroundColor(e)
        imagebuton3.setBackgroundColor(d)
        imagebuton4.setBackgroundColor(c)
        imagebuton5.setBackgroundColor(b)
        imagebuton6.setBackgroundColor(a)

    }
    fun render3(imagebuton1 : ImageButton, imagebuton2 : ImageButton
    ){
        val a = renkidalma111(imagebuton1)
        val b = renkidalma111(imagebuton2)
        imagebuton1.setBackgroundColor(b)
        imagebuton2.setBackgroundColor(a)
    }

    fun rendercarpraz(imagebuton1 : ImageButton, imagebuton2 : ImageButton, imagebuton3 : ImageButton, imagebuton4 : ImageButton, imagebuton5 : ImageButton
                      , imagebuton6 : ImageButton
    ){
        val a = renkidalma111(imagebuton1)
        val b = renkidalma111(imagebuton2)
        val c = renkidalma111(imagebuton3)
        val d = renkidalma111(imagebuton4)
        val e = renkidalma111(imagebuton5)
        val f = renkidalma111(imagebuton6)

        imagebuton1.setBackgroundColor(f)
        imagebuton2.setBackgroundColor(a)
        imagebuton3.setBackgroundColor(b)
        imagebuton4.setBackgroundColor(c)
        imagebuton5.setBackgroundColor(d)
        imagebuton6.setBackgroundColor(e)

    }

    fun a111ust3 (view : View) {
        render(imageButton283, imageButton291,imageButton299,imageButton307, imageButton315, imageButton323, imageButton331, imageButton339 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a222ust3 (view : View) {
        render(imageButton284, imageButton292,imageButton300,imageButton308, imageButton316, imageButton324, imageButton332, imageButton340 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a333ust3 (view : View) {
        render2(imageButton285,imageButton301,imageButton309, imageButton317, imageButton325 , imageButton341 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a444ust3 (view : View) {
        render2(imageButton286 ,imageButton302,imageButton310, imageButton318, imageButton326 , imageButton342 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a555ust3 (view : View) {
        render2(imageButton287 ,imageButton303,imageButton311, imageButton319, imageButton327 , imageButton343 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a666ust3 (view : View) {
        render2(imageButton288 ,imageButton304,imageButton312, imageButton320, imageButton328 , imageButton344 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a777ust3 (view : View) {
        render(imageButton289, imageButton297,imageButton305,imageButton313, imageButton321, imageButton329, imageButton337, imageButton345 )
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
        render3(imageButton291, imageButton298 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a333yan3 (view : View) {
        render2(imageButton299 ,imageButton301,imageButton302, imageButton303, imageButton304, imageButton306 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a444yan3 (view : View) {
        render2(imageButton307 ,imageButton309,imageButton310, imageButton311, imageButton312 , imageButton314 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a555yan3 (view : View) {
        render2(imageButton315 ,imageButton317,imageButton318, imageButton319, imageButton320, imageButton322 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a666yan3 (view : View) {
        render2(imageButton323,imageButton325,imageButton326, imageButton327, imageButton328, imageButton330)
        sayac++
        textView6.text = ""+sayac
    }
    fun a777yan3 (view : View) {
        render3(imageButton331,  imageButton338)
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
        render(imageButton284, imageButton292,imageButton300,imageButton308, imageButton316, imageButton324, imageButton332, imageButton340 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a333ustyedek3 (view : View) {
        render2(imageButton285,imageButton301,imageButton309, imageButton317, imageButton325 , imageButton341 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a444ustyedek3 (view : View) {
        render2(imageButton286 ,imageButton302,imageButton310, imageButton318, imageButton326 , imageButton342 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a555ustyedek3 (view : View) {
        render2(imageButton287 ,imageButton303,imageButton311, imageButton319, imageButton327 , imageButton343 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a666ustyedek3 (view : View) {
        render2(imageButton288 ,imageButton304,imageButton312, imageButton320, imageButton328 , imageButton344 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a777ustyedek3 (view : View) {
        render(imageButton289, imageButton297,imageButton305,imageButton313, imageButton321, imageButton329, imageButton337, imageButton345 )
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
        render3(imageButton291, imageButton298 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a333yanyedek3 (view : View) {
        render2(imageButton299 ,imageButton301,imageButton302, imageButton303, imageButton304, imageButton306 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a444yanyedek3 (view : View) {
        render2(imageButton307 ,imageButton309,imageButton310, imageButton311, imageButton312 , imageButton314 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a555yanyedek3 (view : View) {
        render2(imageButton315 ,imageButton317,imageButton318, imageButton319, imageButton320, imageButton322 )
        sayac++
        textView6.text = ""+sayac
    }
    fun a666yanyedek3 (view : View) {
        render2(imageButton323,imageButton325,imageButton326, imageButton327, imageButton328, imageButton330)
        sayac++
        textView6.text = ""+sayac
    }
    fun a777yanyedek3 (view : View) {
        render3(imageButton331,  imageButton338)
        sayac++
        textView6.text = ""+sayac
    }

    fun a888yanyedek3 (view : View) {
        render(imageButton339, imageButton340,imageButton341,imageButton342, imageButton343, imageButton344, imageButton345, imageButton346)
        sayac++
        textView6.text = ""+sayac
    }
    fun carprazsolust5 (view : View) {
        rendercarpraz(imageButton297, imageButton296,imageButton295,imageButton294, imageButton293, imageButton292)
        sayac++
        textView6.text = ""+sayac
    }
    fun carprazsagust5 (view : View) {
        rendercarpraz(imageButton292, imageButton293,imageButton294,imageButton295, imageButton296, imageButton297)
        sayac++
        textView6.text = ""+sayac
    }
    fun carprazsolalt5 (view : View) {
        rendercarpraz(imageButton337, imageButton336,imageButton335,imageButton334, imageButton333, imageButton332)
        sayac++
        textView6.text = ""+sayac
    }
    fun carprazsagalt5 (view : View) {
        rendercarpraz(imageButton332, imageButton333,imageButton334,imageButton335, imageButton336, imageButton337)
        sayac++
        textView6.text = ""+sayac
    }


}