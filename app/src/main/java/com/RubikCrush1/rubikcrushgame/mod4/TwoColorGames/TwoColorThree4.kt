package com.RubikCrush1.rubikcrushgame.mod4.TwoColorGames

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
import kotlinx.android.synthetic.main.activity_two_color_three4.*
import java.lang.Exception

class TwoColorThree4 : AppCompatActivity() {
    lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_color_three4)
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
        val rnds :ArrayList<Int> = arrayListOf<Int>()
        textView2.text = ""+sayac
        val butonsayisi : ArrayList<ImageButton> = arrayListOf<ImageButton>(
            imageButton38, imageButton39, imageButton40, imageButton44,  imageButton45, imageButton27, imageButton32, imageButton53
            , imageButton54, imageButton57, imageButton56, imageButton55,imageButton24, imageButton25,imageButton29,imageButton34, imageButton35,imageButton30,

            imageButton41, imageButton42, imageButton43 ,imageButton22, imageButton26, imageButton23, imageButton33, imageButton36, imageButton37
            , imageButton46, imageButton28,  imageButton47, imageButton48,  imageButton31
            , imageButton49,  imageButton50, imageButton51, imageButton52)
        for (z in 0..35){
            val a = (0..11).random()
            rnds.add (a)
            //randomw sayilari tuttuk dışarıya çıkartma yüklemiyo !
        }
        for (i in 0..17) {
            kirmizi1(butonsayisi[i])
        }
        for (i in 18..35) {
            mavi1(butonsayisi[i])
        }
        for (i in 0..35) {
            if(rnds[i]==0){
                imageButton3.performClick()
            }
            else if(rnds[i]==1){
                imageButton4.performClick()
            }
            else if(rnds[i]==2){
                imageButton5.performClick()
            }
            else if(rnds[i]==3){
                imageButton58.performClick()
            }
            else if(rnds[i]==4){
                imageButton59.performClick()
            }
            else if(rnds[i]==5){
                imageButton60.performClick()
            }
            else if(rnds[i]==6){
                imageButton61.performClick()
            }
            else if(rnds[i]==7){
                imageButton62.performClick()
            }
            else if(rnds[i]==8){
                imageButton63.performClick()
            }
            else if(rnds[i]==9){
                imageButton64.performClick()
            }
            else if(rnds[i]==10){
                imageButton65.performClick()
            }
            else if(rnds[i]==11){
                imageButton66.performClick()
            }
        }
        for (i in 0..35) {
            if(rnds[i]==0){
                imageButton.performClick()
            }
            else if(rnds[i]==1){
                imageButton6.performClick()
            }
            else if(rnds[i]==2){
                imageButton7.performClick()
            }
            else if(rnds[i]==3){
                imageButton2.performClick()
            }
            else if(rnds[i]==4){
                imageButton4.performClick()
            }
            else if(rnds[i]==5){
                imageButton59.performClick()
            }
            else if(rnds[i]==6){
                imageButton4.performClick()
            }
            else if(rnds[i]==7){
                imageButton59.performClick()
            }
            else if(rnds[i]==8){
                imageButton.performClick()
            }
            else if(rnds[i]==9){
                imageButton6.performClick()
            }
            else if(rnds[i]==10){
                imageButton7.performClick()
            }
            else if(rnds[i]==11){
                imageButton2.performClick()
            }
        }
        for (e in butonsayisi){
            e.setImageResource(android.R.color.transparent)
        }
        imageButton22.setImageResource(R.drawable.close)
        imageButton23.setImageResource(R.drawable.close)
        imageButton26.setImageResource(R.drawable.close)

        imageButton24.setImageResource(R.drawable.close)
        imageButton25.setImageResource(R.drawable.close)
        imageButton29.setImageResource(R.drawable.close)

        imageButton30.setImageResource(R.drawable.close)
        imageButton34.setImageResource(R.drawable.close)
        imageButton35.setImageResource(R.drawable.close)

        imageButton33.setImageResource(R.drawable.close)
        imageButton36.setImageResource(R.drawable.close)
        imageButton37.setImageResource(R.drawable.close)
        dene()
    var adRequest2 = AdRequest.Builder().build()

        InterstitialAd.load(this,"ca-app-pub-6469014985923539/4052057662", adRequest2, object : InterstitialAdLoadCallback() {
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
                textView41.text=""+x
                handler.postDelayed(runnable,1000)
            }
        }
        handler.post(runnable)
    }
    fun check2(view : View){
        kontrol()
    }


    fun kontrol(){
        if( renkidalma1(imageButton38)==-5242848 && renkidalma1(imageButton40)==-5242848 && renkidalma1(imageButton22)==-16776961 &&
            renkidalma1(imageButton23)==-16776961 && renkidalma1(imageButton26)==-16776961 && renkidalma1(imageButton56)==-5242848 &&
            renkidalma1(imageButton36)==-16776961 && renkidalma1(imageButton54)==-5242848 && renkidalma1(imageButton32)==-5242848 &&
            renkidalma1(imageButton39)==-5242848 &&  renkidalma1(imageButton44)==-5242848 &&  renkidalma1(imageButton33)==-16776961 &&
            renkidalma1(imageButton45)==-5242848 &&  renkidalma1(imageButton27)==-5242848 &&  renkidalma1(imageButton53)==-5242848 &&
            renkidalma1(imageButton37)==-16776961 &&  renkidalma1(imageButton57)==-5242848 &&  renkidalma1(imageButton55)==-5242848 &&
            //kırmızı
            renkidalma1(imageButton41)==-16776961 && renkidalma1(imageButton43)==-16776961 && renkidalma1(imageButton51)==-16776961 &&
            renkidalma1(imageButton24)==-5242848 && renkidalma1(imageButton46)==-16776961 && renkidalma1(imageButton47)==-16776961 &&
            renkidalma1(imageButton49)==-16776961 && renkidalma1(imageButton35)==-5242848 && renkidalma1(imageButton52)==-16776961 &&
            renkidalma1(imageButton42)==-16776961 && renkidalma1(imageButton28)==-16776961 && renkidalma1(imageButton48)==-16776961 &&
            renkidalma1(imageButton25)==-5242848 && renkidalma1(imageButton50)==-16776961 && renkidalma1(imageButton30)==-5242848 &&
            renkidalma1(imageButton34)==-5242848 && renkidalma1(imageButton29)==-5242848 && renkidalma1(imageButton31)==-16776961 )
        //mavi
        {
            try {
                var deneme: Int = 0
                val veritabani = this.openOrCreateDatabase("DENEME6", Context.MODE_PRIVATE, null)
                veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun2 (id INTEGER PRİMARY KEY, color2sizee3 INTEGER UNIQUE)")
                val cursor1 = veritabani.rawQuery("SELECT * FROM oyun2", null)
                val idColumnIndex = cursor1.getColumnIndex("id")
                val isimColumnIndex = cursor1.getColumnIndex("color2sizee3")  //-1
                while (cursor1.moveToNext()) {
                    deneme = cursor1.getInt(isimColumnIndex)
                }
                if (deneme == 0) {
                    veritabani.execSQL("INSERT INTO oyun2 (id , color2sizee3 ) VALUES (1,$sayac)") // ilk başta veri yoksa tanımla
                } else {
                    if (sayac < deneme) {  // veri varsa bunu yap
                        veritabani.execSQL("INSERT OR IGNORE INTO oyun2 (id , color2sizee3 ) VALUES (1,$sayac)")
                    }
                }
                // al
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
            if(sayac<=35){
                alert.setIcon(R.drawable.star3)
            }
            else if (sayac<=55){
                alert.setIcon(R.drawable.star2)
            }
            else {
                alert.setIcon(R.drawable.star1)
            }
            alert.setPositiveButton("Yes") { dialogInterface: DialogInterface, i: Int ->
                // Evet butonuna tıklayınca olacaklar
                val intent= Intent(applicationContext, TwoColorThree4::class.java)
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
    fun kirmizi1(imagebuton : ImageButton) {
        imagebuton.setBackgroundColor(-5242848)
    }
    fun mavi1(imagebuton : ImageButton) {
        imagebuton.setBackgroundColor(-16776961)
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
    fun render3(imagebuton1 : ImageButton, imagebuton2 : ImageButton){
        val a = renkidalma1(imagebuton1)
        val b = renkidalma1(imagebuton2)

        imagebuton1.setBackgroundColor(b)
        imagebuton2.setBackgroundColor(a)


    }
    fun rendercarpraz(imagebuton1 : ImageButton, imagebuton2 : ImageButton, imagebuton3 : ImageButton, imagebuton4 : ImageButton){
        val a = renkidalma1(imagebuton1)
        val b = renkidalma1(imagebuton2)
        val c = renkidalma1(imagebuton3)
        val d = renkidalma1(imagebuton4)
        imagebuton1.setBackgroundColor(d)
        imagebuton2.setBackgroundColor(a)
        imagebuton3.setBackgroundColor(b)
        imagebuton4.setBackgroundColor(c)

    }

    fun a11ust (view : View) {
        render(imageButton38, imageButton44, imageButton45, imageButton48, imageButton49, imageButton50)
        sayac++
        textView2.text = ""+sayac
    }
    fun a22ust (view : View) {
        render(imageButton39, imageButton22, imageButton26, imageButton30, imageButton34, imageButton51 )
        sayac++
        textView2.text = ""+sayac
    }
    fun a33ust (view : View) {
        render2(imageButton40,  imageButton27, imageButton31, imageButton52)
        sayac++
        textView2.text = ""+sayac
    }
    fun a44ust (view : View) {
        render2(imageButton41, imageButton28, imageButton32, imageButton57)
        sayac++
        textView2.text = ""+sayac
    }
    fun a55ust (view : View) {
        render(imageButton42, imageButton25, imageButton29, imageButton33, imageButton37, imageButton56)
        sayac++
        textView2.text = ""+sayac
    }
    fun a66ust (view : View) {
        render(imageButton43, imageButton46, imageButton47, imageButton53, imageButton54, imageButton55)
        sayac++
        textView2.text = ""+sayac
    }
    fun a11yan (view : View) {
        render(imageButton38, imageButton39,imageButton40,imageButton41, imageButton42, imageButton43 )
        sayac++
        textView2.text = ""+sayac
    }
    fun a22yan (view : View) {
        render3(imageButton44, imageButton46 )
        sayac++
        textView2.text = ""+sayac
    }
    fun a33yan (view : View) {
        render2(imageButton45, imageButton27, imageButton28, imageButton47)
        sayac++
        textView2.text = ""+sayac
    }
    fun a44yan (view : View) {
        render2(imageButton48, imageButton31 , imageButton32, imageButton53)
        sayac++
        textView2.text = ""+sayac
    }
    fun a55yan (view : View) {
        render3(imageButton49, imageButton54)
        sayac++
        textView2.text = ""+sayac
    }
    fun a66yan (view : View) {
        render(imageButton50, imageButton51, imageButton52, imageButton57, imageButton56, imageButton55)
        sayac++
        textView2.text = ""+sayac
    }

    fun a11ustyedek (view : View) {
        render(imageButton38, imageButton44, imageButton45, imageButton48, imageButton49, imageButton50)
        sayac++
        textView2.text = ""+sayac
    }
    fun a22ustyedek (view : View) {
        render(imageButton39, imageButton22, imageButton26, imageButton30, imageButton34, imageButton51 )
        sayac++
        textView2.text = ""+sayac
    }
    fun a33ustyedek (view : View) {
        render2(imageButton40,  imageButton27, imageButton31, imageButton52)
        sayac++
        textView2.text = ""+sayac
    }
    fun a44ustyedek (view : View) {
        render2(imageButton41, imageButton28, imageButton32, imageButton57)
        sayac++
        textView2.text = ""+sayac
    }
    fun a55ustyedek (view : View) {
        render(imageButton42, imageButton25, imageButton29, imageButton33, imageButton37, imageButton56)
        sayac++
        textView2.text = ""+sayac
    }
    fun a66ustyedek (view : View) {
        render(imageButton43, imageButton46, imageButton47, imageButton53, imageButton54, imageButton55)
        sayac++
        textView2.text = ""+sayac
    }
    fun a11yanyedek (view : View) {
        render(imageButton38, imageButton39,imageButton40,imageButton41, imageButton42, imageButton43 )
        sayac++
        textView2.text = ""+sayac
    }
    fun a22yanyedek (view : View) {
        render3(imageButton44, imageButton46 )
        sayac++
        textView2.text = ""+sayac
    }
    fun a33yanyedek (view : View) {
        render2(imageButton45, imageButton27, imageButton28, imageButton47)
        sayac++
        textView2.text = ""+sayac
    }
    fun a44yanyedek (view : View) {
        render2(imageButton48, imageButton31 , imageButton32, imageButton53)
        sayac++
        textView2.text = ""+sayac
    }
    fun a55yanyedek (view : View) {
        render3(imageButton49, imageButton54)
        sayac++
        textView2.text = ""+sayac
    }
    fun a66yanyedek (view : View) {
        render(imageButton50, imageButton51, imageButton52, imageButton57, imageButton56, imageButton55)
        sayac++
        textView2.text = ""+sayac
    }
    fun carprazsolust (view : View) {
        rendercarpraz( imageButton25, imageButton24, imageButton23, imageButton22)
        sayac++
        textView2.text = ""+sayac
    }
    fun carprazsagust (view : View) {
        rendercarpraz( imageButton22, imageButton23, imageButton24, imageButton25)
        sayac++
        textView2.text = ""+sayac
    }
    fun carprazsolalt (view : View) {
        rendercarpraz( imageButton37, imageButton36, imageButton35, imageButton34)
        sayac++
        textView2.text = ""+sayac
    }
    fun carprazsagalt (view : View) {
        rendercarpraz( imageButton34, imageButton35, imageButton36, imageButton37)
        sayac++
        textView2.text = ""+sayac
    }




    }
