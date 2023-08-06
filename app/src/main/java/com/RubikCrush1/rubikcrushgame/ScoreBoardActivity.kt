package com.RubikCrush1.rubikcrushgame

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_score_board.*

class ScoreBoardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score_board)
        var deneme1: Int = 0
        var deneme2: Int = 0
        var deneme3: Int = 0
        var deneme4: Int = 0
        var deneme5: Int = 0
        var deneme6: Int = 0
        var deneme7: Int = 0
        var deneme8: Int = 0
        var deneme9: Int = 0
        var deneme10: Int = 0
        var deneme11: Int = 0
        var deneme12: Int = 0
        var deneme13: Int = 0
        var deneme14: Int = 0
        var deneme15: Int = 0
        val veritabani = this.openOrCreateDatabase("DENEME", Context.MODE_PRIVATE,null)
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun1 (id INTEGER PRİMARY KEY, color2sizee2 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun2 (id INTEGER PRİMARY KEY, color2sizee3 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun3 (id INTEGER PRİMARY KEY, color2sizee4 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun4 (id INTEGER PRİMARY KEY, color3sizee2 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun5 (id INTEGER PRİMARY KEY, color3sizee3 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun6 (id INTEGER PRİMARY KEY, color3sizee4 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun7 (id INTEGER PRİMARY KEY, color4sizee2 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun8 (id INTEGER PRİMARY KEY, color4sizee3 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun9 (id INTEGER PRİMARY KEY, color4sizee4 INTEGER UNIQUE)")

        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun10 (id INTEGER PRİMARY KEY, color2sizee5 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun11 (id INTEGER PRİMARY KEY, color3sizee5 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun12 (id INTEGER PRİMARY KEY, color2sizee6 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun13 (id INTEGER PRİMARY KEY, color3sizee6 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun14 (id INTEGER PRİMARY KEY, color4sizee5 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun15 (id INTEGER PRİMARY KEY, color4sizee6 INTEGER UNIQUE)")
        val cursor1 = veritabani.rawQuery("SELECT * FROM oyun1", null)
        val cursor2 = veritabani.rawQuery("SELECT * FROM oyun2", null)
        val cursor3 = veritabani.rawQuery("SELECT * FROM oyun3", null)
        val cursor4 = veritabani.rawQuery("SELECT * FROM oyun4", null)
        val cursor5 = veritabani.rawQuery("SELECT * FROM oyun5", null)
        val cursor6 = veritabani.rawQuery("SELECT * FROM oyun6", null)
        val cursor7 = veritabani.rawQuery("SELECT * FROM oyun7", null)
        val cursor8 = veritabani.rawQuery("SELECT * FROM oyun8", null)
        val cursor9 = veritabani.rawQuery("SELECT * FROM oyun9", null)
        val cursor10 = veritabani.rawQuery("SELECT * FROM oyun10", null)
        val cursor11 = veritabani.rawQuery("SELECT * FROM oyun11", null)
        val cursor12 = veritabani.rawQuery("SELECT * FROM oyun12", null)
        val cursor13 = veritabani.rawQuery("SELECT * FROM oyun13", null)
        val cursor14 = veritabani.rawQuery("SELECT * FROM oyun14", null)
        val cursor15 = veritabani.rawQuery("SELECT * FROM oyun15", null)
        val isimColumnIndex1 = cursor1.getColumnIndex("color2sizee2")  //-1
        val isimColumnIndex2 = cursor2.getColumnIndex("color2sizee3")
        val isimColumnIndex3 = cursor3.getColumnIndex("color2sizee4")
        val isimColumnIndex4 = cursor4.getColumnIndex("color3sizee2")
        val isimColumnIndex5 = cursor5.getColumnIndex("color3sizee3")
        val isimColumnIndex6 = cursor6.getColumnIndex("color3sizee4")
        val isimColumnIndex7 = cursor7.getColumnIndex("color4sizee2")
        val isimColumnIndex8 = cursor8.getColumnIndex("color4sizee3")
        val isimColumnIndex9 = cursor9.getColumnIndex("color4sizee4")
        while (cursor1.moveToNext()) {
            deneme1 = cursor1.getInt(isimColumnIndex1)
        }
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
        while (cursor8.moveToNext()) {
            deneme8 = cursor8.getInt(isimColumnIndex1)
        }
        while (cursor9.moveToNext()) {
            deneme9 = cursor9.getInt(isimColumnIndex1)
            }
        while (cursor10.moveToNext()) {
            deneme10 = cursor10.getInt(isimColumnIndex1)
        }
        while (cursor11.moveToNext()) {
            deneme11 = cursor11.getInt(isimColumnIndex1)
        }
        while (cursor12.moveToNext()) {
            deneme12 = cursor12.getInt(isimColumnIndex1)
        }
        while (cursor13.moveToNext()) {
            deneme13 = cursor13.getInt(isimColumnIndex1)
        }
        while (cursor14.moveToNext()) {
            deneme14 = cursor14.getInt(isimColumnIndex1)
        }
        while (cursor15.moveToNext()) {
            deneme15 = cursor15.getInt(isimColumnIndex1)
        }
        if(deneme1==0){
            textView10.text=""+0
        }
        else{

            textView10.text=""+deneme1
        }
        if(deneme2==0){
            textView11.text=""+0
        }
        else{

            if(deneme2<=20){
                imageButton1130.setImageResource(R.drawable.star3)
            }
            else if (deneme2<=40){
                imageButton1130.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1130.setImageResource(R.drawable.star1)
            }

            textView11.text=""+deneme2
        }
        if(deneme3==0){
            textView12.text=""+0
        }
        else{

            if(deneme3<=30){
                imageButton1131.setImageResource(R.drawable.star3)
            }
            else if (deneme3<=50){
                imageButton1131.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1131.setImageResource(R.drawable.star1)
            }

            textView12.text=""+deneme3
        }
        if(deneme4==0){
            textView13.text=""+0
        }
        else{

            textView13.text=""+deneme4
        }
        if(deneme5==0){
            textView14.text=""+0
        }
        else{

            if(deneme5<=40){
                imageButton1138.setImageResource(R.drawable.star3)
            }
            else if (deneme5<=60){
                imageButton1138.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1138.setImageResource(R.drawable.star1)
            }

            textView14.text=""+deneme5
        }
        if(deneme6==0){
            textView15.text=""+0
        }
        else{

            if(deneme6<=60){
                imageButton1139.setImageResource(R.drawable.star3)
            }
            else if (deneme6<=80){
                imageButton1139.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1139.setImageResource(R.drawable.star1)
            }

            textView15.text=""+deneme6
        }
        if(deneme7==0){
            textView16.text=""+0
        }
        else{

            textView16.text=""+deneme7
        }
        if(deneme8==0){
            textView17.text=""+0
        }
        else{

            if(deneme8<=40){
                imageButton1142.setImageResource(R.drawable.star3)
            }
            else if (deneme8<=60){
                imageButton1142.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1142.setImageResource(R.drawable.star1)
            }

            textView17.text=""+deneme8
        }
        if(deneme9==0){
            textView18.text=""+0
        }
        else{

            if(deneme9<=60){
                imageButton1143.setImageResource(R.drawable.star3)
            }
            else if (deneme9<=80){
                imageButton1143.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1143.setImageResource(R.drawable.star1)
            }

            textView18.text=""+deneme9
        }
        if(deneme10==0){
            textView27.text=""+0
        }
        else{

            if(deneme10<=40){
                imageButton1132.setImageResource(R.drawable.star3)
            }
            else if (deneme10<=60){
                imageButton1132.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1132.setImageResource(R.drawable.star1)
            }

            textView27.text=""+deneme10
        }
        if(deneme11==0){
            textView29.text=""+0
        }
        else{

            if(deneme11<=80){
                imageButton1160.setImageResource(R.drawable.star3)
            }
            else if (deneme11<=100){
                imageButton1160.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1160.setImageResource(R.drawable.star1)
            }

            textView29.text=""+deneme11
        }
        if(deneme12==0){
            textView28.text=""+0
        }
        else{

            if(deneme12<=50){
                imageButton1133.setImageResource(R.drawable.star3)
            }
            else if (deneme12<=70){
                imageButton1133.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1133.setImageResource(R.drawable.star1)
            }

            textView28.text=""+deneme12
        }
        if(deneme13==0){
            textView30.text=""+0
        }
        else{

            if(deneme13<=100){
                imageButton1140.setImageResource(R.drawable.star3)
            }
            else if (deneme13<=120){
                imageButton1140.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1140.setImageResource(R.drawable.star1)
            }

            textView30.text=""+deneme13
        }
        if(deneme14==0){
            textView31.text=""+0
        }
        else{
            if(deneme14<=80){
                imageButton1144.setImageResource(R.drawable.star3)
            }
            else if (deneme14<=100){
                imageButton1144.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1144.setImageResource(R.drawable.star1)
            }
            textView31.text=""+deneme14
        }
        if(deneme15==0){
            textView32.text=""+0
        }
        else{
            if(deneme15<=100){
                imageButton1145.setImageResource(R.drawable.star3)
            }
            else if (deneme15<=120){
                imageButton1145.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1145.setImageResource(R.drawable.star1)
            }
            textView32.text=""+deneme15
        }





        }

    }
