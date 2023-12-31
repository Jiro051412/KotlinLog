package jp.techacademy.jiro.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // クラス

        val human = Human("Jiro", 41)      // Humanのインスタンスを作る

        human.say() // say メソッドを呼び出し
        Log.d("kotlintest", "私の名前は" + human.name + "です。"+"年は" + human.age + "歳です。")

        human.think() // think メソッドを呼び出し
        Log.d("kotlintest", "私は" + human.hobby + "について考える" )

    }
}