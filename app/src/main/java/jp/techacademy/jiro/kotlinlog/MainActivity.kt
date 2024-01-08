package jp.techacademy.jiro.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // クラス

        val human1 = Human("Jiro", 41,"プログラミング")      // Humanのインスタンスを作る

        human1.say() // say メソッドを呼び出し
        human1.think() // think メソッドを呼び出し

        val human2 = Human("Ichiro", 40, "サッカー")      // Humanのインスタンスを作る
        human2.say() // think メソッドを呼び出し
        human2.think() // think メソッドを呼び出し
    }
}