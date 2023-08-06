package com.RubikCrush1.rubikcrushgame.mod4.FourColorGames

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
import kotlinx.android.synthetic.main.activity_four_color_four4.*
import java.lang.Exception

class FourColorFour4 : AppCompatActivity() {
    lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four_color_four4)
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
        textView9.text = ""+sayac
        val rnds :ArrayList<Int> = arrayListOf<Int>()
        val butonsayisi : ArrayList<ImageButton> = arrayListOf<ImageButton>(
            imageButton472, imageButton473, imageButton474, imageButton475,
            imageButton480,
            imageButton488,  imageButton490, imageButton491,
            imageButton496,  imageButton498, imageButton499,
            imageButton505, imageButton513,imageButton521, imageButton522, imageButton523,

            imageButton476, imageButton477, imageButton478, imageButton479,
            imageButton487,
            imageButton492, imageButton493,  imageButton495,
            imageButton500, imageButton501,  imageButton503,
            imageButton510,imageButton518,imageButton524, imageButton525, imageButton526,

            imageButton484, imageButton485, imageButton486,imageButton494,imageButton502,
            imageButton504,  imageButton506, imageButton507,
            imageButton512,  imageButton514, imageButton515,
            imageButton520,
            imageButton528, imageButton529, imageButton530, imageButton531,

            imageButton481, imageButton482, imageButton483,imageButton497,imageButton489,
            imageButton508, imageButton509,  imageButton511,
            imageButton516, imageButton517,  imageButton519,
             imageButton527,
            imageButton532, imageButton533, imageButton534, imageButton535
        )
        for (z in 0..63){
            val a = (0..15).random()
            rnds.add (a)
            //randomw sayilari tuttuk dışarıya çıkartma yüklemiyo !
        }
        for (i in 0..15) {
            kirmizi222(butonsayisi[i])
        }
        for (i in 16..31) {
            mavi222(butonsayisi[i])
        }
        for (i in 32..47) {
            yesil222(butonsayisi[i])
        }
        for (i in 48..63) {
            turuncu222(butonsayisi[i])
        }
        for (i in 0..35) {
            if(rnds[i]==0){
                imageButton537.performClick()
            }
            else if(rnds[i]==1){
                imageButton538.performClick()
            }
            else if(rnds[i]==2){
                imageButton539.performClick()
            }
            else if(rnds[i]==3){
                imageButton540.performClick()
            }
            else if(rnds[i]==4){
                imageButton541.performClick()
            }
            else if(rnds[i]==5){
                imageButton542.performClick()
            }
            else if(rnds[i]==6){
                imageButton543.performClick()
            }
            else if(rnds[i]==7){
                imageButton544.performClick()
            }
            else if(rnds[i]==8){
                imageButton561.performClick()
            }
            else if(rnds[i]==9){
                imageButton562.performClick()
            }
            else if(rnds[i]==10){
                imageButton563.performClick()
            }
            else if(rnds[i]==11){
                imageButton564.performClick()
            }
            else if(rnds[i]==12){
                imageButton565.performClick()
            }
            else if(rnds[i]==13){
                imageButton566.performClick()
            }
            else if(rnds[i]==14){
                imageButton567.performClick()
            }
            else if(rnds[i]==15){
                imageButton568.performClick()
            }
        }

        for (i in 0..35) {
            if(rnds[i]==0){
                imageButton82.performClick()
            }
            else if(rnds[i]==1){
                imageButton83.performClick()
            }
            else if(rnds[i]==2){
                imageButton84.performClick()
            }
            else if(rnds[i]==3){
                imageButton85.performClick()
            }
            else if(rnds[i]==4){
                imageButton538.performClick()
            }
            else if(rnds[i]==5){
                imageButton543.performClick()
            }
            else if(rnds[i]==6){
                imageButton538.performClick()
            }
            else if(rnds[i]==7){
                imageButton543.performClick()
            }
            else if(rnds[i]==8){
                imageButton82.performClick()
            }
            else if(rnds[i]==9){
                imageButton83.performClick()
            }
            else if(rnds[i]==10){
                imageButton84.performClick()
            }
            else if(rnds[i]==11){
                imageButton85.performClick()
            }
            else if(rnds[i]==12){
                imageButton82.performClick()
            }
            else if(rnds[i]==13){
                imageButton83.performClick()
            }
            else if(rnds[i]==14){
                imageButton84.performClick()
            }
            else if(rnds[i]==15){
                imageButton85.performClick()
            }
        }
        for (e in butonsayisi){
            e.setImageResource(android.R.color.transparent)
        }
        imageButton481.setImageResource(R.drawable.close)
        imageButton482.setImageResource(R.drawable.close)
        imageButton483.setImageResource(R.drawable.close)
        imageButton484.setImageResource(R.drawable.close)
        imageButton485.setImageResource(R.drawable.close)
        imageButton486.setImageResource(R.drawable.close)

        imageButton521.setImageResource(R.drawable.close)
        imageButton522.setImageResource(R.drawable.close)
        imageButton523.setImageResource(R.drawable.close)
        imageButton524.setImageResource(R.drawable.close)
        imageButton525.setImageResource(R.drawable.close)
        imageButton526.setImageResource(R.drawable.close)

        imageButton489.setImageResource(R.drawable.close)
        imageButton497.setImageResource(R.drawable.close)
        imageButton513.setImageResource(R.drawable.close)
        imageButton505.setImageResource(R.drawable.close)

        imageButton494.setImageResource(R.drawable.close)
        imageButton502.setImageResource(R.drawable.close)
        imageButton510.setImageResource(R.drawable.close)
        imageButton518.setImageResource(R.drawable.close)

        dene()
        var adRequest2 = AdRequest.Builder().build()

        InterstitialAd.load(this,"ca-app-pub-6469014985923539/5173567646", adRequest2, object : InterstitialAdLoadCallback() {
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
                textView52.text=""+x
                handler.postDelayed(runnable,1000)
            }
        }
        handler.post(runnable)
    }
    fun check9(view : View){
        kontrol()
    }

    fun kontrol(){
        if( renkidalma111(imageButton472)==-5242848 && renkidalma111(imageButton473)==-5242848 && renkidalma111(imageButton474)==-5242848 && renkidalma111(imageButton475)==-5242848 &&
            renkidalma111(imageButton480)==-5242848 && renkidalma111(imageButton481)==-16777216 && renkidalma111(imageButton482)==-16777216 && renkidalma111(imageButton483)==-16777216 &&
            renkidalma111(imageButton488)==-5242848 && renkidalma111(imageButton489)==-16777216 && renkidalma111(imageButton490)==-5242848 && renkidalma111(imageButton491)==-5242848 &&
            renkidalma111(imageButton496)==-5242848 && renkidalma111(imageButton497)==-16777216 && renkidalma111(imageButton498)==-5242848 && renkidalma111(imageButton499)==-5242848 &&
            //kırmızı
            renkidalma111(imageButton508)==-16777216 && renkidalma111(imageButton509)==-16777216 && renkidalma111(imageButton510)==-16776961 && renkidalma111(imageButton511)==-16777216 &&
            renkidalma111(imageButton516)==-16777216 && renkidalma111(imageButton517)==-16777216 && renkidalma111(imageButton518)==-16776961 && renkidalma111(imageButton519)==-16777216 &&
            renkidalma111(imageButton524)==-16776961 && renkidalma111(imageButton525)==-16776961 && renkidalma111(imageButton526)==-16776961 && renkidalma111(imageButton527)==-16777216 &&
            renkidalma111(imageButton532)==-16777216 && renkidalma111(imageButton533)==-16777216 && renkidalma111(imageButton534)==-16777216 && renkidalma111(imageButton535)==-16777216 &&
            //siyah
            renkidalma111(imageButton504)==-10053376 && renkidalma111(imageButton505)==-5242848 && renkidalma111(imageButton506)==-10053376 && renkidalma111(imageButton507)==-10053376 &&
            renkidalma111(imageButton512)==-10053376 && renkidalma111(imageButton513)==-5242848 && renkidalma111(imageButton514)==-10053376 && renkidalma111(imageButton515)==-10053376 &&
            renkidalma111(imageButton520)==-10053376 && renkidalma111(imageButton521)==-5242848 && renkidalma111(imageButton522)==-5242848 && renkidalma111(imageButton523)==-5242848 &&
            renkidalma111(imageButton528)==-10053376 && renkidalma111(imageButton529)==-10053376 && renkidalma111(imageButton530)==-10053376 && renkidalma111(imageButton531)==-10053376 &&
            //yesil
            renkidalma111(imageButton476)==-16776961 && renkidalma111(imageButton477)==-16776961 && renkidalma111(imageButton478)==-16776961 && renkidalma111(imageButton479)==-16776961 &&
            renkidalma111(imageButton484)==-10053376 && renkidalma111(imageButton485)==-10053376 && renkidalma111(imageButton486)==-10053376 && renkidalma111(imageButton487)==-16776961 &&
            renkidalma111(imageButton492)==-16776961 && renkidalma111(imageButton493)==-16776961 && renkidalma111(imageButton494)==-10053376 && renkidalma111(imageButton495)==-16776961 &&
            renkidalma111(imageButton500)==-16776961 && renkidalma111(imageButton501)==-16776961 && renkidalma111(imageButton502)==-10053376 && renkidalma111(imageButton503)==-16776961
        //mavi
        )
        {
            try {
                var deneme: Int = 0
                val veritabani = this.openOrCreateDatabase("DENEME6", Context.MODE_PRIVATE, null)
                veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun7 (id INTEGER PRİMARY KEY, color4sizee4 INTEGER UNIQUE)")
                val cursor1 = veritabani.rawQuery("SELECT * FROM oyun7", null)
                val idColumnIndex = cursor1.getColumnIndex("id")
                val isimColumnIndex = cursor1.getColumnIndex("color4sizee4")  //-1
                while (cursor1.moveToNext()) {
                    deneme = cursor1.getInt(isimColumnIndex)
                }
                if (deneme == 0) {
                    veritabani.execSQL("INSERT INTO oyun7 (id , color4sizee4 ) VALUES (1,$sayac)") // ilk başta veri yoksa tanımla
                } else {
                    if (sayac < deneme) {  // veri varsa bunu yap
                        veritabani.execSQL("INSERT OR IGNORE INTO oyun7 (id , color4sizee4 ) VALUES (1,$sayac)")
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
            if(sayac<=190){
                alert.setIcon(R.drawable.star3)
            }
            else if (sayac<=240){
                alert.setIcon(R.drawable.star2)
            }
            else {
                alert.setIcon(R.drawable.star1)
            }
            alert.setPositiveButton("Yes") { dialogInterface: DialogInterface, i: Int ->

                // Evet butonuna tıklayınca olacaklar
                val intent= Intent(applicationContext, FourColorFour4::class.java)
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
    fun yesil222(imagebuton : ImageButton) {
        imagebuton.setBackgroundColor(-10053376)
    }
    fun turuncu222(imagebuton : ImageButton) {
        imagebuton.setBackgroundColor(-16777216 )
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
    fun a111ust (view : View) {
        render(imageButton472, imageButton480,imageButton488,imageButton496, imageButton504, imageButton512, imageButton520, imageButton528 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a222ust (view : View) {
        render(imageButton473, imageButton481,imageButton489,imageButton497, imageButton505, imageButton513, imageButton521, imageButton529 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a333ust (view : View) {
        render2(imageButton474,imageButton490,imageButton498, imageButton506, imageButton514, imageButton530 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a444ust (view : View) {
        render2(imageButton475, imageButton491,imageButton499, imageButton507, imageButton515,  imageButton531 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a555ust (view : View) {
        render2(imageButton476, imageButton492,imageButton500, imageButton508, imageButton516,  imageButton532 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a666ust (view : View) {
        render2(imageButton477, imageButton493,imageButton501, imageButton509, imageButton517,  imageButton533 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a777ust (view : View) {
        render(imageButton478, imageButton486,imageButton494,imageButton502, imageButton510, imageButton518, imageButton526, imageButton534 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a888ust (view : View) {
        render(imageButton479, imageButton487,imageButton495,imageButton503, imageButton511, imageButton519, imageButton527, imageButton535 )
        sayac++
        textView9.text = ""+sayac
    }

    fun a111yan (view : View) {
        render(imageButton472, imageButton473,imageButton474,imageButton475, imageButton476, imageButton477, imageButton478, imageButton479 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a222yan (view : View) {
        render3(imageButton480,  imageButton487 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a333yan (view : View) {
        render2(imageButton488 ,imageButton490,imageButton491, imageButton492, imageButton493,  imageButton495 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a444yan (view : View) {
        render2(imageButton496 ,imageButton498,imageButton499, imageButton500, imageButton501,  imageButton503 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a555yan (view : View) {
        render2(imageButton504 ,imageButton506,imageButton507, imageButton508, imageButton509,  imageButton511 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a666yan (view : View) {
        render2(imageButton512 ,imageButton514,imageButton515, imageButton516, imageButton517,  imageButton519)
        sayac++
        textView9.text = ""+sayac
    }
    fun a777yan (view : View) {
        render3(imageButton520,  imageButton527)
        sayac++
        textView9.text = ""+sayac
    }
    fun a888yan (view : View) {
        render(imageButton528, imageButton529,imageButton530,imageButton531, imageButton532, imageButton533, imageButton534, imageButton535)
        sayac++
        textView9.text = ""+sayac
    }

    fun a111ustyedek (view : View) {
        render(imageButton472, imageButton480,imageButton488,imageButton496, imageButton504, imageButton512, imageButton520, imageButton528 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a222ustyedek (view : View) {
        render(imageButton473, imageButton481,imageButton489,imageButton497, imageButton505, imageButton513, imageButton521, imageButton529 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a333ustyedek (view : View) {
        render2(imageButton474,imageButton490,imageButton498, imageButton506, imageButton514, imageButton530 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a444ustyedek (view : View) {
        render2(imageButton475, imageButton491,imageButton499, imageButton507, imageButton515,  imageButton531 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a555ustyedek (view : View) {
        render2(imageButton476, imageButton492,imageButton500, imageButton508, imageButton516,  imageButton532 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a666ustyedek (view : View) {
        render2(imageButton477, imageButton493,imageButton501, imageButton509, imageButton517,  imageButton533 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a777ustyedek (view : View) {
        render(imageButton478, imageButton486,imageButton494,imageButton502, imageButton510, imageButton518, imageButton526, imageButton534 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a888ustyedek (view : View) {
        render(imageButton479, imageButton487,imageButton495,imageButton503, imageButton511, imageButton519, imageButton527, imageButton535 )
        sayac++
        textView9.text = ""+sayac
    }

    fun a111yanyedek (view : View) {
        render(imageButton472, imageButton473,imageButton474,imageButton475, imageButton476, imageButton477, imageButton478, imageButton479 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a222yanyedek (view : View) {
        render3(imageButton480,  imageButton487 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a333yanyedek (view : View) {
        render2(imageButton488 ,imageButton490,imageButton491, imageButton492, imageButton493,  imageButton495 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a444yanyedek (view : View) {
        render2(imageButton496 ,imageButton498,imageButton499, imageButton500, imageButton501,  imageButton503 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a555yanyedek (view : View) {
        render2(imageButton504 ,imageButton506,imageButton507, imageButton508, imageButton509,  imageButton511 )
        sayac++
        textView9.text = ""+sayac
    }
    fun a666yanyedek (view : View) {
        render2(imageButton512 ,imageButton514,imageButton515, imageButton516, imageButton517,  imageButton519)
        sayac++
        textView9.text = ""+sayac
    }
    fun a777yanyedek (view : View) {
        render3(imageButton520,  imageButton527)
        sayac++
        textView9.text = ""+sayac
    }
    fun a888yanyedek (view : View) {
        render(imageButton528, imageButton529,imageButton530,imageButton531, imageButton532, imageButton533, imageButton534, imageButton535)
        sayac++
        textView9.text = ""+sayac
    }
    fun carprazsolust6 (view : View) {
        rendercarpraz(imageButton486 ,imageButton485,imageButton484, imageButton483, imageButton482,  imageButton481)
        sayac++
        textView9.text = ""+sayac
    }
    fun carprazsagust6 (view : View) {
        rendercarpraz(imageButton481 ,imageButton482,imageButton483, imageButton484, imageButton485,  imageButton486)
        sayac++
        textView9.text = ""+sayac
    }
    fun carprazsolalt6 (view : View) {
        rendercarpraz(imageButton526 ,imageButton525,imageButton524, imageButton523, imageButton522,  imageButton521)
        sayac++
        textView9.text = ""+sayac
    }
    fun carprazsagalt6 (view : View) {
        rendercarpraz(imageButton521 ,imageButton522,imageButton523, imageButton524, imageButton525,  imageButton526)
        sayac++
        textView9.text = ""+sayac
    }




}