package jp.techacademy.jiro.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // クラス

        val human1 = Human("Jiro", 41,"")      // Humanのインスタンスを作る

        human1.say() // say メソッドを呼び出し

        val human2 = Human("Jiro", 41, "プログラミング")      // Humanのインスタンスを作る
        human2.think() // think メソッドを呼び出し
    }
}