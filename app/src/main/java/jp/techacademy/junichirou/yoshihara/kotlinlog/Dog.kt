package jp.techacademy.junichirou.yoshihara.kotlinlog
import android.util.Log

class Dog {
    // プロパティ
    var name: String
    var age: Int

    // コンストラクタ
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    // メソッド
    fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }
}