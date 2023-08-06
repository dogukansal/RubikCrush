package com.RubikCrush1.rubikcrushgame.mod2.TwoColorGames

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
import kotlinx.android.synthetic.main.activity_two_color_four2.*


class TwoColorFour2 : AppCompatActivity() {
    lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_color_four2)
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
        val rnds :ArrayList<Int> = arrayListOf<Int>()
        textView3.text = ""+sayac
        val butonsayisi : ArrayList<ImageButton> = arrayListOf<ImageButton>(
            imageButton100, imageButton97,  imageButton98,  imageButton99,  imageButton104,imageButton109 , imageButton106, imageButton107
            , imageButton112, imageButton113, imageButton118, imageButton115, imageButton120, imageButton121, imageButton122,imageButton127

            , imageButton128, imageButton133, imageButton134, imageButton135, imageButton140, imageButton137, imageButton142, imageButton143
            , imageButton148, imageButton149,imageButton146 , imageButton151, imageButton156, imageButton157, imageButton158,  imageButton155

            ,imageButton96 , imageButton101, imageButton102, imageButton103, imageButton108, imageButton105, imageButton110, imageButton111
            , imageButton116, imageButton117,imageButton114 , imageButton119, imageButton124, imageButton125, imageButton126, imageButton123

            , imageButton132, imageButton129, imageButton130, imageButton131, imageButton136, imageButton141, imageButton138, imageButton139
            , imageButton144, imageButton145, imageButton150, imageButton147, imageButton152, imageButton153, imageButton154, imageButton159 )
        for (z in 0..63){
            val a = (0..17).random()
            rnds.add (a)
            //randomw sayilari tuttuk dışarıya çıkartma yüklemiyo !
        }
        for (i in 0..31) {
            kirmizi111(butonsayisi[i])
        }
        for (i in 32..63) {
            mavi111(butonsayisi[i])
        }
        imageButton18.performClick()
        imageButton17.performClick()
        imageButton164.performClick()
        imageButton188.performClick()
        imageButton163.performClick()
        imageButton187.performClick()
        for (i in 0..49) {
            if(rnds[i]==0){
                imageButton160.performClick()
            }
            else if(rnds[i]==1){
                imageButton161.performClick()
            }
            else if(rnds[i]==2){
                imageButton162.performClick()
            }
            else if(rnds[i]==3){
                imageButton163.performClick()
            }
            else if(rnds[i]==4){
                imageButton164.performClick()
            }
            else if(rnds[i]==5){
                imageButton165.performClick()
            }
            else if(rnds[i]==6){
                imageButton166.performClick()
            }
            else if(rnds[i]==7){
                imageButton167.performClick()
            }
            else if(rnds[i]==8){
                imageButton184.performClick()
            }
            else if(rnds[i]==9){
                imageButton185.performClick()
            }
            else if(rnds[i]==10){
                imageButton186.performClick()
            }
            else if(rnds[i]==11){
                imageButton187.performClick()
            }
            else if(rnds[i]==12){
                imageButton188.performClick()
            }
            else if(rnds[i]==13){
                imageButton189.performClick()
            }
            else if(rnds[i]==14){
                imageButton190.performClick()
            }
            else if(rnds[i]==15){
                imageButton191.performClick()
            }
            else if(rnds[i]==16){
                imageButton18.performClick()
            }
            else if(rnds[i]==17){
                imageButton17.performClick()
            }
        }
        for (e in butonsayisi){
            e.setImageResource(android.R.color.transparent)
        }
        imageButton96.setImageResource(R.drawable.close)
        imageButton105.setImageResource(R.drawable.close)
        imageButton114.setImageResource(R.drawable.close)
        imageButton123.setImageResource(R.drawable.close)

        imageButton100.setImageResource(R.drawable.close)
        imageButton109.setImageResource(R.drawable.close)
        imageButton118.setImageResource(R.drawable.close)
        imageButton127.setImageResource(R.drawable.close)

        imageButton128.setImageResource(R.drawable.close)
        imageButton137.setImageResource(R.drawable.close)
        imageButton146.setImageResource(R.drawable.close)
        imageButton155.setImageResource(R.drawable.close)

        imageButton132.setImageResource(R.drawable.close)
        imageButton141.setImageResource(R.drawable.close)
        imageButton150.setImageResource(R.drawable.close)
        imageButton159.setImageResource(R.drawable.close)
        dene()
    var adRequest2 = AdRequest.Builder().build()

        InterstitialAd.load(this,"ca-app-pub-6469014985923539/4957155234", adRequest2, object : InterstitialAdLoadCallback() {
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
    var sayac=-56
    var x=0
    var runnable:Runnable = Runnable {  }
    var handler = Handler()
    fun dene(){
        x=0
        runnable = object : Runnable{
            override fun run() {
                x=x+1
                textView42.text=""+x
                handler.postDelayed(runnable,1000)
            }
        }
        handler.post(runnable)
    }

    fun check3(view : View){
        kontrol()
    }

    fun kontrol(){
        if( renkidalma111(imageButton96)==-16776961 && renkidalma111(imageButton97)==-5242848 && renkidalma111(imageButton98)==-5242848 && renkidalma111(imageButton99)==-5242848 &&
            renkidalma111(imageButton104)==-5242848 && renkidalma111(imageButton105)==-16776961 && renkidalma111(imageButton106)==-5242848 && renkidalma111(imageButton107)==-5242848 &&
            renkidalma111(imageButton112)==-5242848 && renkidalma111(imageButton113)==-5242848 && renkidalma111(imageButton114)==-16776961 && renkidalma111(imageButton115)==-5242848 &&
            renkidalma111(imageButton120)==-5242848 && renkidalma111(imageButton121)==-5242848 && renkidalma111(imageButton122)==-5242848 && renkidalma111(imageButton123)==-16776961 &&
            renkidalma111(imageButton132)==-16776961 && renkidalma111(imageButton133)==-5242848 && renkidalma111(imageButton134)==-5242848 && renkidalma111(imageButton135)==-5242848 &&
            renkidalma111(imageButton140)==-5242848 && renkidalma111(imageButton141)==-16776961 && renkidalma111(imageButton142)==-5242848 && renkidalma111(imageButton143)==-5242848 &&
            renkidalma111(imageButton148)==-5242848 && renkidalma111(imageButton149)==-5242848 && renkidalma111(imageButton150)==-16776961 && renkidalma111(imageButton151)==-5242848 &&
            renkidalma111(imageButton156)==-5242848 && renkidalma111(imageButton157)==-5242848 && renkidalma111(imageButton158)==-5242848 && renkidalma111(imageButton159)==-16776961 &&
            //kırmızı
            renkidalma111(imageButton100)==-5242848 && renkidalma111(imageButton101)==-16776961 && renkidalma111(imageButton102)==-16776961 && renkidalma111(imageButton103)==-16776961 &&
            renkidalma111(imageButton108)==-16776961 && renkidalma111(imageButton109)==-5242848 && renkidalma111(imageButton110)==-16776961 && renkidalma111(imageButton111)==-16776961 &&
            renkidalma111(imageButton116)==-16776961 && renkidalma111(imageButton117)==-16776961 && renkidalma111(imageButton118)==-5242848 && renkidalma111(imageButton119)==-16776961 &&
            renkidalma111(imageButton124)==-16776961 && renkidalma111(imageButton125)==-16776961 && renkidalma111(imageButton126)==-16776961 && renkidalma111(imageButton127)==-5242848 &&
            renkidalma111(imageButton128)==-5242848 && renkidalma111(imageButton129)==-16776961 && renkidalma111(imageButton130)==-16776961 && renkidalma111(imageButton131)==-16776961 &&
            renkidalma111(imageButton136)==-16776961 && renkidalma111(imageButton137)==-5242848 && renkidalma111(imageButton138)==-16776961 && renkidalma111(imageButton139)==-16776961 &&
            renkidalma111(imageButton144)==-16776961 && renkidalma111(imageButton145)==-16776961 && renkidalma111(imageButton146)==-5242848 && renkidalma111(imageButton147)==-16776961 &&
            renkidalma111(imageButton152)==-16776961 && renkidalma111(imageButton153)==-16776961 && renkidalma111(imageButton154)==-16776961 && renkidalma111(imageButton155)==-5242848
        //mavi
        )
        {
            try {
                var deneme: Int = 0
                val veritabani = this.openOrCreateDatabase("DENEME2", Context.MODE_PRIVATE, null)
                veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun4 (id INTEGER PRİMARY KEY, color2sizee4 INTEGER UNIQUE)")
                val cursor1 = veritabani.rawQuery("SELECT * FROM oyun4", null)
                val idColumnIndex = cursor1.getColumnIndex("id")
                val isimColumnIndex = cursor1.getColumnIndex("color2sizee4")  //-1
                while (cursor1.moveToNext()) {
                    deneme = cursor1.getInt(isimColumnIndex)
                }
                if (deneme == 0) {
                    veritabani.execSQL("INSERT INTO oyun4 (id , color2sizee4 ) VALUES (1,$sayac)") // ilk başta veri yoksa tanımla
                } else {
                    if (sayac < deneme) {  // veri varsa bunu yap
                        veritabani.execSQL("INSERT OR IGNORE INTO oyun4 (id , color2sizee4 ) VALUES (1,$sayac)")
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
            if(sayac<=60){
                alert.setIcon(R.drawable.star3)
            }
            else if (sayac<=80){
                alert.setIcon(R.drawable.star2)
            }
            else {
                alert.setIcon(R.drawable.star1)
            }
            alert.setPositiveButton("Yes") { dialogInterface: DialogInterface, i: Int ->

                // Evet butonuna tıklayınca olacaklar
                val intent= Intent(applicationContext, TwoColorFour2::class.java)
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
    fun kirmizi111(imagebuton : ImageButton) {
        imagebuton.setBackgroundColor(-5242848)
    }
    fun mavi111(imagebuton : ImageButton) {
        imagebuton.setBackgroundColor(-16776961)
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
        imagebuton1.setBackgroundColor(e)
        imagebuton2.setBackgroundColor(f)
        imagebuton3.setBackgroundColor(k)
        imagebuton4.setBackgroundColor(l)
        imagebuton5.setBackgroundColor(a)
        imagebuton6.setBackgroundColor(b)
        imagebuton7.setBackgroundColor(c)
        imagebuton8.setBackgroundColor(d)
    }
    fun render2(imagebuton1 : ImageButton, imagebuton2 : ImageButton, imagebuton3 : ImageButton, imagebuton4 : ImageButton, imagebuton5 : ImageButton, imagebuton6 : ImageButton){
        val a = renkidalma111(imagebuton1)
        val b = renkidalma111(imagebuton2)
        val c = renkidalma111(imagebuton3)
        val d = renkidalma111(imagebuton4)
        val e = renkidalma111(imagebuton5)
        val f = renkidalma111(imagebuton6)
        imagebuton1.setBackgroundColor(d)
        imagebuton2.setBackgroundColor(e)
        imagebuton3.setBackgroundColor(f)
        imagebuton4.setBackgroundColor(a)
        imagebuton5.setBackgroundColor(b)
        imagebuton6.setBackgroundColor(c)
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
    fun a111ust (view : View) {
        render2( imageButton104,imageButton112,imageButton120,  imageButton136, imageButton144, imageButton152 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a222ust (view : View) {
        render2(imageButton97, imageButton113,imageButton121, imageButton129,  imageButton145, imageButton153 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a333ust (view : View) {
        render2(imageButton98, imageButton106,imageButton122, imageButton130, imageButton138,  imageButton154 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a444ust (view : View) {
        render(imageButton99, imageButton107,imageButton115,imageButton123, imageButton131, imageButton139, imageButton147, imageButton155 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a555ust (view : View) {
        render(imageButton100, imageButton108,imageButton116,imageButton124, imageButton132, imageButton140, imageButton148, imageButton156 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a666ust (view : View) {
        render2(imageButton101, imageButton117,imageButton125, imageButton133,  imageButton149, imageButton157 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a777ust (view : View) {
        render2(imageButton102, imageButton110,imageButton126, imageButton134, imageButton142,  imageButton158 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a888ust (view : View) {
        render2(imageButton103, imageButton111,imageButton119, imageButton135, imageButton143, imageButton151 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a111yan (view : View) {
        render2( imageButton97,imageButton98,imageButton99,  imageButton101, imageButton102, imageButton103 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a222yan (view : View) {
        render2(imageButton104, imageButton106,imageButton107, imageButton108,  imageButton110, imageButton111 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a333yan (view : View) {
        render2(imageButton112, imageButton113,imageButton115, imageButton116, imageButton117,  imageButton119 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a444yan (view : View) {
        render(imageButton120, imageButton121,imageButton122,imageButton123, imageButton124, imageButton125, imageButton126, imageButton127 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a555yan (view : View) {
        render(imageButton128, imageButton129,imageButton130,imageButton131, imageButton132, imageButton133, imageButton134, imageButton135 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a666yan (view : View) {
        render2(imageButton136, imageButton138,imageButton139, imageButton140,  imageButton142, imageButton143)
        sayac++
        textView3.text = ""+sayac
    }
    fun a777yan (view : View) {
        render2(imageButton144, imageButton145,imageButton147, imageButton148, imageButton149,  imageButton151)
        sayac++
        textView3.text = ""+sayac
    }
    fun a888yan (view : View) {
        render2(imageButton152, imageButton153,imageButton154, imageButton156, imageButton157, imageButton158)
        sayac++
        textView3.text = ""+sayac
    }
    fun a111ustyedek (view : View) {
        render2( imageButton104,imageButton112,imageButton120,  imageButton136, imageButton144, imageButton152 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a222ustyedek (view : View) {
        render2(imageButton97, imageButton113,imageButton121, imageButton129,  imageButton145, imageButton153 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a333ustyedek (view : View) {
        render2(imageButton98, imageButton106,imageButton122, imageButton130, imageButton138,  imageButton154 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a444ustyedek (view : View) {
        render(imageButton99, imageButton107,imageButton115,imageButton123, imageButton131, imageButton139, imageButton147, imageButton155 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a555ustyedek (view : View) {
        render(imageButton100, imageButton108,imageButton116,imageButton124, imageButton132, imageButton140, imageButton148, imageButton156 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a666ustyedek (view : View) {
        render2(imageButton101, imageButton117,imageButton125, imageButton133,  imageButton149, imageButton157 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a777ustyedek (view : View) {
        render2(imageButton102, imageButton110,imageButton126, imageButton134, imageButton142,  imageButton158 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a888ustyedek (view : View) {
        render2(imageButton103, imageButton111,imageButton119, imageButton135, imageButton143, imageButton151 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a111yanyedek (view : View) {
        render2( imageButton97,imageButton98,imageButton99,  imageButton101, imageButton102, imageButton103 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a222yanyedek (view : View) {
        render2(imageButton104, imageButton106,imageButton107, imageButton108,  imageButton110, imageButton111 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a333yanyedek (view : View) {
        render2(imageButton112, imageButton113,imageButton115, imageButton116, imageButton117,  imageButton119 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a444yanyedek (view : View) {
        render(imageButton120, imageButton121,imageButton122,imageButton123, imageButton124, imageButton125, imageButton126, imageButton127 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a555yanyedek (view : View) {
        render(imageButton128, imageButton129,imageButton130,imageButton131, imageButton132, imageButton133, imageButton134, imageButton135 )
        sayac++
        textView3.text = ""+sayac
    }
    fun a666yanyedek (view : View) {
        render2(imageButton136, imageButton138,imageButton139, imageButton140,  imageButton142, imageButton143)
        sayac++
        textView3.text = ""+sayac
    }
    fun a777yanyedek (view : View) {
        render2(imageButton144, imageButton145,imageButton147, imageButton148, imageButton149,  imageButton151)
        sayac++
        textView3.text = ""+sayac
    }
    fun a888yanyedek (view : View) {
        render2(imageButton152, imageButton153,imageButton154, imageButton156, imageButton157, imageButton158)
        sayac++
        textView3.text = ""+sayac
    }

    fun carprazsolust4 (view : View) {
        rendercarpraz(imageButton159, imageButton150,imageButton141, imageButton132, imageButton123, imageButton114, imageButton105, imageButton96)
        sayac++
        textView3.text = ""+sayac
    }
    fun carprazsolalt4 (view : View) {
        rendercarpraz(imageButton100, imageButton109,imageButton118, imageButton127, imageButton128, imageButton137, imageButton146, imageButton155)
        sayac++
        textView3.text = ""+sayac
    }
    fun carprazsagust4 (view : View) {
        rendercarpraz(imageButton155, imageButton146,imageButton137, imageButton128, imageButton127, imageButton118, imageButton109, imageButton100)
        sayac++
        textView3.text = ""+sayac
    }
    fun carprazsagalt4 (view : View) {
        rendercarpraz(imageButton96, imageButton105,imageButton114, imageButton123, imageButton132, imageButton141, imageButton150, imageButton159)
        sayac++
        textView3.text = ""+sayac
    }
    }
