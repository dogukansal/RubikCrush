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
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import kotlinx.android.synthetic.main.activity_three_colur_five.*
import java.lang.Exception


class ThreeColurFive : AppCompatActivity() {
    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_colur_five)
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        textView12.text = ""+sayac
        val rnds :ArrayList<Int> = arrayListOf<Int>()
        val butonsayisi : ArrayList<ImageButton> = arrayListOf<ImageButton>(
            imageButton1009, imageButton1010, imageButton1011, imageButton1012,
            imageButton672, imageButton673, imageButton674, imageButton675,
            imageButton680, imageButton681, imageButton682, imageButton683,
            imageButton688, imageButton689, imageButton690, imageButton691,
            imageButton696, imageButton697, imageButton698, imageButton699,
            imageButton708, imageButton709, imageButton710, imageButton711,
            imageButton716, imageButton717, imageButton718, imageButton719,
            imageButton724, imageButton725, imageButton726, imageButton727,
            imageButton732, imageButton733, imageButton734, imageButton735,
            imageButton1021,imageButton1022, imageButton1023, imageButton1024,
            //kırmızı
            imageButton1013, imageButton1014, imageButton1015, imageButton1016,
            imageButton676, imageButton677, imageButton678, imageButton679,
            imageButton684, imageButton685, imageButton686, imageButton687,
            imageButton692, imageButton693, imageButton694, imageButton695,
            imageButton700, imageButton701, imageButton702, imageButton703,
            //mavi
            imageButton704, imageButton705, imageButton706, imageButton707,
            imageButton712, imageButton713, imageButton714, imageButton715,
            imageButton720, imageButton721, imageButton722, imageButton723,
            imageButton728, imageButton729, imageButton730, imageButton731,
            imageButton1017, imageButton1018, imageButton1019, imageButton1020
            //yesil
            )

        for (z in 0..79){
            val a = (0..17).random()
            rnds.add (a)
            //randomw sayilari tuttuk dışarıya çıkartma yüklemiyo !
        }
        for (i in 0..39) {
            kirmizi222(butonsayisi[i])
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
                imageButton1028.performClick()
            }
            else if(rnds[i]==17){
                imageButton1025.performClick()
            }
        }
        for (e in butonsayisi){
            e.setImageResource(android.R.color.transparent)
        }
        dene()
        var adRequest2 = AdRequest.Builder().build()

        InterstitialAd.load(this,"ca-app-pub-6469014985923539/5638206731", adRequest2, object : InterstitialAdLoadCallback() {
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
                textView48.text=""+x
                handler.postDelayed(runnable,1000)
            }
        }
        handler.post(runnable)
    }
    fun check12(view : View){
        kontrol()
    }

    fun kontrol(){
        if( renkidalma111(imageButton1009)==-5242848   && renkidalma111(imageButton1010)==-5242848    && renkidalma111(imageButton1011)==-5242848  && renkidalma111(imageButton1012)==-5242848 &&
            renkidalma111(imageButton672)==-5242848 && renkidalma111(imageButton673)==-5242848 && renkidalma111(imageButton674)==-5242848 && renkidalma111(imageButton675)==-5242848 &&
            renkidalma111(imageButton680)==-5242848 && renkidalma111(imageButton681)==-5242848 && renkidalma111(imageButton682)==-5242848 && renkidalma111(imageButton683)==-5242848 &&
            renkidalma111(imageButton688)==-5242848 && renkidalma111(imageButton689)==-5242848 && renkidalma111(imageButton690)==-5242848 && renkidalma111(imageButton691)==-5242848 &&
            renkidalma111(imageButton696)==-5242848 && renkidalma111(imageButton697)==-5242848 && renkidalma111(imageButton698)==-5242848 && renkidalma111(imageButton699)==-5242848 &&
            renkidalma111(imageButton708)==-5242848 && renkidalma111(imageButton709)==-5242848 && renkidalma111(imageButton710)==-5242848 && renkidalma111(imageButton711)==-5242848 &&
            renkidalma111(imageButton716)==-5242848 && renkidalma111(imageButton717)==-5242848 && renkidalma111(imageButton718)==-5242848 && renkidalma111(imageButton719)==-5242848 &&
            renkidalma111(imageButton724)==-5242848 && renkidalma111(imageButton725)==-5242848 && renkidalma111(imageButton726)==-5242848 && renkidalma111(imageButton727)==-5242848 &&
            renkidalma111(imageButton732)==-5242848 && renkidalma111(imageButton733)==-5242848 && renkidalma111(imageButton734)==-5242848 && renkidalma111(imageButton735)==-5242848 &&
            renkidalma111(imageButton1021)==-5242848 && renkidalma111(imageButton1022)==-5242848 && renkidalma111(imageButton1023)==-5242848  && renkidalma111(imageButton1024)==-5242848 &&
            //kırmızı

            renkidalma111(imageButton704)==-10053376 && renkidalma111(imageButton705)==-10053376 && renkidalma111(imageButton706)==-10053376 && renkidalma111(imageButton707)==-10053376 &&
            renkidalma111(imageButton712)==-10053376 && renkidalma111(imageButton713)==-10053376 && renkidalma111(imageButton714)==-10053376 && renkidalma111(imageButton715)==-10053376 &&
            renkidalma111(imageButton720)==-10053376 && renkidalma111(imageButton721)==-10053376 && renkidalma111(imageButton722)==-10053376 && renkidalma111(imageButton723)==-10053376 &&
            renkidalma111(imageButton728)==-10053376 && renkidalma111(imageButton729)==-10053376 && renkidalma111(imageButton730)==-10053376 && renkidalma111(imageButton731)==-10053376 &&
            renkidalma111(imageButton1017)==-10053376 && renkidalma111(imageButton1018)==-10053376 && renkidalma111(imageButton1019)==-10053376 && renkidalma111(imageButton1020)==-10053376 &&
            //yesil
            renkidalma111(imageButton1013)==-16776961 && renkidalma111(imageButton1014)==-16776961 && renkidalma111(imageButton1015)==-16776961 && renkidalma111(imageButton1016)==-16776961 &&
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
                veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun11 (id INTEGER PRİMARY KEY, color3sizee5 INTEGER UNIQUE)")
                val cursor1 = veritabani.rawQuery("SELECT * FROM oyun11", null)
                val idColumnIndex = cursor1.getColumnIndex("id")
                val isimColumnIndex = cursor1.getColumnIndex("color3sizee5")  //-1
                while (cursor1.moveToNext()) {
                    deneme = cursor1.getInt(isimColumnIndex)
                }
                if (deneme == 0) {
                    veritabani.execSQL("INSERT INTO oyun11 (id , color3sizee5 ) VALUES (1,$sayac)") // ilk başta veri yoksa tanımla
                } else {
                    if (sayac < deneme) {  // veri varsa bunu yap
                        veritabani.execSQL("INSERT OR IGNORE INTO oyun11 (id , color3sizee5 ) VALUES (1,$sayac)")
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
                val intent= Intent(applicationContext, ThreeColurFive::class.java)
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
    fun b1ust3 (view : View) {
        renderust(imageButton1009, imageButton672,imageButton680,imageButton688, imageButton696, imageButton704, imageButton712, imageButton720,imageButton728,imageButton1017)
        sayac++
        textView12.text = ""+sayac
    }
    fun b2ust3 (view : View) {
        renderust(imageButton1010, imageButton673,imageButton681,imageButton689, imageButton697, imageButton705, imageButton713, imageButton721, imageButton729, imageButton1018 )
        sayac++
        textView12.text = ""+sayac
    }
    fun b3ust3 (view : View) {
        renderust(imageButton1011, imageButton674,imageButton682,imageButton690, imageButton698, imageButton706, imageButton714, imageButton722, imageButton730, imageButton1019  )
        sayac++
        textView12.text = ""+sayac
    }
    fun b4ust3 (view : View) {
        renderust(imageButton1012, imageButton675,imageButton683,imageButton691, imageButton699, imageButton707, imageButton715, imageButton723, imageButton731, imageButton1020 )
        sayac++
        textView12.text = ""+sayac
    }
    fun b5ust3 (view : View) {
        renderust(imageButton1013, imageButton676,imageButton684,imageButton692, imageButton700, imageButton708, imageButton716, imageButton724, imageButton732, imageButton1021 )
        sayac++
        textView12.text = ""+sayac
    }
    fun b6ust3 (view : View) {
        renderust(imageButton1014, imageButton677,imageButton685,imageButton693, imageButton701, imageButton709, imageButton717, imageButton725, imageButton733, imageButton1022 )
        sayac++
        textView12.text = ""+sayac
    }
    fun b7ust3 (view : View) {
        renderust(imageButton1015, imageButton678,imageButton686,imageButton694, imageButton702, imageButton710, imageButton718, imageButton726, imageButton734, imageButton1023 )
        sayac++
        textView12.text = ""+sayac
    }
    fun b8ust3 (view : View) {
        renderust(imageButton1016, imageButton679,imageButton687,imageButton695, imageButton703, imageButton711, imageButton719, imageButton727, imageButton735, imageButton1024 )
        sayac++
        textView12.text = ""+sayac
    }


    fun b1yan3 (view : View) {
        renderyan(imageButton1009, imageButton1010,imageButton1011,imageButton1012, imageButton1013, imageButton1014, imageButton1015, imageButton1016 )
        sayac++
        textView12.text = ""+sayac
    }
    fun b2yan3 (view : View) {
        renderyan(imageButton672, imageButton673,imageButton674,imageButton675, imageButton676, imageButton677, imageButton678, imageButton679 )
        sayac++
        textView12.text = ""+sayac
    }

    fun b3yan3 (view : View) {
        renderyan(imageButton680, imageButton681,imageButton682,imageButton683, imageButton684, imageButton685, imageButton686, imageButton687 )
        sayac++
        textView12.text = ""+sayac
    }
    fun b4yan3 (view : View) {
        renderyan(imageButton688, imageButton689,imageButton690,imageButton691, imageButton692, imageButton693, imageButton694, imageButton695 )
        sayac++
        textView12.text = ""+sayac
    }
    fun b5yan3 (view : View) {
        renderyan(imageButton696, imageButton697,imageButton698,imageButton699, imageButton700, imageButton701, imageButton702, imageButton703 )
        sayac++
        textView12.text = ""+sayac
    }
    fun b6yan3 (view : View) {
        renderyan(imageButton704, imageButton705,imageButton706,imageButton707, imageButton708, imageButton709, imageButton710, imageButton711)
        sayac++
        textView12.text = ""+sayac
    }
    fun b7yan3 (view : View) {
        renderyan(imageButton712, imageButton713,imageButton714,imageButton715, imageButton716, imageButton717, imageButton718, imageButton719)
        sayac++
        textView12.text = ""+sayac
    }

    fun b8yan3 (view : View) {
        renderyan(imageButton720, imageButton721,imageButton722,imageButton723, imageButton724, imageButton725, imageButton726, imageButton727)
        sayac++
        textView12.text = ""+sayac
    }
    fun b9yan3 (view : View) {
        renderyan(imageButton728, imageButton729,imageButton730,imageButton731, imageButton732, imageButton733, imageButton734, imageButton735)
        sayac++
        textView12.text = ""+sayac
    }
    fun b10yan3 (view : View) {
        renderyan(imageButton1017, imageButton1018,imageButton1019,imageButton1020, imageButton1021, imageButton1022, imageButton1023, imageButton1024)
        sayac++
        textView12.text = ""+sayac
    }

    fun b1ustyedek3 (view : View) {
        renderust(imageButton1009, imageButton672,imageButton680,imageButton688, imageButton696, imageButton704, imageButton712, imageButton720,imageButton728,imageButton1017)
        sayac++
        textView12.text = ""+sayac
    }
    fun b2ustyedek3 (view : View) {
        renderust(imageButton1010, imageButton673,imageButton681,imageButton689, imageButton697, imageButton705, imageButton713, imageButton721, imageButton729, imageButton1018 )
        sayac++
        textView12.text = ""+sayac
    }
    fun b3ustyedek3 (view : View) {
        renderust(imageButton1011, imageButton674,imageButton682,imageButton690, imageButton698, imageButton706, imageButton714, imageButton722, imageButton730, imageButton1019  )
        sayac++
        textView12.text = ""+sayac
    }
    fun b4ustyedek3 (view : View) {
        renderust(imageButton1012, imageButton675,imageButton683,imageButton691, imageButton699, imageButton707, imageButton715, imageButton723, imageButton731, imageButton1020 )
        sayac++
        textView12.text = ""+sayac
    }
    fun b5ustyedek3 (view : View) {
        renderust(imageButton1013, imageButton676,imageButton684,imageButton692, imageButton700, imageButton708, imageButton716, imageButton724, imageButton732, imageButton1021 )
        sayac++
        textView12.text = ""+sayac
    }
    fun b6ustyedek3 (view : View) {
        renderust(imageButton1014, imageButton677,imageButton685,imageButton693, imageButton701, imageButton709, imageButton717, imageButton725, imageButton733, imageButton1022 )
        sayac++
        textView12.text = ""+sayac
    }
    fun b7ustyedek3 (view : View) {
        renderust(imageButton1015, imageButton678,imageButton686,imageButton694, imageButton702, imageButton710, imageButton718, imageButton726, imageButton734, imageButton1023 )
        sayac++
        textView12.text = ""+sayac
    }
    fun b8ustyedek3 (view : View) {
        renderust(imageButton1016, imageButton679,imageButton687,imageButton695, imageButton703, imageButton711, imageButton719, imageButton727, imageButton735, imageButton1024 )
        sayac++
        textView12.text = ""+sayac
    }


    fun b1yanyedek3 (view : View) {
        renderyan(imageButton1009, imageButton1010,imageButton1011,imageButton1012, imageButton1013, imageButton1014, imageButton1015, imageButton1016 )
        sayac++
        textView12.text = ""+sayac
    }
    fun b2yanyedek3 (view : View) {
        renderyan(imageButton672, imageButton673,imageButton674,imageButton675, imageButton676, imageButton677, imageButton678, imageButton679 )
        sayac++
        textView12.text = ""+sayac
    }

    fun b3yanyedek3 (view : View) {
        renderyan(imageButton680, imageButton681,imageButton682,imageButton683, imageButton684, imageButton685, imageButton686, imageButton687 )
        sayac++
        textView12.text = ""+sayac
    }
    fun b4yanyedek3 (view : View) {
        renderyan(imageButton688, imageButton689,imageButton690,imageButton691, imageButton692, imageButton693, imageButton694, imageButton695 )
        sayac++
        textView12.text = ""+sayac
    }
    fun b5yanyedek3 (view : View) {
        renderyan(imageButton696, imageButton697,imageButton698,imageButton699, imageButton700, imageButton701, imageButton702, imageButton703 )
        sayac++
        textView12.text = ""+sayac
    }
    fun b6yanyedek3 (view : View) {
        renderyan(imageButton704, imageButton705,imageButton706,imageButton707, imageButton708, imageButton709, imageButton710, imageButton711)
        sayac++
        textView12.text = ""+sayac
    }
    fun b7yanyedek3 (view : View) {
        renderyan(imageButton712, imageButton713,imageButton714,imageButton715, imageButton716, imageButton717, imageButton718, imageButton719)
        sayac++
        textView12.text = ""+sayac
    }

    fun b8yanyedek3 (view : View) {
        renderyan(imageButton720, imageButton721,imageButton722,imageButton723, imageButton724, imageButton725, imageButton726, imageButton727)
        sayac++
        textView12.text = ""+sayac
    }
    fun b9yanyedek3 (view : View) {
        renderyan(imageButton728, imageButton729,imageButton730,imageButton731, imageButton732, imageButton733, imageButton734, imageButton735)
        sayac++
        textView12.text = ""+sayac
    }
    fun b10yanyedek3 (view : View) {
        renderyan(imageButton1017, imageButton1018,imageButton1019,imageButton1020, imageButton1021, imageButton1022, imageButton1023, imageButton1024)
        sayac++
        textView12.text = ""+sayac
    }


    }









