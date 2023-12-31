package jp.techacademy.jiro.kotlinlog

import android.util.Log

    open class Human : Animal, Thinkable {
        // hobbyをという文字列型のメンバ変数を用意し初期化。
        var hobby: String = "Programing"

        // 引数付きコンストラクタ
        constructor(name: String, age: Int): super(name, age) {
        }


        // Animalクラスのメソッドをオーバーライド
        override fun say() {
//
        }
        // thinkableインターフェイスのメソッドをオーバーライド
        override fun think() {
        }
    }