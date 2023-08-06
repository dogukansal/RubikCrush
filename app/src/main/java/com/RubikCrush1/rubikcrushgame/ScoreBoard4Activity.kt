package com.RubikCrush1.rubikcrushgame

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_score_board4.*


class ScoreBoard4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score_board4)
        var deneme2: Int = 0
        var deneme3: Int = 0
        var deneme4: Int = 0
        var deneme5: Int = 0
        var deneme6: Int = 0
        var deneme7: Int = 0

        val veritabani = this.openOrCreateDatabase("DENEME6", Context.MODE_PRIVATE,null)

        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun2 (id INTEGER PRİMARY KEY, color2sizee3 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun3 (id INTEGER PRİMARY KEY, color2sizee4 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun4 (id INTEGER PRİMARY KEY, color3sizee3 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun5 (id INTEGER PRİMARY KEY, color3sizee4 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun6 (id INTEGER PRİMARY KEY, color4sizee3 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun7 (id INTEGER PRİMARY KEY, color4sizee4 INTEGER UNIQUE)")

        val cursor2 = veritabani.rawQuery("SELECT * FROM oyun2", null)
        val cursor3 = veritabani.rawQuery("SELECT * FROM oyun3", null)
        val cursor4 = veritabani.rawQuery("SELECT * FROM oyun4", null)
        val cursor5 = veritabani.rawQuery("SELECT * FROM oyun5", null)
        val cursor6 = veritabani.rawQuery("SELECT * FROM oyun6", null)
        val cursor7 = veritabani.rawQuery("SELECT * FROM oyun7", null)

        val isimColumnIndex1 = cursor2.getColumnIndex("color2sizee3")  //-1


        while (cursor2.moveToNext()) {
            deneme2 = cursor2.getInt(isimColumnIndex1)
        }

        while (cursor3.moveToNext()) {
            deneme3 = cursor3.getInt(isimColumnIndex1)
        }

        while (cursor4.moveToNext()) {
            deneme4 = cursor4.getInt(isimColumnIndex1)
        }
        while (cursor5.moveToNext()) {
            deneme5 = cursor5.getInt(isimColumnIndex1)
        }
        while (cursor6.moveToNext()) {
            deneme6 = cursor6.getInt(isimColumnIndex1)
        }
        while (cursor7.moveToNext()) {
            deneme7 = cursor7.getInt(isimColumnIndex1)
        }

        if(deneme2==0){
            textView57.text=""+0
        }
        else{
            if(deneme2<=35){
                imageButton1129.setImageResource(R.drawable.star3)
            }
            else if (deneme2<=55){
                imageButton1129.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1129.setImageResource(R.drawable.star1)
            }
            textView57.text=""+deneme2
        }
        if(deneme3==0){
            textView63.text=""+0
        }
        else{
            if(deneme3<=55){
                imageButton1130.setImageResource(R.drawable.star3)
            }
            else if (deneme3<=75){
                imageButton1130.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1130.setImageResource(R.drawable.star1)
            }
            textView63.text=""+deneme3
        }
        if(deneme4==0){
            textView61.text=""+0
        }
        else{
            if(deneme4<=65){
                imageButton1137.setImageResource(R.drawable.star3)
            }
            else if (deneme4<=85){
                imageButton1137.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1137.setImageResource(R.drawable.star1)
            }
            textView61.text=""+deneme4
        }
        if(deneme5==0){
            textView64.text=""+0
        }
        else{
            if(deneme5<=150){
                imageButton1138.setImageResource(R.drawable.star3)
            }
            else if (deneme5<=170){
                imageButton1138.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1138.setImageResource(R.drawable.star1)
            }
            textView64.text=""+deneme5
        }
        if(deneme6==0){
            textView62.text=""+0
        }
        else{
            if(deneme6<=85){
                imageButton1141.setImageResource(R.drawable.star3)
            }
            else if (deneme6<=100){
                imageButton1141.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1141.setImageResource(R.drawable.star1)
            }
            textView62.text=""+deneme6
        }
        if(deneme7==0){
            textView65.text=""+0
        }
        else{
            if(deneme7<=160){
                imageButton1142.setImageResource(R.drawable.star3)
            }
            else if (deneme7<=190){
                imageButton1142.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1142.setImageResource(R.drawable.star1)
            }
            textView65.text=""+deneme7
        }

    }
}