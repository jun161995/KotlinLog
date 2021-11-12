package jp.techacademy.junichirou.yoshihara.kotlinlog

import android.util.Log

open class Human: Animal, Thinkable {
    // 引数付きコンストラクタ
    var hobby: String
    constructor(name: String, age: Int, hobby: String): super(name, age) {
        this.hobby = hobby}    init {
        // 処理
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }

    // Thinkableインターフェイスのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest", "私は" + this.hobby + "について考える。")
    }
}