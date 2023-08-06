package com.RubikCrush1.rubikcrushgame

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_score_board2.*

class ScoreBoard2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score_board2)
        var deneme1: Int = 0
        var deneme2: Int = 0
        var deneme3: Int = 0
        var deneme4: Int = 0
        var deneme5: Int = 0
        var deneme6: Int = 0

        val veritabani = this.openOrCreateDatabase("DENEME2", Context.MODE_PRIVATE,null)

        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun1 (id INTEGER PRİMARY KEY, color2sizee3 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun2 (id INTEGER PRİMARY KEY, color3sizee3 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun3 (id INTEGER PRİMARY KEY, color4sizee3 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun4 (id INTEGER PRİMARY KEY, color2sizee4 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun5 (id INTEGER PRİMARY KEY, color3sizee4 INTEGER UNIQUE)")
        veritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun6 (id INTEGER PRİMARY KEY, color4sizee4 INTEGER UNIQUE)")

        val cursor1 = veritabani.rawQuery("SELECT * FROM oyun1", null)
        val cursor2 = veritabani.rawQuery("SELECT * FROM oyun2", null)
        val cursor3 = veritabani.rawQuery("SELECT * FROM oyun3", null)
        val cursor4 = veritabani.rawQuery("SELECT * FROM oyun4", null)
        val cursor5 = veritabani.rawQuery("SELECT * FROM oyun5", null)
        val cursor6 = veritabani.rawQuery("SELECT * FROM oyun6", null)

        val isimColumnIndex1 = cursor1.getColumnIndex("color2sizee3")  //-1


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

        if(deneme1==0){
            textView57.text=""+0
        }
        else{

            if(deneme1<=40){
                imageButton1129.setImageResource(R.drawable.star3)
            }
            else if (deneme1<=60){
                imageButton1129.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1129.setImageResource(R.drawable.star1)
            }


            textView57.text=""+deneme1
        }
        if(deneme2==0){

            textView61.text=""+0
        }
        else{
            if(deneme2<=50){
                imageButton1137.setImageResource(R.drawable.star3)
            }
            else if (deneme2<=70){
                imageButton1137.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1137.setImageResource(R.drawable.star1)
            }

            textView61.text=""+deneme2
        }
        if(deneme3==0){
            textView62.text=""+0
        }
        else{
            if(deneme3<=60){
                imageButton1141.setImageResource(R.drawable.star3)
            }
            else if (deneme3<=80){
                imageButton1141.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1141.setImageResource(R.drawable.star1)
            }

            textView62.text=""+deneme3
        }
        if(deneme4==0){
            textView63.text=""+0
        }
        else{
            if(deneme4<=60){
                imageButton1130.setImageResource(R.drawable.star3)
            }
            else if (deneme4<=80){
                imageButton1130.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1130.setImageResource(R.drawable.star1)
            }
            textView63.text=""+deneme4
        }
        if(deneme5==0){
            textView64.text=""+0
        }
        else{
            if(deneme5<=60){
                imageButton1138.setImageResource(R.drawable.star3)
            }
            else if (deneme5<=80){
                imageButton1138.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1138.setImageResource(R.drawable.star1)
            }
            textView64.text=""+deneme5
        }
        if(deneme6==0){
            textView65.text=""+0
        }
        else{
            if(deneme6<=90){
                imageButton1142.setImageResource(R.drawable.star3)
            }
            else if (deneme6<=110){
                imageButton1142.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1142.setImageResource(R.drawable.star1)
            }
            textView65.text=""+deneme6
        }
        ////////
        var ddeneme1: Int = 0
        var ddeneme2: Int = 0
        var ddeneme3: Int = 0
        var ddeneme4: Int = 0
        var ddeneme5: Int = 0
        var ddeneme6: Int = 0

        val vveritabani = this.openOrCreateDatabase("DENEME3", Context.MODE_PRIVATE,null)

        vveritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun1 (id INTEGER PRİMARY KEY, color2sizee3 INTEGER UNIQUE)")
        vveritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun2 (id INTEGER PRİMARY KEY, color3sizee3 INTEGER UNIQUE)")
        vveritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun3 (id INTEGER PRİMARY KEY, color4sizee3 INTEGER UNIQUE)")
        vveritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun4 (id INTEGER PRİMARY KEY, color2sizee4 INTEGER UNIQUE)")
        vveritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun5 (id INTEGER PRİMARY KEY, color3sizee4 INTEGER UNIQUE)")
        vveritabani.execSQL("CREATE TABLE IF NOT EXISTS oyun6 (id INTEGER PRİMARY KEY, color4sizee4 INTEGER UNIQUE)")

        val ccursor1 = vveritabani.rawQuery("SELECT * FROM oyun1", null)
        val ccursor2 = vveritabani.rawQuery("SELECT * FROM oyun2", null)
        val ccursor3 = vveritabani.rawQuery("SELECT * FROM oyun3", null)
        val ccursor4 = vveritabani.rawQuery("SELECT * FROM oyun4", null)
        val ccursor5 = vveritabani.rawQuery("SELECT * FROM oyun5", null)
        val ccursor6 = vveritabani.rawQuery("SELECT * FROM oyun6", null)

        val iisimColumnIndex1 = ccursor1.getColumnIndex("color2sizee3")  //-1


        while (ccursor1.moveToNext()) {
            ddeneme1 = ccursor1.getInt(iisimColumnIndex1)
        }

        while (ccursor2.moveToNext()) {
            ddeneme2 = ccursor2.getInt(iisimColumnIndex1)
        }

        while (ccursor3.moveToNext()) {
            ddeneme3 = ccursor3.getInt(iisimColumnIndex1)
        }
        while (ccursor4.moveToNext()) {
            ddeneme4 = ccursor4.getInt(iisimColumnIndex1)
        }
        while (ccursor5.moveToNext()) {
            ddeneme5 = ccursor5.getInt(iisimColumnIndex1)
        }
        while (ccursor6.moveToNext()) {
            ddeneme6 = ccursor6.getInt(iisimColumnIndex1)
        }

        if(ddeneme1==0){
            textView67.text=""+0
        }
        else{
            if(ddeneme1<=30){
                imageButton1131.setImageResource(R.drawable.star3)
            }
            else if (ddeneme1<=550){
                imageButton1131.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1131.setImageResource(R.drawable.star1)
            }
            textView67.text=""+ddeneme1
        }
        if(ddeneme2==0){
            textView69.text=""+0
        }
        else{
            if(ddeneme2<=50){
                imageButton1139.setImageResource(R.drawable.star3)
            }
            else if (ddeneme2<=70){
                imageButton1139.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1139.setImageResource(R.drawable.star1)
            }
            textView69.text=""+ddeneme2
        }
        if(ddeneme3==0){
            textView71.text=""+0
        }
        else{
            if(ddeneme3<=50){
                imageButton1143.setImageResource(R.drawable.star3)
            }
            else if (ddeneme3<=70){
                imageButton1143.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1143.setImageResource(R.drawable.star1)
            }
            textView71.text=""+ddeneme3
        }
        if(ddeneme4==0){
            textView68.text=""+0
        }
        else{
            if(ddeneme4<=60){
                imageButton1132.setImageResource(R.drawable.star3)
            }
            else if (ddeneme4<=80){
                imageButton1132.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1132.setImageResource(R.drawable.star1)
            }
            textView68.text=""+ddeneme4
        }
        if(ddeneme5==0){
            textView70.text=""+0
        }
        else{
            if(ddeneme5<=60){
                imageButton1140.setImageResource(R.drawable.star3)
            }
            else if (ddeneme5<=80){
                imageButton1140.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1140.setImageResource(R.drawable.star1)
            }
            textView70.text=""+ddeneme5
        }
        if(ddeneme6==0){
            textView72.text=""+0
        }
        else{
            if(ddeneme6<=60){
                imageButton1144.setImageResource(R.drawable.star3)
            }
            else if (ddeneme6<=80){
                imageButton1144.setImageResource(R.drawable.star2)
            }
            else {
                imageButton1144.setImageResource(R.drawable.star1)
            }
            textView72.text=""+ddeneme6
        }





    }
    }
