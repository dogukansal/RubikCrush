package com.RubikCrush1.rubikcrushgame.TwoColorGames

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
import kotlinx.android.synthetic.main.activity_two_color_five.*
import java.lang.Exception

class TwoColorFive : AppCompatActivity() {
    lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_color_five)
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
        textView10.text = ""+sayac
        val rnds :ArrayList<Int> = arrayListOf<Int>()
        val butonsayisi : ArrayList<ImageButton> = arrayListOf<ImageButton>(
            imageButton   , imageButton2  , imageButton80,  imageButton536,
            imageButton572, imageButton573, imageButton574, imageButton575,
            imageButton580, imageButton581, imageButton582, imageButton583,
            imageButton588, imageButton589, imageButton590, imageButton591,
            imageButton596, imageButton597, imageButton598, imageButton599,
            imageButton608, imageButton609, imageButton610, imageButton611,
            imageButton616, imageButton617, imageButton618, imageButton619,
            imageButton624, imageButton625, imageButton626, imageButton627,
            imageButton632, imageButton633, imageButton634, imageButton635,
            imageButton769, imageButton770, imageButton771, imageButton836,

            imageButton569, imageButton570, imageButton571, imageButton636,
            imageButton576, imageButton577, imageButton578, imageButton579,
            imageButton584, imageButton585, imageButton586, imageButton587,
            imageButton592, imageButton593, imageButton594, imageButton595,
            imageButton600, imageButton601, imageButton602, imageButton603,
            imageButton604, imageButton605, imageButton606, imageButton607,
            imageButton612, imageButton613, imageButton614, imageButton615,
            imageButton620, imageButton621, imageButton622, imageButton623,
            imageButton628, imageButton629, imageButton630, imageButton631,
            imageButton669, imageButton670, imageButton671, imageButton736

        )
        for (z in 0..79){
            val a = (0..17).random()
            rnds.add (a)
            //randomw sayilari tuttuk dışarıya çıkartma yüklemiyo !
        }
        for (i in 0..39) {
            kirmizi222(butonsayisi[i])
        }
        for (i in 40..79) {
            mavi222(butonsayisi[i])
        }
        for (i in 0..35) {
            if(rnds[i]==0){
                imageButton637.performClick()
            }
            else if(rnds[i]==1){
                imageButton638.performClick()
            }
            else if(rnds[i]==2){
                imageButton639.performClick()
            }
            else if(rnds[i]==3){
                imageButton640.performClick()
            }
            else if(rnds[i]==4){
                imageButton641.performClick()
            }
            else if(rnds[i]==5){
                imageButton642.performClick()
            }
            else if(rnds[i]==6){
                imageButton643.performClick()
            }
            else if(rnds[i]==7){
                imageButton644.performClick()
            }
            else if(rnds[i]==8){
                imageButton661.performClick()
            }
            else if(rnds[i]==9){
                imageButton662.performClick()
            }
            else if(rnds[i]==10){
                imageButton663.performClick()
            }
            else if(rnds[i]==11){
                imageButton664.performClick()
            }
            else if(rnds[i]==12){
                imageButton665.performClick()
            }
            else if(rnds[i]==13){
                imageButton666.performClick()
            }
            else if(rnds[i]==14){
                imageButton667.performClick()
            }
            else if(rnds[i]==15){
                imageButton668.performClick()
            }
            else if(rnds[i]==16){
                imageButton870.performClick()
            }
            else if(rnds[i]==17){
                imageButton936.performClick()
            }
        }
        for (e in butonsayisi){
            e.setImageResource(android.R.color.transparent)
        }
        dene()
        var adRequest2 = AdRequest.Builder().build()

        InterstitialAd.load(this,"ca-app-pub-6469014985923539/7643177685", adRequest2, object : InterstitialAdLoadCallback() {
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
                textView43.text=""+x
                handler.postDelayed(runnable,1000)
            }
        }
        handler.post(runnable)
    }

    fun check10(view : View){
        kontrol()
    }

    fun kontrol(){
        if( renkidalma111(imageButton2)==-5242848   && renkidalma111(imageButton)==-5242848    && renkidalma111(imageButton80)==-5242848  && renkidalma111(imageButton536)==-5242848 &&
            renkidalma111(imageButton572)==-5242848 && renkidalma111(imageButton573)==-5242848 && renkidalma111(imageButton574)==-5242848 && renkidalma111(imageButton575)==-5242848 &&
            renkidalma111(imageButton580)==-5242848 && renkidalma111(imageButton581)==-5242848 && renkidalma111(imageButton582)==-5242848 && renkidalma111(imageButton583)==-5242848 &&
            renkidalma111(imageButton588)==-5242848 && renkidalma111(imageButton589)==-5242848 && renkidalma111(imageButton590)==-5242848 && renkidalma111(imageButton591)==-5242848 &&
            renkidalma111(imageButton596)==-5242848 && renkidalma111(imageButton597)==-5242848 && renkidalma111(imageButton598)==-5242848 && renkidalma111(imageButton599)==-5242848 &&
            renkidalma111(imageButton608)==-5242848 && renkidalma111(imageButton609)==-5242848 && renkidalma111(imageButton610)==-5242848 && renkidalma111(imageButton611)==-5242848 &&
            renkidalma111(imageButton616)==-5242848 && renkidalma111(imageButton617)==-5242848 && renkidalma111(imageButton618)==-5242848 && renkidalma111(imageButton619)==-5242848 &&
            renkidalma111(imageButton624)==-5242848 && renkidalma111(imageButton625)==-5242848 && renkidalma111(imageButton626)==-5242848 && renkidalma111(imageButton627)==-5242848 &&
            renkidalma111(imageButton632)==-5242848 && renkidalma111(imageButton633)==-5242848 && renkidalma111(imageButton634)==-5242848 && renkidalma111(imageButton635)==-5242848 &&
            renkidalma111(imageButton769)==-5242848 && renkidalma111(imageButton770)==-5242848 && renkidalma111(imageButton771)==-5242848  && renkidalma111(imageButton836)==-5242848 &&
            //kırmızı

            renkidalma111(imageButton569)==-16776961 && renkidalma111(imageButton570)==-16776961 && renkidalma111(imageButton571)==-16776961 && renkidalma111(imageButton636)==-16776961 &&
            renkidalma111(imageButton604)==-16776961 && renkidalma111(imageButton605)==-16776961 && renkidalma111(imageButton606)==-16776961 && renkidalma111(imageButton607)==-16776961 &&
            renkidalma111(imageButton612)==-16776961 && renkidalma111(imageButton613)==-16776961 && renkidalma111(imageButton614)==-16776961 && renkidalma111(imageButton615)==-16776961 &&
            renkidalma111(imageButton620)==-16776961 && renkidalma111(imageButton621)==-16776961 && renkidalma111(imageButton622)==-16776961 && renkidalma111(imageButton623)==-16776961 &&
            renkidalma111(imageButton628)==-16776961 && renkidalma111(imageButton629)==-16776961 && renkidalma111(imageButton630)==-16776961 && renkidalma111(imageButton631)==-16776961 &&
            renkidalma111(imageButton576)==-16776961 && renkidalma111(imageButton577)==-16776961 && renkidalma111(imageButton578)==-16776961 && renkidalma111(imageButton579)==-16776961 &&
            renkidalma111(imageButton584)==-16776961 && renkidalma111(imageButton585)==-16776961 && renkidalma111(imageButton586)==-16776961 && renkidalma111(imageButton587)==-16776961 &&
            renkidalma111(imageButton592)==-16776961 && renkidalma111(imageButton593)==-16776961 && renkidalma111(imageButton594)==-16776961 && renkidalma111(imageButton595)==-16776961 &&
            renkidalma111(imageButton600)==-16776961 && renkidalma111(imageButton601)==-16776961 && renkidalma111(imageButton602)==-16776961 && renkidalma111(imageButton603)==-16776961 &&
            renkidalma111(imageButton669)==-16776961 && renkidalma111(imageButton670)==-16776961 && renkidalma111(imageButton671)==-16776961 && renkidalma111(imageButton736)==-16776961
        //mavi
        )
        {
            try {
                var deneme: Int = 0
                val veritabani = this.openOrCreateDatabase("DENEME", Context.MODE_PRIVATE, null)
                veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun10 (id INTEGER PRİMARY KEY, color2sizee5 INTEGER UNIQUE)")
                val cursor1 = veritabani.rawQuery("SELECT * FROM oyun10", null)
                val idColumnIndex = cursor1.getColumnIndex("id")
                val isimColumnIndex = cursor1.getColumnIndex("color2sizee5")  //-1
                while (cursor1.moveToNext()) {
                    deneme = cursor1.getInt(isimColumnIndex)
                }
                if (deneme == 0) {
                    veritabani.execSQL("INSERT INTO oyun10 (id , color2sizee5 ) VALUES (1,$sayac)") // ilk başta veri yoksa tanımla
                } else {
                    if (sayac < deneme) {  // veri varsa bunu yap
                        veritabani.execSQL("INSERT OR IGNORE INTO oyun10 (id , color2sizee5 ) VALUES (1,$sayac)")
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
                val intent= Intent(applicationContext, TwoColorFive::class.java)
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
               , imagebuton6 : ImageButton, imagebuton7 : ImageButton, imagebuton8 : ImageButton, imagebuton9 : ImageButton,imagebuton10 : ImageButton,
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
        imagebuton1.setBackgroundColor(f)
        imagebuton2.setBackgroundColor(k)
        imagebuton3.setBackgroundColor(l)
        imagebuton4.setBackgroundColor(aa)
        imagebuton5.setBackgroundColor(bb)
        imagebuton6.setBackgroundColor(a)
        imagebuton7.setBackgroundColor(b)
        imagebuton8.setBackgroundColor(c)
        imagebuton9.setBackgroundColor(d)
        imagebuton10.setBackgroundColor(e)
    }
    fun b1ust (view : View) {
        renderust(imageButton, imageButton572,imageButton580,imageButton588, imageButton596, imageButton604, imageButton612, imageButton620,imageButton628,imageButton669)
        sayac++
        textView10.text = ""+sayac
    }
    fun b2ust (view : View) {
        renderust(imageButton2, imageButton573,imageButton581,imageButton589, imageButton597, imageButton605, imageButton613, imageButton621, imageButton629, imageButton670 )
        sayac++
        textView10.text = ""+sayac
    }
    fun b3ust (view : View) {
        renderust(imageButton80, imageButton574,imageButton582,imageButton590, imageButton598, imageButton606, imageButton614, imageButton622, imageButton630, imageButton671  )
        sayac++
        textView10.text = ""+sayac
    }
    fun b4ust (view : View) {
        renderust(imageButton536, imageButton575,imageButton583,imageButton591, imageButton599, imageButton607, imageButton615, imageButton623, imageButton631, imageButton736 )
        sayac++
        textView10.text = ""+sayac
    }
    fun b5ust (view : View) {
        renderust(imageButton569, imageButton576,imageButton584,imageButton592, imageButton600, imageButton608, imageButton616, imageButton624, imageButton632, imageButton769 )
        sayac++
        textView10.text = ""+sayac
    }
    fun b6ust (view : View) {
        renderust(imageButton570, imageButton577,imageButton585,imageButton593, imageButton601, imageButton609, imageButton617, imageButton625, imageButton633, imageButton770 )
        sayac++
        textView10.text = ""+sayac
    }
    fun b7ust (view : View) {
        renderust(imageButton571, imageButton578,imageButton586,imageButton594, imageButton602, imageButton610, imageButton618, imageButton626, imageButton634, imageButton771 )
        sayac++
        textView10.text = ""+sayac
    }
    fun b8ust (view : View) {
        renderust(imageButton636, imageButton579,imageButton587,imageButton595, imageButton603, imageButton611, imageButton619, imageButton627, imageButton635, imageButton836 )
        sayac++
        textView10.text = ""+sayac
    }


    fun b1yan (view : View) {
        renderyan(imageButton, imageButton2,imageButton80,imageButton536, imageButton569, imageButton570, imageButton571, imageButton636 )
        sayac++
        textView10.text = ""+sayac
    }
    fun b2yan (view : View) {
        renderyan(imageButton572, imageButton573,imageButton574,imageButton575, imageButton576, imageButton577, imageButton578, imageButton579 )
        sayac++
        textView10.text = ""+sayac
    }

    fun b3yan (view : View) {
        renderyan(imageButton580, imageButton581,imageButton582,imageButton583, imageButton584, imageButton585, imageButton586, imageButton587 )
        sayac++
        textView10.text = ""+sayac
    }
    fun b4yan (view : View) {
        renderyan(imageButton588, imageButton589,imageButton590,imageButton591, imageButton592, imageButton593, imageButton594, imageButton595 )
        sayac++
        textView10.text = ""+sayac
    }
    fun b5yan (view : View) {
        renderyan(imageButton596, imageButton597,imageButton598,imageButton599, imageButton600, imageButton601, imageButton602, imageButton603 )
        sayac++
        textView10.text = ""+sayac
    }
    fun b6yan (view : View) {
        renderyan(imageButton604, imageButton605,imageButton606,imageButton607, imageButton608, imageButton609, imageButton610, imageButton611)
        sayac++
        textView10.text = ""+sayac
    }
    fun b7yan (view : View) {
        renderyan(imageButton612, imageButton613,imageButton614,imageButton615, imageButton616, imageButton617, imageButton618, imageButton619)
        sayac++
        textView10.text = ""+sayac
    }

    fun b8yan (view : View) {
        renderyan(imageButton620, imageButton621,imageButton622,imageButton623, imageButton624, imageButton625, imageButton626, imageButton627)
        sayac++
        textView10.text = ""+sayac
    }
    fun b9yan (view : View) {
        renderyan(imageButton628, imageButton629,imageButton630,imageButton631, imageButton632, imageButton633, imageButton634, imageButton635)
        sayac++
        textView10.text = ""+sayac
    }
    fun b10yan (view : View) {
        renderyan(imageButton669, imageButton670,imageButton671,imageButton736, imageButton769, imageButton770, imageButton771, imageButton836)
        sayac++
        textView10.text = ""+sayac
    }
    fun b1ustyedek (view : View) {
        renderust(imageButton, imageButton572,imageButton580,imageButton588, imageButton596, imageButton604, imageButton612, imageButton620,imageButton628,imageButton669)
        sayac++
        textView10.text = ""+sayac
    }
    fun b2ustyedek (view : View) {
        renderust(imageButton2, imageButton573,imageButton581,imageButton589, imageButton597, imageButton605, imageButton613, imageButton621, imageButton629, imageButton670 )
        sayac++
        textView10.text = ""+sayac
    }
    fun b3ustyedek (view : View) {
        renderust(imageButton80, imageButton574,imageButton582,imageButton590, imageButton598, imageButton606, imageButton614, imageButton622, imageButton630, imageButton671  )
        sayac++
        textView10.text = ""+sayac
    }
    fun b4ustyedek (view : View) {
        renderust(imageButton536, imageButton575,imageButton583,imageButton591, imageButton599, imageButton607, imageButton615, imageButton623, imageButton631, imageButton736 )
        sayac++
        textView10.text = ""+sayac
    }
    fun b5ustyedek (view : View) {
        renderust(imageButton569, imageButton576,imageButton584,imageButton592, imageButton600, imageButton608, imageButton616, imageButton624, imageButton632, imageButton769 )
        sayac++
        textView10.text = ""+sayac
    }
    fun b6ustyedek (view : View) {
        renderust(imageButton570, imageButton577,imageButton585,imageButton593, imageButton601, imageButton609, imageButton617, imageButton625, imageButton633, imageButton770 )
        sayac++
        textView10.text = ""+sayac
    }
    fun b7ustyedek (view : View) {
        renderust(imageButton571, imageButton578,imageButton586,imageButton594, imageButton602, imageButton610, imageButton618, imageButton626, imageButton634, imageButton771 )
        sayac++
        textView10.text = ""+sayac
    }
    fun b8ustyedek (view : View) {
        renderust(imageButton636, imageButton579,imageButton587,imageButton595, imageButton603, imageButton611, imageButton619, imageButton627, imageButton635, imageButton836 )
        sayac++
        textView10.text = ""+sayac
    }


    fun b1yanyedek (view : View) {
        renderyan(imageButton, imageButton2,imageButton80,imageButton536, imageButton569, imageButton570, imageButton571, imageButton636 )
        sayac++
        textView10.text = ""+sayac
    }
    fun b2yanyedek (view : View) {
        renderyan(imageButton572, imageButton573,imageButton574,imageButton575, imageButton576, imageButton577, imageButton578, imageButton579 )
        sayac++
        textView10.text = ""+sayac
    }

    fun b3yanyedek (view : View) {
        renderyan(imageButton580, imageButton581,imageButton582,imageButton583, imageButton584, imageButton585, imageButton586, imageButton587 )
        sayac++
        textView10.text = ""+sayac
    }
    fun b4yanyedek (view : View) {
        renderyan(imageButton588, imageButton589,imageButton590,imageButton591, imageButton592, imageButton593, imageButton594, imageButton595 )
        sayac++
        textView10.text = ""+sayac
    }
    fun b5yanyedek (view : View) {
        renderyan(imageButton596, imageButton597,imageButton598,imageButton599, imageButton600, imageButton601, imageButton602, imageButton603 )
        sayac++
        textView10.text = ""+sayac
    }
    fun b6yanyedek (view : View) {
        renderyan(imageButton604, imageButton605,imageButton606,imageButton607, imageButton608, imageButton609, imageButton610, imageButton611)
        sayac++
        textView10.text = ""+sayac
    }
    fun b7yanyedek (view : View) {
        renderyan(imageButton612, imageButton613,imageButton614,imageButton615, imageButton616, imageButton617, imageButton618, imageButton619)
        sayac++
        textView10.text = ""+sayac
    }

    fun b8yanyedek (view : View) {
        renderyan(imageButton620, imageButton621,imageButton622,imageButton623, imageButton624, imageButton625, imageButton626, imageButton627)
        sayac++
        textView10.text = ""+sayac
    }
    fun b9yanyedek (view : View) {
        renderyan(imageButton628, imageButton629,imageButton630,imageButton631, imageButton632, imageButton633, imageButton634, imageButton635)
        sayac++
        textView10.text = ""+sayac
    }
    fun b10yanyedek (view : View) {
        renderyan(imageButton669, imageButton670,imageButton671,imageButton736, imageButton769, imageButton770, imageButton771, imageButton836)
        sayac++
        textView10.text = ""+sayac
    }



}