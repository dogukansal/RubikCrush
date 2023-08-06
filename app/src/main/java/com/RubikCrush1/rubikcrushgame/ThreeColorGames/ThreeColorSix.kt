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
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import kotlinx.android.synthetic.main.activity_three_color_six.*
import java.lang.Exception


class ThreeColorSix : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_color_six)


        textView13.text = ""+sayac
        val rnds :ArrayList<Int> = arrayListOf<Int>()
        val butonsayisi : ArrayList<ImageButton> = arrayListOf<ImageButton>(
            imageButton1029, imageButton1030, imageButton1031, imageButton1032,
            imageButton1037, imageButton1038, imageButton1039, imageButton1040,
            imageButton872, imageButton873, imageButton874, imageButton875,
            imageButton880, imageButton881, imageButton882, imageButton883,
            imageButton888, imageButton889, imageButton890, imageButton891,
            imageButton896, imageButton897, imageButton898, imageButton899,
            //kırmızı sol
            imageButton908, imageButton909, imageButton910, imageButton911,
            imageButton916, imageButton917, imageButton918, imageButton919,
            imageButton924, imageButton925, imageButton926, imageButton927,
            imageButton932, imageButton933, imageButton934, imageButton935,
            imageButton1049, imageButton1050, imageButton1051, imageButton1052,
            imageButton1057, imageButton1058, imageButton1059, imageButton1060,
            //kırmızı sağ
            imageButton1033, imageButton1034, imageButton1035, imageButton1036,
            imageButton1041, imageButton1042, imageButton1043, imageButton1044,
            imageButton876, imageButton877, imageButton878, imageButton879,
            imageButton884, imageButton885, imageButton886, imageButton887,
            imageButton892, imageButton893, imageButton894, imageButton895,
            imageButton900, imageButton901, imageButton902, imageButton903,
            //mavi
            imageButton904, imageButton905, imageButton906, imageButton907,
            imageButton912, imageButton913, imageButton914, imageButton915,
            imageButton920, imageButton921, imageButton922, imageButton923,
            imageButton928, imageButton929, imageButton930, imageButton931,
            imageButton1045, imageButton1046, imageButton1047, imageButton1048,
            imageButton1053, imageButton1054, imageButton1055, imageButton1056,
            //yesil
            )
        for (z in 0..95){
            val a = (0..19).random()
            rnds.add (a)
            //randomw sayilari tuttuk dışarıya çıkartma yüklemiyo !
        }
        for (i in 0..47) {
            kirmizi222(butonsayisi[i])
        }
        for (i in 48..71) {
            mavi222(butonsayisi[i])
        }
        for (i in 72..95) {
            yesil222(butonsayisi[i])
        }
        for (i in 0..35) {
            if(rnds[i]==0){
                imageButton937.performClick()
            }
            else if(rnds[i]==1){
                imageButton938.performClick()
            }
            else if(rnds[i]==2){
                imageButton939.performClick()
            }
            else if(rnds[i]==3){
                imageButton940.performClick()
            }
            else if(rnds[i]==4){
                imageButton941.performClick()
            }
            else if(rnds[i]==5){
                imageButton942.performClick()
            }
            else if(rnds[i]==6){
                imageButton943.performClick()
            }
            else if(rnds[i]==7){
                imageButton944.performClick()
            }

            else if(rnds[i]==8){
                imageButton961.performClick()
            }
            else if(rnds[i]==9){
                imageButton962.performClick()
            }
            else if(rnds[i]==10){
                imageButton963.performClick()
            }
            else if(rnds[i]==11){
                imageButton964.performClick()
            }
            else if(rnds[i]==12){
                imageButton965.performClick()
            }
            else if(rnds[i]==13){
                imageButton966.performClick()
            }
            else if(rnds[i]==14){
                imageButton967.performClick()
            }
            else if(rnds[i]==15){
                imageButton968.performClick()
            }
            else if(rnds[i]==16){
                imageButton1065.performClick()
            }
            else if(rnds[i]==17){
                imageButton1066.performClick()
            }
            else if(rnds[i]==18){
                imageButton1061.performClick()
            }
            else if(rnds[i]==19){
                imageButton1062.performClick()
            }
        }
        for (e in butonsayisi){
            e.setImageResource(android.R.color.transparent)
        }
        dene()
    var adRequest2 = AdRequest.Builder().build()

        InterstitialAd.load(this,"ca-app-pub-6469014985923539/1698961721", adRequest2, object : InterstitialAdLoadCallback() {
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
    var sayac=-36
    var x=0
    var runnable:Runnable = Runnable {  }
    var handler = Handler()
    fun dene(){
        x=0
        runnable = object : Runnable{
            override fun run() {
                x=x+1
                textView49.text=""+x
                handler.postDelayed(runnable,1000)
            }
        }
        handler.post(runnable)
    }
    fun check13(view : View){
        kontrol()
    }

    fun kontrol(){
        if( renkidalma111(imageButton1029)==-5242848   && renkidalma111(imageButton1030)==-5242848    && renkidalma111(imageButton1031)==-5242848  && renkidalma111(imageButton1032)==-5242848 &&
            renkidalma111(imageButton1037)==-5242848 && renkidalma111(imageButton1038)==-5242848 && renkidalma111(imageButton1039)==-5242848 && renkidalma111(imageButton1040)==-5242848 &&
            renkidalma111(imageButton872)==-5242848 && renkidalma111(imageButton873)==-5242848 && renkidalma111(imageButton874)==-5242848 && renkidalma111(imageButton875)==-5242848 &&
            renkidalma111(imageButton880)==-5242848 && renkidalma111(imageButton881)==-5242848 && renkidalma111(imageButton882)==-5242848 && renkidalma111(imageButton883)==-5242848 &&
            renkidalma111(imageButton888)==-5242848 && renkidalma111(imageButton889)==-5242848 && renkidalma111(imageButton890)==-5242848 && renkidalma111(imageButton891)==-5242848 &&
            renkidalma111(imageButton896)==-5242848 && renkidalma111(imageButton897)==-5242848 && renkidalma111(imageButton898)==-5242848 && renkidalma111(imageButton899)==-5242848 &&
            renkidalma111(imageButton908)==-5242848 && renkidalma111(imageButton909)==-5242848 && renkidalma111(imageButton910)==-5242848 && renkidalma111(imageButton911)==-5242848 &&
            renkidalma111(imageButton916)==-5242848 && renkidalma111(imageButton917)==-5242848 && renkidalma111(imageButton918)==-5242848 && renkidalma111(imageButton919)==-5242848 &&
            renkidalma111(imageButton924)==-5242848 && renkidalma111(imageButton925)==-5242848 && renkidalma111(imageButton926)==-5242848 && renkidalma111(imageButton927)==-5242848 &&
            renkidalma111(imageButton932)==-5242848 && renkidalma111(imageButton933)==-5242848 && renkidalma111(imageButton934)==-5242848  && renkidalma111(imageButton935)==-5242848 &&
            renkidalma111(imageButton1049)==-5242848 && renkidalma111(imageButton1050)==-5242848 && renkidalma111(imageButton1051)==-5242848 && renkidalma111(imageButton1052)==-5242848 &&
            renkidalma111(imageButton1057)==-5242848 && renkidalma111(imageButton1058)==-5242848 && renkidalma111(imageButton1059)==-5242848  && renkidalma111(imageButton1060)==-5242848 &&
            //kırmızı


            renkidalma111(imageButton1033)==-16776961 && renkidalma111(imageButton1034)==-16776961 && renkidalma111(imageButton1035)==-16776961 && renkidalma111(imageButton1036)==-16776961 &&
            renkidalma111(imageButton1041)==-16776961 && renkidalma111(imageButton1042)==-16776961 && renkidalma111(imageButton1043)==-16776961 && renkidalma111(imageButton1044)==-16776961 &&
            renkidalma111(imageButton876)==-16776961 && renkidalma111(imageButton877)==-16776961 && renkidalma111(imageButton878)==-16776961 && renkidalma111(imageButton879)==-16776961 &&
            renkidalma111(imageButton884)==-16776961 && renkidalma111(imageButton885)==-16776961 && renkidalma111(imageButton886)==-16776961 && renkidalma111(imageButton887)==-16776961 &&
            renkidalma111(imageButton892)==-16776961 && renkidalma111(imageButton893)==-16776961 && renkidalma111(imageButton894)==-16776961 && renkidalma111(imageButton895)==-16776961 &&
            renkidalma111(imageButton900)==-16776961 && renkidalma111(imageButton901)==-16776961 && renkidalma111(imageButton902)==-16776961 && renkidalma111(imageButton903)==-16776961 &&
            //mavi

            renkidalma111(imageButton904)==-10053376 && renkidalma111(imageButton905)==-10053376 && renkidalma111(imageButton906)==-10053376 && renkidalma111(imageButton907)==-10053376 &&
            renkidalma111(imageButton912)==-10053376 && renkidalma111(imageButton913)==-10053376 && renkidalma111(imageButton914)==-10053376 && renkidalma111(imageButton915)==-10053376 &&
            renkidalma111(imageButton920)==-10053376 && renkidalma111(imageButton921)==-10053376 && renkidalma111(imageButton922)==-10053376 && renkidalma111(imageButton923)==-10053376 &&
            renkidalma111(imageButton928)==-10053376 && renkidalma111(imageButton929)==-10053376 && renkidalma111(imageButton930)==-10053376 && renkidalma111(imageButton931)==-10053376 &&
            renkidalma111(imageButton1045)==-10053376 && renkidalma111(imageButton1046)==-10053376 && renkidalma111(imageButton1047)==-10053376 && renkidalma111(imageButton1048)==-10053376 &&
            renkidalma111(imageButton1053)==-10053376 && renkidalma111(imageButton1054)==-10053376 && renkidalma111(imageButton1055)==-10053376 && renkidalma111(imageButton1056)==-10053376
            //yesil
        )
        {
            try {
                var deneme: Int = 0
                val veritabani = this.openOrCreateDatabase("DENEME", Context.MODE_PRIVATE, null)
                veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun13 (id INTEGER PRİMARY KEY, color3sizee6 INTEGER UNIQUE)")
                val cursor1 = veritabani.rawQuery("SELECT * FROM oyun13", null)
                val idColumnIndex = cursor1.getColumnIndex("id")
                val isimColumnIndex = cursor1.getColumnIndex("color3sizee6")  //-1
                while (cursor1.moveToNext()) {
                    deneme = cursor1.getInt(isimColumnIndex)
                }
                if (deneme == 0) {
                    veritabani.execSQL("INSERT INTO oyun13 (id , color3sizee6 ) VALUES (1,$sayac)") // ilk başta veri yoksa tanımla
                } else {
                    if (sayac < deneme) {  // veri varsa bunu yap
                        veritabani.execSQL("INSERT OR IGNORE INTO oyun13 (id , color3sizee6 ) VALUES (1,$sayac)")
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
            if(sayac<=100){
                alert.setIcon(R.drawable.star3)
            }
            else if (sayac<=120){
                alert.setIcon(R.drawable.star2)
            }
            else {
                alert.setIcon(R.drawable.star1)
            }
            alert.setPositiveButton("Yes") { dialogInterface: DialogInterface, i: Int ->
                // Evet butonuna tıklayınca olacaklar

                val intent= Intent(applicationContext, ThreeColorSix::class.java)
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

    fun b11ust3 (view : View) {
        renderust(imageButton1029, imageButton1037,imageButton872,imageButton880, imageButton888, imageButton896,   imageButton904, imageButton912,imageButton920,imageButton928,imageButton1045,imageButton1053)
        sayac++
        textView13.text = ""+sayac
    }
    fun b22ust3 (view : View) {
        renderust(imageButton1030, imageButton1038,imageButton873,imageButton881, imageButton889, imageButton897,   imageButton905, imageButton913, imageButton921, imageButton929,imageButton1046,imageButton1054 )
        sayac++
        textView13.text = ""+sayac
    }
    fun b33ust3 (view : View) {
        renderust(imageButton1031, imageButton1039,imageButton874,imageButton882, imageButton890, imageButton898,   imageButton906, imageButton914, imageButton922, imageButton930,imageButton1047,imageButton1055  )
        sayac++
        textView13.text = ""+sayac
    }
    fun b44ust3 (view : View) {
        renderust(imageButton1032, imageButton1040,imageButton875,imageButton883, imageButton891, imageButton899,   imageButton907, imageButton915, imageButton923, imageButton931,imageButton1048,imageButton1056 )
        sayac++
        textView13.text = ""+sayac
    }
    fun b55ust3 (view : View) {
        renderust(imageButton1033, imageButton1041,imageButton876,imageButton884, imageButton892, imageButton900,   imageButton908, imageButton916, imageButton924, imageButton932,imageButton1049,imageButton1057 )
        sayac++
        textView13.text = ""+sayac
    }
    fun b66ust3 (view : View) {
        renderust(imageButton1034, imageButton1042,imageButton877,imageButton885, imageButton893, imageButton901,   imageButton909, imageButton917, imageButton925, imageButton933,imageButton1050,imageButton1058 )
        sayac++
        textView13.text = ""+sayac
    }
    fun b77ust3 (view : View) {
        renderust(imageButton1035, imageButton1043,imageButton878,imageButton886, imageButton894, imageButton902, imageButton910, imageButton918, imageButton926, imageButton934,imageButton1051,imageButton1059 )
        sayac++
        textView13.text = ""+sayac
    }
    fun b88ust3 (view : View) {
        renderust(imageButton1036, imageButton1044,imageButton879,imageButton887, imageButton895, imageButton903, imageButton911, imageButton919, imageButton927, imageButton935,imageButton1052,imageButton1060 )
        sayac++
        textView13.text = ""+sayac
    }


    fun b11yan3 (view : View) {
        renderyan(imageButton1029, imageButton1030,imageButton1031,imageButton1032, imageButton1033, imageButton1034, imageButton1035, imageButton1036 )
        sayac++
        textView13.text = ""+sayac
    }
    fun b22yan3 (view : View) {
        renderyan(imageButton1037, imageButton1038,imageButton1039,imageButton1040, imageButton1041, imageButton1042, imageButton1043, imageButton1044 )
        sayac++
        textView13.text = ""+sayac
    }

    fun b33yan3 (view : View) {
        renderyan(imageButton872, imageButton873,imageButton874,imageButton875, imageButton876, imageButton877, imageButton878, imageButton879)
        sayac++
        textView13.text = ""+sayac
    }
    fun b44yan3 (view : View) {
        renderyan(imageButton880, imageButton881,imageButton882,imageButton883, imageButton884, imageButton885, imageButton886, imageButton887 )
        sayac++
        textView13.text = ""+sayac
    }
    fun b55yan3 (view : View) {
        renderyan(imageButton888, imageButton889,imageButton890,imageButton891, imageButton892, imageButton893, imageButton894, imageButton895 )
        sayac++
        textView13.text = ""+sayac
    }
    fun b66yan3 (view : View) {
        renderyan(imageButton896, imageButton897,imageButton898,imageButton899, imageButton900, imageButton901, imageButton902, imageButton903)
        sayac++
        textView13.text = ""+sayac
    }
    fun b77yan3 (view : View) {
        renderyan(imageButton904, imageButton905,imageButton906,imageButton907, imageButton908, imageButton909, imageButton910, imageButton911)
        sayac++
        textView13.text = ""+sayac
    }

    fun b88yan3 (view : View) {
        renderyan(imageButton912, imageButton913,imageButton914,imageButton915, imageButton916, imageButton917, imageButton918, imageButton919)
        sayac++
        textView13.text = ""+sayac
    }
    fun b99yan3 (view : View) {
        renderyan(imageButton920, imageButton921,imageButton922,imageButton923, imageButton924, imageButton925, imageButton926, imageButton927)
        sayac++
        textView13.text = ""+sayac
    }
    fun b1010yan3 (view : View) {
        renderyan(imageButton928, imageButton929,imageButton930,imageButton931, imageButton932, imageButton933, imageButton934, imageButton935)
        sayac++
        textView13.text = ""+sayac
    }
    fun b1111yan3 (view : View) {
        renderyan(imageButton1045, imageButton1046,imageButton1047,imageButton1048, imageButton1049, imageButton1050, imageButton1051, imageButton1052)
        sayac++
        textView13.text = ""+sayac
    }
    fun b1212yan3 (view : View) {
        renderyan(imageButton1053, imageButton1054,imageButton1055,imageButton1056, imageButton1057, imageButton1058, imageButton1059, imageButton1060)
        sayac++
        textView13.text = ""+sayac
    }

    fun b11ustyedek3 (view : View) {
        renderust(imageButton1029, imageButton1037,imageButton872,imageButton880, imageButton888, imageButton896,   imageButton904, imageButton912,imageButton920,imageButton928,imageButton1045,imageButton1053)
        sayac++
        textView13.text = ""+sayac
    }
    fun b22ustyedek3 (view : View) {
        renderust(imageButton1030, imageButton1038,imageButton873,imageButton881, imageButton889, imageButton897,   imageButton905, imageButton913, imageButton921, imageButton929,imageButton1046,imageButton1054 )
        sayac++
        textView13.text = ""+sayac
    }
    fun b33ustyedek3 (view : View) {
        renderust(imageButton1031, imageButton1039,imageButton874,imageButton882, imageButton890, imageButton898,   imageButton906, imageButton914, imageButton922, imageButton930,imageButton1047,imageButton1055  )
        sayac++
        textView13.text = ""+sayac
    }
    fun b44ustyedek3 (view : View) {
        renderust(imageButton1032, imageButton1040,imageButton875,imageButton883, imageButton891, imageButton899,   imageButton907, imageButton915, imageButton923, imageButton931,imageButton1048,imageButton1056 )
        sayac++
        textView13.text = ""+sayac
    }
    fun b55ustyedek3 (view : View) {
        renderust(imageButton1033, imageButton1041,imageButton876,imageButton884, imageButton892, imageButton900,   imageButton908, imageButton916, imageButton924, imageButton932,imageButton1049,imageButton1057 )
        sayac++
        textView13.text = ""+sayac
    }
    fun b66ustyedek3 (view : View) {
        renderust(imageButton1034, imageButton1042,imageButton877,imageButton885, imageButton893, imageButton901,   imageButton909, imageButton917, imageButton925, imageButton933,imageButton1050,imageButton1058 )
        sayac++
        textView13.text = ""+sayac
    }
    fun b77ustyedek3 (view : View) {
        renderust(imageButton1035, imageButton1043,imageButton878,imageButton886, imageButton894, imageButton902, imageButton910, imageButton918, imageButton926, imageButton934,imageButton1051,imageButton1059 )
        sayac++
        textView13.text = ""+sayac
    }
    fun b88ustyedek3 (view : View) {
        renderust(imageButton1036, imageButton1040,imageButton879,imageButton887, imageButton895, imageButton903, imageButton911, imageButton919, imageButton927, imageButton935,imageButton1052,imageButton1060 )
        sayac++
        textView13.text = ""+sayac
    }


    fun b11yanyedek3 (view : View) {
        renderyan(imageButton1029, imageButton1030,imageButton1031,imageButton1032, imageButton1033, imageButton1034, imageButton1035, imageButton1036 )
        sayac++
        textView13.text = ""+sayac
    }
    fun b22yanyedek3 (view : View) {
        renderyan(imageButton1037, imageButton1038,imageButton1039,imageButton1040, imageButton1041, imageButton1042, imageButton1043, imageButton1044 )
        sayac++
        textView13.text = ""+sayac
    }

    fun b33yanyedek3 (view : View) {
        renderyan(imageButton872, imageButton873,imageButton874,imageButton875, imageButton876, imageButton877, imageButton878, imageButton879)
        sayac++
        textView13.text = ""+sayac
    }
    fun b44yanyedek3 (view : View) {
        renderyan(imageButton880, imageButton881,imageButton882,imageButton883, imageButton884, imageButton885, imageButton886, imageButton887 )
        sayac++
        textView13.text = ""+sayac
    }
    fun b55yanyedek3 (view : View) {
        renderyan(imageButton888, imageButton889,imageButton890,imageButton891, imageButton892, imageButton893, imageButton894, imageButton895 )
        sayac++
        textView13.text = ""+sayac
    }
    fun b66yanyedek3 (view : View) {
        renderyan(imageButton896, imageButton897,imageButton898,imageButton899, imageButton900, imageButton901, imageButton902, imageButton903)
        sayac++
        textView13.text = ""+sayac
    }
    fun b77yanyedek3 (view : View) {
        renderyan(imageButton904, imageButton905,imageButton906,imageButton907, imageButton908, imageButton909, imageButton910, imageButton911)
        sayac++
        textView13.text = ""+sayac
    }

    fun b88yanyedek3 (view : View) {
        renderyan(imageButton912, imageButton913,imageButton914,imageButton915, imageButton916, imageButton917, imageButton918, imageButton919)
        sayac++
        textView13.text = ""+sayac
    }
    fun b99yanyedek3 (view : View) {
        renderyan(imageButton920, imageButton921,imageButton922,imageButton923, imageButton924, imageButton925, imageButton926, imageButton927)
        sayac++
        textView13.text = ""+sayac
    }
    fun b1010yanyedek3 (view : View) {
        renderyan(imageButton928, imageButton929,imageButton930,imageButton931, imageButton932, imageButton933, imageButton934, imageButton935)
        sayac++
        textView13.text = ""+sayac
    }
    fun b1111yanyedek3 (view : View) {
        renderyan(imageButton1045, imageButton1046,imageButton1047,imageButton1048, imageButton1049, imageButton1050, imageButton1051, imageButton1052)
        sayac++
        textView13.text = ""+sayac
    }
    fun b1212yanyedek3 (view : View) {
        renderyan(imageButton1053, imageButton1054,imageButton1055,imageButton1056, imageButton1057, imageButton1058, imageButton1059, imageButton1060)
        sayac++
        textView13.text = ""+sayac
    }
    }










