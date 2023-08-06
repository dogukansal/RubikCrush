package com.RubikCrush1.rubikcrushgame.mod3.ThreeColorGames

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
import kotlinx.android.synthetic.main.activity_three_color_three3.*
import java.lang.Exception

class ThreeColorThree3 : AppCompatActivity() {
    lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_color_three3)
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
        val rnds :ArrayList<Int> = arrayListOf<Int>()
        textView5.text = ""+sayac
        val butonsayisi : ArrayList<ImageButton> = arrayListOf<ImageButton>(
            imageButton226,
            imageButton231, imageButton232,
            imageButton236, imageButton237, imageButton238,
            imageButton245, imageButton246, imageButton247,
            imageButton251, imageButton252,
            imageButton257,
            imageButton254, imageButton255,imageButton248, //alındı

            imageButton224, imageButton225, imageButton230, // alındı
            imageButton253, imageButton258, imageButton259, // alındı
            imageButton227,
            imageButton233, imageButton234,
            imageButton239, imageButton240, imageButton241,

            imageButton228, imageButton229, imageButton235,//alındı
            imageButton249, imageButton250,
            imageButton256,
            imageButton242, imageButton243, imageButton244 )
        for (z in 0..35){
            val a = (0..11).random()
            rnds.add (a)
            //randomw sayilari tuttuk dışarıya çıkartma yüklemiyo !
        }
        for (i in 0..14) {
            kirmizi1(butonsayisi[i])
        }
        for (i in 15..26) {
            mavi1(butonsayisi[i])
        }
        for (i in 27..35) {
            yesil1(butonsayisi[i])
        }
        for (i in 0..35) {
            if(rnds[i]==0){
                imageButton260.performClick()
            }
            else if(rnds[i]==1){
                imageButton261.performClick()
            }
            else if(rnds[i]==2){
                imageButton262.performClick()
            }
            else if(rnds[i]==3){
                imageButton263.performClick()
            }
            else if(rnds[i]==4){
                imageButton264.performClick()
            }
            else if(rnds[i]==5){
                imageButton265.performClick()
            }
            else if(rnds[i]==6){
                imageButton278.performClick()
            }
            else if(rnds[i]==7){
                imageButton279.performClick()
            }
            else if(rnds[i]==8){
                imageButton280.performClick()
            }
            else if(rnds[i]==9){
                imageButton281.performClick()
            }
            else if(rnds[i]==10){
                imageButton282.performClick()
            }
            else if(rnds[i]==11){
                imageButton379.performClick()
            }
        }
        imageButton8.performClick()
        imageButton260.performClick()
        imageButton266.performClick()
        imageButton278.performClick()

        for (e in butonsayisi){
            e.setImageResource(android.R.color.transparent)
        }
        imageButton224.setImageResource(R.drawable.close)
        imageButton225.setImageResource(R.drawable.close)
        imageButton230.setImageResource(R.drawable.close)

        imageButton228.setImageResource(R.drawable.close)
        imageButton229.setImageResource(R.drawable.close)
        imageButton235.setImageResource(R.drawable.close)

        imageButton248.setImageResource(R.drawable.close)
        imageButton254.setImageResource(R.drawable.close)
        imageButton255.setImageResource(R.drawable.close)

        imageButton258.setImageResource(R.drawable.close)
        imageButton259.setImageResource(R.drawable.close)
        imageButton253.setImageResource(R.drawable.close)


        dene()

    var adRequest2 = AdRequest.Builder().build()

        InterstitialAd.load(this,"ca-app-pub-6469014985923539/9738857985", adRequest2, object : InterstitialAdLoadCallback() {
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
                textView46.text=""+x
                handler.postDelayed(runnable,1000)
            }
        }
        handler.post(runnable)
    }

    fun check5(view : View){
        kontrol()
    }

    fun renkidalma1(imagebuton : ImageButton): Int {
        val d = imagebuton.background as ColorDrawable
        val id =d.color
        return id
    }
    fun kontrol(){
        if( renkidalma1(imageButton224)==-16776961 && renkidalma1(imageButton225)==-16776961 && renkidalma1(imageButton226)==-5242848 &&
            renkidalma1(imageButton230)==-16776961 && renkidalma1(imageButton231)==-5242848 && renkidalma1(imageButton232)==-5242848 &&
            renkidalma1(imageButton236)==-5242848 && renkidalma1(imageButton237)==-5242848 && renkidalma1(imageButton238)==-5242848 &&
            renkidalma1(imageButton245)==-5242848 &&  renkidalma1(imageButton246)==-5242848 &&  renkidalma1(imageButton247)==-5242848 &&
            renkidalma1(imageButton251)==-5242848 &&  renkidalma1(imageButton252)==-5242848 &&  renkidalma1(imageButton253)==-16776961 &&
            renkidalma1(imageButton257)==-5242848 &&  renkidalma1(imageButton258)==-16776961 &&  renkidalma1(imageButton259)==-16776961 &&
            //kırmızı

            renkidalma1(imageButton227)==-16776961 && renkidalma1(imageButton228)==-10053376 && renkidalma1(imageButton229)==-10053376 &&
            renkidalma1(imageButton233)==-16776961 && renkidalma1(imageButton234)==-16776961 && renkidalma1(imageButton235)==-10053376 &&
            renkidalma1(imageButton239)==-16776961 && renkidalma1(imageButton240)==-16776961 && renkidalma1(imageButton241)==-16776961 &&
            //mavi

            renkidalma1(imageButton248)==-5242848 && renkidalma1(imageButton249)==-10053376 && renkidalma1(imageButton250)==-10053376 &&
            renkidalma1(imageButton254)==-5242848 && renkidalma1(imageButton255)==-5242848 && renkidalma1(imageButton256)==-10053376 &&
            renkidalma1(imageButton242)==-10053376 && renkidalma1(imageButton243)==-10053376 && renkidalma1(imageButton244)==-10053376 )
        //yesil
        {
            try {
                var deneme: Int = 0
                val veritabani = this.openOrCreateDatabase("DENEME4", Context.MODE_PRIVATE, null)
                veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun4 (id INTEGER PRİMARY KEY, color3sizee3 INTEGER UNIQUE)")
                val cursor1 = veritabani.rawQuery("SELECT * FROM oyun4", null)
                val idColumnIndex = cursor1.getColumnIndex("id")
                val isimColumnIndex = cursor1.getColumnIndex("color3sizee3")  //-1
                while (cursor1.moveToNext()) {
                    deneme = cursor1.getInt(isimColumnIndex)
                }
                if (deneme == 0) {
                    veritabani.execSQL("INSERT INTO oyun4 (id , color3sizee3 ) VALUES (1,$sayac)") // ilk başta veri yoksa tanımla
                } else {
                    if (sayac < deneme) {  // veri varsa bunu yap
                        veritabani.execSQL("INSERT OR IGNORE INTO oyun4 (id , color3sizee3 ) VALUES (1,$sayac)")
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
            if(sayac<=40){
                alert.setIcon(R.drawable.star3)
            }
            else if (sayac<=60){
                alert.setIcon(R.drawable.star2)
            }
            else {
                alert.setIcon(R.drawable.star1)
            }
            alert.setPositiveButton("Yes") { dialogInterface: DialogInterface, i: Int ->
                // Evet butonuna tıklayınca olacaklar

                val intent= Intent(applicationContext, ThreeColorThree3::class.java)
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

    fun kirmizi1(imagebuton : ImageButton) {
        imagebuton.setBackgroundColor(-5242848)
    }
    fun mavi1(imagebuton : ImageButton) {
        imagebuton.setBackgroundColor(-16776961)
    }
    fun yesil1(imagebuton : ImageButton) {
        imagebuton.setBackgroundColor(-10053376)
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

    fun a11ust3 (view : View) {
        render(imageButton224, imageButton230, imageButton236, imageButton242, imageButton248, imageButton254)
        sayac++
        textView5.text = ""+sayac
    }
    fun a22ust3 (view : View) {
        render2( imageButton231, imageButton237, imageButton243, imageButton249 )
        sayac++
        textView5.text = ""+sayac
    }
    fun a33ust3 (view : View) {
        render(imageButton226, imageButton232, imageButton238, imageButton244, imageButton250, imageButton256)
        sayac++
        textView5.text = ""+sayac
    }
    fun a44ust3 (view : View) {
        render(imageButton227, imageButton233, imageButton239, imageButton245, imageButton251, imageButton257)
        sayac++
        textView5.text = ""+sayac
    }
    fun a55ust3 (view : View) {
        render2( imageButton234, imageButton240, imageButton246, imageButton252)
        sayac++
        textView5.text = ""+sayac
    }
    fun a66ust3 (view : View) {
        render(imageButton229, imageButton235, imageButton241, imageButton247, imageButton253, imageButton259)
        sayac++
        textView5.text = ""+sayac
    }

    fun a11yan3 (view : View) {
        render(imageButton224, imageButton225,imageButton226,imageButton227, imageButton228, imageButton229 )
        sayac++
        textView5.text = ""+sayac
    }
    fun a22yan3 (view : View) {
        render2( imageButton231, imageButton232, imageButton233, imageButton234 )
        sayac++
        textView5.text = ""+sayac
    }
    fun a33yan3 (view : View) {
        render(imageButton236, imageButton237, imageButton238, imageButton239, imageButton240, imageButton241)
        sayac++
        textView5.text = ""+sayac
    }
    fun a44yan3 (view : View) {
        render(imageButton242, imageButton243, imageButton244 , imageButton245, imageButton246, imageButton247)
        sayac++
        textView5.text = ""+sayac
    }
    fun a55yan3 (view : View) {
        render2( imageButton249, imageButton250, imageButton251, imageButton252)
        sayac++
        textView5.text = ""+sayac
    }
    fun a66yan3 (view : View) {
        render(imageButton254, imageButton255, imageButton256, imageButton257, imageButton258, imageButton259)
        sayac++
        textView5.text = ""+sayac
    }


    fun a11ustyedek3 (view : View) {
        render(imageButton224, imageButton230, imageButton236, imageButton242, imageButton248, imageButton254)
        sayac++
        textView5.text = ""+sayac
    }
    fun a22ustyedek3 (view : View) {
        render2( imageButton231, imageButton237, imageButton243, imageButton249 )
        sayac++
        textView5.text = ""+sayac
    }
    fun a33ustyedek3 (view : View) {
        render(imageButton226, imageButton232, imageButton238, imageButton244, imageButton250, imageButton256)
        sayac++
        textView5.text = ""+sayac
    }
    fun a44ustyedek3 (view : View) {
        render(imageButton227, imageButton233, imageButton239, imageButton245, imageButton251, imageButton257)
        sayac++
        textView5.text = ""+sayac
    }
    fun a55ustyedek3 (view : View) {
        render2( imageButton234, imageButton240, imageButton246, imageButton252)
        sayac++
        textView5.text = ""+sayac
    }
    fun a66ustyedek3 (view : View) {
        render(imageButton229, imageButton235, imageButton241, imageButton247, imageButton253, imageButton259)
        sayac++
        textView5.text = ""+sayac
    }

    fun a11yanyedek3 (view : View) {
        render(imageButton224, imageButton225,imageButton226,imageButton227, imageButton228, imageButton229 )
        sayac++
        textView5.text = ""+sayac
    }
    fun a22yanyedek3 (view : View) {
        render2( imageButton231, imageButton232, imageButton233, imageButton234 )
        sayac++
        textView5.text = ""+sayac
    }
    fun a33yanyedek3 (view : View) {
        render(imageButton236, imageButton237, imageButton238, imageButton239, imageButton240, imageButton241)
        sayac++
        textView5.text = ""+sayac
    }
    fun a44yanyedek3 (view : View) {
        render(imageButton242, imageButton243, imageButton244 , imageButton245, imageButton246, imageButton247)
        sayac++
        textView5.text = ""+sayac
    }
    fun a55yanyedek3 (view : View) {
        render2( imageButton249, imageButton250, imageButton251, imageButton252)
        sayac++
        textView5.text = ""+sayac
    }
    fun a66yanyedek3 (view : View) {
        render(imageButton254, imageButton255, imageButton256, imageButton257, imageButton258, imageButton259)
        sayac++
        textView5.text = ""+sayac
    }
    fun carprazsolust2 (view : View) {
        rendercarpraz(imageButton224, imageButton225, imageButton228, imageButton229 )
        sayac++
        textView5.text = ""+sayac
    }
    fun carprazsagust2 (view : View) {
        rendercarpraz(imageButton224, imageButton225, imageButton228, imageButton229 )
        sayac++
        textView5.text = ""+sayac
    }
    fun carprazsolalt2 (view : View) {
        render2(imageButton254, imageButton255, imageButton258, imageButton259)
        sayac++
        textView5.text = ""+sayac
    }
    fun carprazsagalt2 (view : View) {
        render2(imageButton254, imageButton255,  imageButton258, imageButton259)
        sayac++
        textView5.text = ""+sayac

    }


}