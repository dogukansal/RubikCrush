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
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import kotlinx.android.synthetic.main.activity_four_color_five.*
import java.lang.Exception

class FourColorFive : AppCompatActivity() {
    lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four_color_five)
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
        textView13.text = ""+sayac
        val rnds :ArrayList<Int> = arrayListOf<Int>()
        val butonsayisi : ArrayList<ImageButton> = arrayListOf<ImageButton>(
            imageButton1109, imageButton1110, imageButton1111, imageButton1112,
            imageButton672, imageButton673, imageButton674, imageButton675,
            imageButton680, imageButton681, imageButton682, imageButton683,
            imageButton688, imageButton689, imageButton690, imageButton691,
            imageButton696, imageButton697, imageButton698, imageButton699,
            //kırmızı
            imageButton708, imageButton709, imageButton710, imageButton711,
            imageButton716, imageButton717, imageButton718, imageButton719,
            imageButton724, imageButton725, imageButton726, imageButton727,
            imageButton732, imageButton733, imageButton734, imageButton735,
            imageButton1121,imageButton1122, imageButton1123, imageButton1124,
            //siyah
            imageButton1113, imageButton1114, imageButton1115, imageButton1116,
            imageButton676, imageButton677, imageButton678, imageButton679,
            imageButton684, imageButton685, imageButton686, imageButton687,
            imageButton692, imageButton693, imageButton694, imageButton695,
            imageButton700, imageButton701, imageButton702, imageButton703,
            //mavi
            imageButton704, imageButton705, imageButton706, imageButton707,
            imageButton712, imageButton713, imageButton714, imageButton715,
            imageButton720, imageButton721, imageButton722, imageButton723,
            imageButton728, imageButton729, imageButton730, imageButton731,
            imageButton1117, imageButton1118, imageButton1119, imageButton1120
            //yesil
        )

        for (z in 0..79){
            val a = (0..17).random()
            rnds.add (a)
            //randomw sayilari tuttuk dışarıya çıkartma yüklemiyo !
        }
        for (i in 0..19) {
            kirmizi222(butonsayisi[i])
        }
        for (i in 20..39) {
            turuncu222(butonsayisi[i])
        }
        for (i in 40..59) {
            mavi222(butonsayisi[i])
        }
        for (i in 60..79) {
            yesil222(butonsayisi[i])
        }
        for (i in 0..35) {
            if(rnds[i]==0){
                imageButton737.performClick()
            }
            else if(rnds[i]==1){
                imageButton738.performClick()
            }
            else if(rnds[i]==2){
                imageButton739.performClick()
            }
            else if(rnds[i]==3){
                imageButton740.performClick()
            }
            else if(rnds[i]==4){
                imageButton741.performClick()
            }
            else if(rnds[i]==5){
                imageButton742.performClick()
            }
            else if(rnds[i]==6){
                imageButton743.performClick()
            }
            else if(rnds[i]==7){
                imageButton744.performClick()
            }
            else if(rnds[i]==8){
                imageButton761.performClick()
            }
            else if(rnds[i]==9){
                imageButton762.performClick()
            }
            else if(rnds[i]==10){
                imageButton763.performClick()
            }
            else if(rnds[i]==11){
                imageButton764.performClick()
            }
            else if(rnds[i]==12){
                imageButton765.performClick()
            }
            else if(rnds[i]==13){
                imageButton766.performClick()
            }
            else if(rnds[i]==14){
                imageButton767.performClick()
            }
            else if(rnds[i]==15){
                imageButton768.performClick()
            }
            else if(rnds[i]==16){
                imageButton1102.performClick()
            }
            else if(rnds[i]==17){
                imageButton1104.performClick()
            }
        }
        for (e in butonsayisi){
            e.setImageResource(android.R.color.transparent)
        }
        dene()

        var adRequest2 = AdRequest.Builder().build()

        InterstitialAd.load(this,"ca-app-pub-6469014985923539/1401053609", adRequest2, object : InterstitialAdLoadCallback() {
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
                textView53.text=""+x
                handler.postDelayed(runnable,1000)
            }
        }
        handler.post(runnable)
    }

    /* fun veritabani(array: ArrayList<ImageButton>) {
        try {
            var deneme1: Int = 0
            val veritabani = this.openOrCreateDatabase("emoji", Context.MODE_PRIVATE, null)
            veritabani.execSQL("CREATE TABLE IF NOT EXISTS emojiler (id INTEGER PRİMARY KEY, emojiid INTEGER UNIQUE)")
            val cursor1 = veritabani.rawQuery("SELECT * FROM emojiler", null)
            val idColumnIndex = cursor1.getColumnIndex("id")
            val isimColumnIndex = cursor1.getColumnIndex("emojiid")  //-1
            while (cursor1.moveToNext()) {
                deneme1 = cursor1.getInt(isimColumnIndex)
            }
            if (deneme1 == 0) {
                veritabani.execSQL("INSERT INTO emojiler (id , emojiid ) VALUES (1,0)") // ilk başta veri yoksa tanımla
                for (butonsayis in array) {
                    butonsayis.setImageResource(android.R.color.transparent)
                }
            } else if(deneme1==1){
                for (butonsayis in array) {
                    butonsayis.setImageResource(R.drawable.corgimini)
                }
            }
            else if(deneme1==2){
                for (butonsayis in array) {
                    butonsayis.setImageResource(R.drawable.catmini)
                }
            }
            else if(deneme1==3){
                for (butonsayis in array) {
                    butonsayis.setImageResource(R.drawable.foxmini)
                }
            }
            else if(deneme1==4){
                for (butonsayis in array) {
                    butonsayis.setImageResource(R.drawable.squirrelmini)
                }
            }
            else if(deneme1==5){
                for (butonsayis in array) {
                    butonsayis.setImageResource(R.drawable.dogmini)
                }
            }
            else if(deneme1==6){
                for (butonsayis in array) {
                    butonsayis.setImageResource(R.drawable.hamstermini)
                }
            }
            else if(deneme1==7){
                for (butonsayis in array) {
                    butonsayis.setImageResource(R.drawable.hamstermini2)
                }
            }
        } catch (e: Exception) {
        }
    } */
    fun check12(view : View){
        kontrol()
    }

    fun kontrol(){
        if( renkidalma111(imageButton1109)==-5242848   && renkidalma111(imageButton1110)==-5242848    && renkidalma111(imageButton1111)==-5242848  && renkidalma111(imageButton1112)==-5242848 &&
            renkidalma111(imageButton672)==-5242848 && renkidalma111(imageButton673)==-5242848 && renkidalma111(imageButton674)==-5242848 && renkidalma111(imageButton675)==-5242848 &&
            renkidalma111(imageButton680)==-5242848 && renkidalma111(imageButton681)==-5242848 && renkidalma111(imageButton682)==-5242848 && renkidalma111(imageButton683)==-5242848 &&
            renkidalma111(imageButton688)==-5242848 && renkidalma111(imageButton689)==-5242848 && renkidalma111(imageButton690)==-5242848 && renkidalma111(imageButton691)==-5242848 &&
            renkidalma111(imageButton696)==-5242848 && renkidalma111(imageButton697)==-5242848 && renkidalma111(imageButton698)==-5242848 && renkidalma111(imageButton699)==-5242848 &&
            //kırmızı
            renkidalma111(imageButton708)==-16777216 && renkidalma111(imageButton709)==-16777216 && renkidalma111(imageButton710)==-16777216 && renkidalma111(imageButton711)==-16777216 &&
            renkidalma111(imageButton716)==-16777216 && renkidalma111(imageButton717)==-16777216 && renkidalma111(imageButton718)==-16777216 && renkidalma111(imageButton719)==-16777216 &&
            renkidalma111(imageButton724)==-16777216 && renkidalma111(imageButton725)==-16777216 && renkidalma111(imageButton726)==-16777216 && renkidalma111(imageButton727)==-16777216 &&
            renkidalma111(imageButton732)==-16777216 && renkidalma111(imageButton733)==-16777216 && renkidalma111(imageButton734)==-16777216 && renkidalma111(imageButton735)==-16777216 &&
            renkidalma111(imageButton1121)==-16777216 && renkidalma111(imageButton1122)==-16777216 && renkidalma111(imageButton1123)==-16777216  && renkidalma111(imageButton1124)==-16777216 &&
            //siyah

            renkidalma111(imageButton704)==-10053376 && renkidalma111(imageButton705)==-10053376 && renkidalma111(imageButton706)==-10053376 && renkidalma111(imageButton707)==-10053376 &&
            renkidalma111(imageButton712)==-10053376 && renkidalma111(imageButton713)==-10053376 && renkidalma111(imageButton714)==-10053376 && renkidalma111(imageButton715)==-10053376 &&
            renkidalma111(imageButton720)==-10053376 && renkidalma111(imageButton721)==-10053376 && renkidalma111(imageButton722)==-10053376 && renkidalma111(imageButton723)==-10053376 &&
            renkidalma111(imageButton728)==-10053376 && renkidalma111(imageButton729)==-10053376 && renkidalma111(imageButton730)==-10053376 && renkidalma111(imageButton731)==-10053376 &&
            renkidalma111(imageButton1117)==-10053376 && renkidalma111(imageButton1118)==-10053376 && renkidalma111(imageButton1119)==-10053376 && renkidalma111(imageButton1120)==-10053376 &&
            //yesil
            renkidalma111(imageButton1113)==-16776961 && renkidalma111(imageButton1114)==-16776961 && renkidalma111(imageButton1115)==-16776961 && renkidalma111(imageButton1116)==-16776961 &&
            renkidalma111(imageButton676)==-16776961 && renkidalma111(imageButton677)==-16776961 && renkidalma111(imageButton678)==-16776961 && renkidalma111(imageButton679)==-16776961 &&
            renkidalma111(imageButton684)==-16776961 && renkidalma111(imageButton685)==-16776961 && renkidalma111(imageButton686)==-16776961 && renkidalma111(imageButton687)==-16776961 &&
            renkidalma111(imageButton692)==-16776961 && renkidalma111(imageButton693)==-16776961 && renkidalma111(imageButton694)==-16776961 && renkidalma111(imageButton695)==-16776961 &&
            renkidalma111(imageButton700)==-16776961 && renkidalma111(imageButton701)==-16776961 && renkidalma111(imageButton702)==-16776961 && renkidalma111(imageButton703)==-16776961

        //mavi
        )
        {
            try {
                var deneme: Int = 0
                val veritabani = this.openOrCreateDatabase("DENEME", Context.MODE_PRIVATE, null)
                veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun14 (id INTEGER PRİMARY KEY, color4sizee5 INTEGER UNIQUE)")
                val cursor1 = veritabani.rawQuery("SELECT * FROM oyun14", null)
                val idColumnIndex = cursor1.getColumnIndex("id")
                val isimColumnIndex = cursor1.getColumnIndex("color4sizee5")  //-1
                while (cursor1.moveToNext()) {
                    deneme = cursor1.getInt(isimColumnIndex)
                }
                if (deneme == 0) {
                    veritabani.execSQL("INSERT INTO oyun14 (id , color4sizee5 ) VALUES (1,$sayac)") // ilk başta veri yoksa tanımla
                } else {
                    if (sayac < deneme) {  // veri varsa bunu yap
                        veritabani.execSQL("INSERT OR IGNORE INTO oyun14 (id , color4sizee5 ) VALUES (1,$sayac)")
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
            if(sayac<=80){
                alert.setIcon(R.drawable.star3)
            }
            else if (sayac<=100){
                alert.setIcon(R.drawable.star2)
            }
            else {
                alert.setIcon(R.drawable.star1)
            }
            alert.setPositiveButton("Yes") { dialogInterface: DialogInterface, i: Int ->

                // Evet butonuna tıklayınca olacaklar
                val intent= Intent(applicationContext, FourColorFive::class.java)
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
    fun c1ust3 (view : View) {
        renderust(imageButton1109, imageButton672,imageButton680,imageButton688, imageButton696, imageButton704, imageButton712, imageButton720,imageButton728,imageButton1117)
        sayac++
        textView13.text = ""+sayac
    }
    fun c2ust3 (view : View) {
        renderust(imageButton1110, imageButton673,imageButton681,imageButton689, imageButton697, imageButton705, imageButton713, imageButton721, imageButton729, imageButton1118 )
        sayac++
        textView13.text = ""+sayac
    }
    fun c3ust3 (view : View) {
        renderust(imageButton1111, imageButton674,imageButton682,imageButton690, imageButton698, imageButton706, imageButton714, imageButton722, imageButton730, imageButton1119  )
        sayac++
        textView13.text = ""+sayac
    }
    fun c4ust3 (view : View) {
        renderust(imageButton1112, imageButton675,imageButton683,imageButton691, imageButton699, imageButton707, imageButton715, imageButton723, imageButton731, imageButton1120 )
        sayac++
        textView13.text = ""+sayac
    }
    fun c5ust3 (view : View) {
        renderust(imageButton1113, imageButton676,imageButton684,imageButton692, imageButton700, imageButton708, imageButton716, imageButton724, imageButton732, imageButton1121 )
        sayac++
        textView13.text = ""+sayac
    }
    fun c6ust3 (view : View) {
        renderust(imageButton1114, imageButton677,imageButton685,imageButton693, imageButton701, imageButton709, imageButton717, imageButton725, imageButton733, imageButton1122 )
        sayac++
        textView13.text = ""+sayac
    }
    fun c7ust3 (view : View) {
        renderust(imageButton1115, imageButton678,imageButton686,imageButton694, imageButton702, imageButton710, imageButton718, imageButton726, imageButton734, imageButton1123 )
        sayac++
        textView13.text = ""+sayac
    }
    fun c8ust3 (view : View) {
        renderust(imageButton1116, imageButton679,imageButton687,imageButton695, imageButton703, imageButton711, imageButton719, imageButton727, imageButton735, imageButton1124 )
        sayac++
        textView13.text = ""+sayac
    }


    fun c1yan3 (view : View) {
        renderyan(imageButton1109, imageButton1110,imageButton1111,imageButton1112, imageButton1113, imageButton1114, imageButton1115, imageButton1116 )
        sayac++
        textView13.text = ""+sayac
    }
    fun c2yan3 (view : View) {
        renderyan(imageButton672, imageButton673,imageButton674,imageButton675, imageButton676, imageButton677, imageButton678, imageButton679 )
        sayac++
        textView13.text = ""+sayac
    }

    fun c3yan3 (view : View) {
        renderyan(imageButton680, imageButton681,imageButton682,imageButton683, imageButton684, imageButton685, imageButton686, imageButton687 )
        sayac++
        textView13.text = ""+sayac
    }
    fun c4yan3 (view : View) {
        renderyan(imageButton688, imageButton689,imageButton690,imageButton691, imageButton692, imageButton693, imageButton694, imageButton695 )
        sayac++
        textView13.text = ""+sayac
    }
    fun c5yan3 (view : View) {
        renderyan(imageButton696, imageButton697,imageButton698,imageButton699, imageButton700, imageButton701, imageButton702, imageButton703 )
        sayac++
        textView13.text = ""+sayac
    }
    fun c6yan3 (view : View) {
        renderyan(imageButton704, imageButton705,imageButton706,imageButton707, imageButton708, imageButton709, imageButton710, imageButton711)
        sayac++
        textView13.text = ""+sayac
    }
    fun c7yan3 (view : View) {
        renderyan(imageButton712, imageButton713,imageButton714,imageButton715, imageButton716, imageButton717, imageButton718, imageButton719)
        sayac++
        textView13.text = ""+sayac
    }

    fun c8yan3 (view : View) {
        renderyan(imageButton720, imageButton721,imageButton722,imageButton723, imageButton724, imageButton725, imageButton726, imageButton727)
        sayac++
        textView13.text = ""+sayac
    }
    fun c9yan3 (view : View) {
        renderyan(imageButton728, imageButton729,imageButton730,imageButton731, imageButton732, imageButton733, imageButton734, imageButton735)
        sayac++
        textView13.text = ""+sayac
    }
    fun c10yan3 (view : View) {
        renderyan(imageButton1117, imageButton1118,imageButton1119,imageButton1120, imageButton1121, imageButton1122, imageButton1123, imageButton1124)
        sayac++
        textView13.text = ""+sayac
    }

    fun c1ustyedek3 (view : View) {
        renderust(imageButton1109, imageButton672,imageButton680,imageButton688, imageButton696, imageButton704, imageButton712, imageButton720,imageButton728,imageButton1117)
        sayac++
        textView13.text = ""+sayac
    }
    fun c2ustyedek3 (view : View) {
        renderust(imageButton1110, imageButton673,imageButton681,imageButton689, imageButton697, imageButton705, imageButton713, imageButton721, imageButton729, imageButton1118 )
        sayac++
        textView13.text = ""+sayac
    }
    fun c3ustyedek3 (view : View) {
        renderust(imageButton1111, imageButton674,imageButton682,imageButton690, imageButton698, imageButton706, imageButton714, imageButton722, imageButton730, imageButton1119  )
        sayac++
        textView13.text = ""+sayac
    }
    fun c4ustyedek3 (view : View) {
        renderust(imageButton1112, imageButton675,imageButton683,imageButton691, imageButton699, imageButton707, imageButton715, imageButton723, imageButton731, imageButton1120 )
        sayac++
        textView13.text = ""+sayac
    }
    fun c5ustyedek3 (view : View) {
        renderust(imageButton1113, imageButton676,imageButton684,imageButton692, imageButton700, imageButton708, imageButton716, imageButton724, imageButton732, imageButton1121 )
        sayac++
        textView13.text = ""+sayac
    }
    fun c6ustyedek3 (view : View) {
        renderust(imageButton1114, imageButton677,imageButton685,imageButton693, imageButton701, imageButton709, imageButton717, imageButton725, imageButton733, imageButton1122 )
        sayac++
        textView13.text = ""+sayac
    }
    fun c7ustyedek3 (view : View) {
        renderust(imageButton1115, imageButton678,imageButton686,imageButton694, imageButton702, imageButton710, imageButton718, imageButton726, imageButton734, imageButton1123 )
        sayac++
        textView13.text = ""+sayac
    }
    fun c8ustyedek3 (view : View) {
        renderust(imageButton1116, imageButton679,imageButton687,imageButton695, imageButton703, imageButton711, imageButton719, imageButton727, imageButton735, imageButton1124 )
        sayac++
        textView13.text = ""+sayac
    }


    fun c1yanyedek3 (view : View) {
        renderyan(imageButton1109, imageButton1110,imageButton1111,imageButton1112, imageButton1113, imageButton1114, imageButton1115, imageButton1116 )
        sayac++
        textView13.text = ""+sayac
    }
    fun c2yanyedek3 (view : View) {
        renderyan(imageButton672, imageButton673,imageButton674,imageButton675, imageButton676, imageButton677, imageButton678, imageButton679 )
        sayac++
        textView13.text = ""+sayac
    }

    fun c3yanyedek3 (view : View) {
        renderyan(imageButton680, imageButton681,imageButton682,imageButton683, imageButton684, imageButton685, imageButton686, imageButton687 )
        sayac++
        textView13.text = ""+sayac
    }
    fun c4yanyedek3 (view : View) {
        renderyan(imageButton688, imageButton689,imageButton690,imageButton691, imageButton692, imageButton693, imageButton694, imageButton695 )
        sayac++
        textView13.text = ""+sayac
    }
    fun c5yanyedek3 (view : View) {
        renderyan(imageButton696, imageButton697,imageButton698,imageButton699, imageButton700, imageButton701, imageButton702, imageButton703 )
        sayac++
        textView13.text = ""+sayac
    }
    fun c6yanyedek3 (view : View) {
        renderyan(imageButton704, imageButton705,imageButton706,imageButton707, imageButton708, imageButton709, imageButton710, imageButton711)
        sayac++
        textView13.text = ""+sayac
    }
    fun c7yanyedek3 (view : View) {
        renderyan(imageButton712, imageButton713,imageButton714,imageButton715, imageButton716, imageButton717, imageButton718, imageButton719)
        sayac++
        textView13.text = ""+sayac
    }

    fun c8yanyedek3 (view : View) {
        renderyan(imageButton720, imageButton721,imageButton722,imageButton723, imageButton724, imageButton725, imageButton726, imageButton727)
        sayac++
        textView13.text = ""+sayac
    }
    fun c9yanyedek3 (view : View) {
        renderyan(imageButton728, imageButton729,imageButton730,imageButton731, imageButton732, imageButton733, imageButton734, imageButton735)
        sayac++
        textView13.text = ""+sayac
    }
    fun c10yanyedek3 (view : View) {
        renderyan(imageButton1117, imageButton1118,imageButton1119,imageButton1120, imageButton1121, imageButton1122, imageButton1123, imageButton1124)
        sayac++
        textView13.text = ""+sayac
    }
    }
