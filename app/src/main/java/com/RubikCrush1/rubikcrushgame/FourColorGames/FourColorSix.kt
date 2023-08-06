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
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import kotlinx.android.synthetic.main.activity_four_color_six.*
import java.lang.Exception

class FourColorSix : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four_color_six)
        textView14.text = ""+sayac
        val rnds :ArrayList<Int> = arrayListOf<Int>()
        val butonsayisi : ArrayList<ImageButton> = arrayListOf<ImageButton>(
            imageButton1085, imageButton1086, imageButton1087, imageButton1088,
            imageButton1093, imageButton1094, imageButton1095, imageButton1096,
            imageButton872, imageButton873, imageButton874, imageButton875,
            imageButton880, imageButton881, imageButton882, imageButton883,
            imageButton888, imageButton889, imageButton890, imageButton891,
            imageButton896, imageButton897, imageButton898, imageButton899,
            //kırmızı sol
            imageButton908, imageButton909, imageButton910, imageButton911,
            imageButton916, imageButton917, imageButton918, imageButton919,
            imageButton924, imageButton925, imageButton926, imageButton927,
            imageButton932, imageButton933, imageButton934, imageButton935,
            imageButton1073, imageButton1074, imageButton1075, imageButton1076,
            imageButton1081, imageButton1082, imageButton1083, imageButton1084,
            //kırmızı sağ
            imageButton1089, imageButton1090, imageButton1091, imageButton1092,
            imageButton1097, imageButton1098, imageButton1099, imageButton1100,
            imageButton876, imageButton877, imageButton878, imageButton879,
            imageButton884, imageButton885, imageButton886, imageButton887,
            imageButton892, imageButton893, imageButton894, imageButton895,
            imageButton900, imageButton901, imageButton902, imageButton903,
            //mavi
            imageButton904, imageButton905, imageButton906, imageButton907,
            imageButton912, imageButton913, imageButton914, imageButton915,
            imageButton920, imageButton921, imageButton922, imageButton923,
            imageButton928, imageButton929, imageButton930, imageButton931,
            imageButton1069, imageButton1070, imageButton1071, imageButton1072,
            imageButton1077, imageButton1078, imageButton1079, imageButton1080,
            //yesil
        )
        for (z in 0..95){
            val a = (0..19).random()
            rnds.add (a)
            //randomw sayilari tuttuk dışarıya çıkartma yüklemiyo !
        }
        for (i in 0..23) {
            kirmizi222(butonsayisi[i])
        }
        for (i in 24..47) {
            turuncu222(butonsayisi[i])
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
                imageButton1108.performClick()
            }
            else if(rnds[i]==17){
                imageButton1107.performClick()
            }
            else if(rnds[i]==18){
                imageButton1127.performClick()
            }
            else if(rnds[i]==19){
                imageButton1128.performClick()
            }
        }
        for (e in butonsayisi){
            e.setImageResource(android.R.color.transparent)
        }
        dene()
        var adRequest2 = AdRequest.Builder().build()

        InterstitialAd.load(this,"ca-app-pub-6469014985923539/6759716713", adRequest2, object : InterstitialAdLoadCallback() {
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
                textView54.text=""+x
                handler.postDelayed(runnable,1000)
            }
        }
        handler.post(runnable)
    }
    fun check15(view : View){
        kontrol()
    }

    fun kontrol(){
        if( renkidalma111(imageButton1085)==-5242848   && renkidalma111(imageButton1086)==-5242848    && renkidalma111(imageButton1087)==-5242848  && renkidalma111(imageButton1088)==-5242848 &&
            renkidalma111(imageButton1093)==-5242848 && renkidalma111(imageButton1094)==-5242848 && renkidalma111(imageButton1095)==-5242848 && renkidalma111(imageButton1096)==-5242848 &&
            renkidalma111(imageButton872)==-5242848 && renkidalma111(imageButton873)==-5242848 && renkidalma111(imageButton874)==-5242848 && renkidalma111(imageButton875)==-5242848 &&
            renkidalma111(imageButton880)==-5242848 && renkidalma111(imageButton881)==-5242848 && renkidalma111(imageButton882)==-5242848 && renkidalma111(imageButton883)==-5242848 &&
            renkidalma111(imageButton888)==-5242848 && renkidalma111(imageButton889)==-5242848 && renkidalma111(imageButton890)==-5242848 && renkidalma111(imageButton891)==-5242848 &&
            renkidalma111(imageButton896)==-5242848 && renkidalma111(imageButton897)==-5242848 && renkidalma111(imageButton898)==-5242848 && renkidalma111(imageButton899)==-5242848 &&

            renkidalma111(imageButton908)==-16777216 && renkidalma111(imageButton909)==-16777216 && renkidalma111(imageButton910)==-16777216 && renkidalma111(imageButton911)==-16777216 &&
            renkidalma111(imageButton916)==-16777216 && renkidalma111(imageButton917)==-16777216 && renkidalma111(imageButton918)==-16777216 && renkidalma111(imageButton919)==-16777216 &&
            renkidalma111(imageButton924)==-16777216 && renkidalma111(imageButton925)==-16777216 && renkidalma111(imageButton926)==-16777216 && renkidalma111(imageButton927)==-16777216 &&
            renkidalma111(imageButton932)==-16777216 && renkidalma111(imageButton933)==-16777216 && renkidalma111(imageButton934)==-16777216  && renkidalma111(imageButton935)==-16777216 &&
            renkidalma111(imageButton1073)==-16777216 && renkidalma111(imageButton1074)==-16777216 && renkidalma111(imageButton1075)==-16777216 && renkidalma111(imageButton1076)==-16777216 &&
            renkidalma111(imageButton1081)==-16777216 && renkidalma111(imageButton1082)==-16777216 && renkidalma111(imageButton1083)==-16777216  && renkidalma111(imageButton1084)==-16777216 &&
            //siyah


            renkidalma111(imageButton1089)==-16776961 && renkidalma111(imageButton1090)==-16776961 && renkidalma111(imageButton1091)==-16776961 && renkidalma111(imageButton1092)==-16776961 &&
            renkidalma111(imageButton1097)==-16776961 && renkidalma111(imageButton1098)==-16776961 && renkidalma111(imageButton1099)==-16776961 && renkidalma111(imageButton1100)==-16776961 &&
            renkidalma111(imageButton876)==-16776961 && renkidalma111(imageButton877)==-16776961 && renkidalma111(imageButton878)==-16776961 && renkidalma111(imageButton879)==-16776961 &&
            renkidalma111(imageButton884)==-16776961 && renkidalma111(imageButton885)==-16776961 && renkidalma111(imageButton886)==-16776961 && renkidalma111(imageButton887)==-16776961 &&
            renkidalma111(imageButton892)==-16776961 && renkidalma111(imageButton893)==-16776961 && renkidalma111(imageButton894)==-16776961 && renkidalma111(imageButton895)==-16776961 &&
            renkidalma111(imageButton900)==-16776961 && renkidalma111(imageButton901)==-16776961 && renkidalma111(imageButton902)==-16776961 && renkidalma111(imageButton903)==-16776961 &&
            //mavi

            renkidalma111(imageButton904)==-10053376 && renkidalma111(imageButton905)==-10053376 && renkidalma111(imageButton906)==-10053376 && renkidalma111(imageButton907)==-10053376 &&
            renkidalma111(imageButton912)==-10053376 && renkidalma111(imageButton913)==-10053376 && renkidalma111(imageButton914)==-10053376 && renkidalma111(imageButton915)==-10053376 &&
            renkidalma111(imageButton920)==-10053376 && renkidalma111(imageButton921)==-10053376 && renkidalma111(imageButton922)==-10053376 && renkidalma111(imageButton923)==-10053376 &&
            renkidalma111(imageButton928)==-10053376 && renkidalma111(imageButton929)==-10053376 && renkidalma111(imageButton930)==-10053376 && renkidalma111(imageButton931)==-10053376 &&
            renkidalma111(imageButton1069)==-10053376 && renkidalma111(imageButton1070)==-10053376 && renkidalma111(imageButton1071)==-10053376 && renkidalma111(imageButton1072)==-10053376 &&
            renkidalma111(imageButton1077)==-10053376 && renkidalma111(imageButton1078)==-10053376 && renkidalma111(imageButton1079)==-10053376 && renkidalma111(imageButton1080)==-10053376
        //yesil
        )
        {
            try {
                var deneme: Int = 0
                val veritabani = this.openOrCreateDatabase("DENEME", Context.MODE_PRIVATE, null)
                veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun15 (id INTEGER PRİMARY KEY, color4sizee6 INTEGER UNIQUE)")
                val cursor1 = veritabani.rawQuery("SELECT * FROM oyun15", null)
                val idColumnIndex = cursor1.getColumnIndex("id")
                val isimColumnIndex = cursor1.getColumnIndex("color4sizee6")  //-1
                while (cursor1.moveToNext()) {
                    deneme = cursor1.getInt(isimColumnIndex)
                }
                if (deneme == 0) {
                    veritabani.execSQL("INSERT INTO oyun15 (id , color4sizee6 ) VALUES (1,$sayac)") // ilk başta veri yoksa tanımla
                } else {
                    if (sayac < deneme) {  // veri varsa bunu yap
                        veritabani.execSQL("INSERT OR IGNORE INTO oyun15 (id , color4sizee6 ) VALUES (1,$sayac)")
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
                val intent= Intent(applicationContext, FourColorSix::class.java)
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
                  , imagebuton6 : ImageButton, imagebuton7 : ImageButton, imagebuton8 : ImageButton, imagebuton9 : ImageButton, imagebuton10 : ImageButton,
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

    fun c11ust4 (view : View) {
        renderust(imageButton1085, imageButton1093,imageButton872,imageButton880, imageButton888, imageButton896,   imageButton904, imageButton912,imageButton920,imageButton928,imageButton1069,imageButton1077)
        sayac++
        textView14.text = ""+sayac
    }
    fun c22ust4 (view : View) {
        renderust(imageButton1086, imageButton1094,imageButton873,imageButton881, imageButton889, imageButton897,   imageButton905, imageButton913, imageButton921, imageButton929,imageButton1070,imageButton1078 )
        sayac++
        textView14.text = ""+sayac
    }
    fun c33ust4 (view : View) {
        renderust(imageButton1087, imageButton1095,imageButton874,imageButton882, imageButton890, imageButton898,   imageButton906, imageButton914, imageButton922, imageButton930,imageButton1071,imageButton1079  )
        sayac++
        textView14.text = ""+sayac
    }
    fun c44ust4 (view : View) {
        renderust(imageButton1088, imageButton1096,imageButton875,imageButton883, imageButton891, imageButton899,   imageButton907, imageButton915, imageButton923, imageButton931,imageButton1072,imageButton1080 )
        sayac++
        textView14.text = ""+sayac
    }
    fun c55ust4 (view : View) {
        renderust(imageButton1089, imageButton1097,imageButton876,imageButton884, imageButton892, imageButton900,   imageButton908, imageButton916, imageButton924, imageButton932,imageButton1073,imageButton1081 )
        sayac++
        textView14.text = ""+sayac
    }
    fun c66ust4 (view : View) {
        renderust(imageButton1090, imageButton1098,imageButton877,imageButton885, imageButton893, imageButton901,   imageButton909, imageButton917, imageButton925, imageButton933,imageButton1074,imageButton1082 )
        sayac++
        textView14.text = ""+sayac
    }
    fun c77ust4 (view : View) {
        renderust(imageButton1091, imageButton1099,imageButton878,imageButton886, imageButton894, imageButton902, imageButton910, imageButton918, imageButton926, imageButton934,imageButton1075,imageButton1083 )
        sayac++
        textView14.text = ""+sayac
    }
    fun c88ust4 (view : View) {
        renderust(imageButton1092, imageButton1100,imageButton879,imageButton887, imageButton895, imageButton903, imageButton911, imageButton919, imageButton927, imageButton935,imageButton1076,imageButton1084 )
        sayac++
        textView14.text = ""+sayac
    }


    fun c11yan4 (view : View) {
        renderyan(imageButton1085, imageButton1086,imageButton1087,imageButton1088, imageButton1089, imageButton1090, imageButton1091, imageButton1092 )
        sayac++
        textView14.text = ""+sayac
    }
    fun c22yan4 (view : View) {
        renderyan(imageButton1093, imageButton1094,imageButton1095,imageButton1096, imageButton1097, imageButton1098, imageButton1099, imageButton1100 )
        sayac++
        textView14.text = ""+sayac
    }

    fun c33yan4 (view : View) {
        renderyan(imageButton872, imageButton873,imageButton874,imageButton875, imageButton876, imageButton877, imageButton878, imageButton879)
        sayac++
        textView14.text = ""+sayac
    }
    fun c44yan4 (view : View) {
        renderyan(imageButton880, imageButton881,imageButton882,imageButton883, imageButton884, imageButton885, imageButton886, imageButton887 )
        sayac++
        textView14.text = ""+sayac
    }
    fun c55yan4 (view : View) {
        renderyan(imageButton888, imageButton889,imageButton890,imageButton891, imageButton892, imageButton893, imageButton894, imageButton895 )
        sayac++
        textView14.text = ""+sayac
    }
    fun c66yan4 (view : View) {
        renderyan(imageButton896, imageButton897,imageButton898,imageButton899, imageButton900, imageButton901, imageButton902, imageButton903)
        sayac++
        textView14.text = ""+sayac
    }
    fun c77yan4 (view : View) {
        renderyan(imageButton904, imageButton905,imageButton906,imageButton907, imageButton908, imageButton909, imageButton910, imageButton911)
        sayac++
        textView14.text = ""+sayac
    }

    fun c88yan4 (view : View) {
        renderyan(imageButton912, imageButton913,imageButton914,imageButton915, imageButton916, imageButton917, imageButton918, imageButton919)
        sayac++
        textView14.text = ""+sayac
    }
    fun c99yan4 (view : View) {
        renderyan(imageButton920, imageButton921,imageButton922,imageButton923, imageButton924, imageButton925, imageButton926, imageButton927)
        sayac++
        textView14.text = ""+sayac
    }
    fun c1010yan4 (view : View) {
        renderyan(imageButton928, imageButton929,imageButton930,imageButton931, imageButton932, imageButton933, imageButton934, imageButton935)
        sayac++
        textView14.text = ""+sayac
    }
    fun c1111yan4 (view : View) {
        renderyan(imageButton1069, imageButton1070,imageButton1071,imageButton1072, imageButton1073, imageButton1074, imageButton1075, imageButton1076)
        sayac++
        textView14.text = ""+sayac
    }
    fun c1212yan4 (view : View) {
        renderyan(imageButton1077, imageButton1078,imageButton1079,imageButton1080, imageButton1081, imageButton1082, imageButton1083, imageButton1084)
        sayac++
        textView14.text = ""+sayac
    }

    fun c11ust4yedek (view : View) {
        renderust(imageButton1085, imageButton1093,imageButton872,imageButton880, imageButton888, imageButton896,   imageButton904, imageButton912,imageButton920,imageButton928,imageButton1069,imageButton1077)
        sayac++
        textView14.text = ""+sayac
    }
    fun c22ust4yedek (view : View) {
        renderust(imageButton1086, imageButton1094,imageButton873,imageButton881, imageButton889, imageButton897,   imageButton905, imageButton913, imageButton921, imageButton929,imageButton1070,imageButton1078 )
        sayac++
        textView14.text = ""+sayac
    }
    fun c33ust4yedek (view : View) {
        renderust(imageButton1087, imageButton1095,imageButton874,imageButton882, imageButton890, imageButton898,   imageButton906, imageButton914, imageButton922, imageButton930,imageButton1071,imageButton1079  )
        sayac++
        textView14.text = ""+sayac
    }
    fun c44ust4yedek (view : View) {
        renderust(imageButton1088, imageButton1096,imageButton875,imageButton883, imageButton891, imageButton899,   imageButton907, imageButton915, imageButton923, imageButton931,imageButton1072,imageButton1080 )
        sayac++
        textView14.text = ""+sayac
    }
    fun c55ust4yedek (view : View) {
        renderust(imageButton1089, imageButton1097,imageButton876,imageButton884, imageButton892, imageButton900,   imageButton908, imageButton916, imageButton924, imageButton932,imageButton1073,imageButton1081 )
        sayac++
        textView14.text = ""+sayac
    }
    fun c66ust4yedek (view : View) {
        renderust(imageButton1090, imageButton1098,imageButton877,imageButton885, imageButton893, imageButton901,   imageButton909, imageButton917, imageButton925, imageButton933,imageButton1074,imageButton1082 )
        sayac++
        textView14.text = ""+sayac
    }
    fun c77ust4yedek (view : View) {
        renderust(imageButton1091, imageButton1099,imageButton878,imageButton886, imageButton894, imageButton902, imageButton910, imageButton918, imageButton926, imageButton934,imageButton1075,imageButton1083 )
        sayac++
        textView14.text = ""+sayac
    }
    fun c88ust4yedek (view : View) {
        renderust(imageButton1092, imageButton1100,imageButton879,imageButton887, imageButton895, imageButton903, imageButton911, imageButton919, imageButton927, imageButton935,imageButton1076,imageButton1084 )
        sayac++
        textView14.text = ""+sayac
    }


    fun c11yan4yedek (view : View) {
        renderyan(imageButton1085, imageButton1086,imageButton1087,imageButton1088, imageButton1089, imageButton1090, imageButton1091, imageButton1092 )
        sayac++
        textView14.text = ""+sayac
    }
    fun c22yan4yedek (view : View) {
        renderyan(imageButton1093, imageButton1094,imageButton1095,imageButton1096, imageButton1097, imageButton1098, imageButton1099, imageButton1100 )
        sayac++
        textView14.text = ""+sayac
    }

    fun c33yan4yedek (view : View) {
        renderyan(imageButton872, imageButton873,imageButton874,imageButton875, imageButton876, imageButton877, imageButton878, imageButton879)
        sayac++
        textView14.text = ""+sayac
    }
    fun c44yan4yedek (view : View) {
        renderyan(imageButton880, imageButton881,imageButton882,imageButton883, imageButton884, imageButton885, imageButton886, imageButton887 )
        sayac++
        textView14.text = ""+sayac
    }
    fun c55yan4yedek (view : View) {
        renderyan(imageButton888, imageButton889,imageButton890,imageButton891, imageButton892, imageButton893, imageButton894, imageButton895 )
        sayac++
        textView14.text = ""+sayac
    }
    fun c66yan4yedek (view : View) {
        renderyan(imageButton896, imageButton897,imageButton898,imageButton899, imageButton900, imageButton901, imageButton902, imageButton903)
        sayac++
        textView14.text = ""+sayac
    }
    fun c77yan4yedek (view : View) {
        renderyan(imageButton904, imageButton905,imageButton906,imageButton907, imageButton908, imageButton909, imageButton910, imageButton911)
        sayac++
        textView14.text = ""+sayac
    }

    fun c88yan4yedek (view : View) {
        renderyan(imageButton912, imageButton913,imageButton914,imageButton915, imageButton916, imageButton917, imageButton918, imageButton919)
        sayac++
        textView14.text = ""+sayac
    }
    fun c99yan4yedek (view : View) {
        renderyan(imageButton920, imageButton921,imageButton922,imageButton923, imageButton924, imageButton925, imageButton926, imageButton927)
        sayac++
        textView14.text = ""+sayac
    }
    fun c1010yan4yedek (view : View) {
        renderyan(imageButton928, imageButton929,imageButton930,imageButton931, imageButton932, imageButton933, imageButton934, imageButton935)
        sayac++
        textView14.text = ""+sayac
    }
    fun c1111yan4yedek (view : View) {
        renderyan(imageButton1069, imageButton1070,imageButton1071,imageButton1072, imageButton1073, imageButton1074, imageButton1075, imageButton1076)
        sayac++
        textView14.text = ""+sayac
    }
    fun c1212yan4yedek (view : View) {
        renderyan(imageButton1077, imageButton1078,imageButton1079,imageButton1080, imageButton1081, imageButton1082, imageButton1083, imageButton1084)
        sayac++
        textView14.text = ""+sayac
    }


    }
