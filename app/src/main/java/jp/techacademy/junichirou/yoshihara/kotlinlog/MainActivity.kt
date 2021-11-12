package jp.techacademy.junichirou.yoshihara.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("ひろゆき", 40, "論破")      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
        human.say()
        human.think()

        val human2 = Human("落合陽一", 35, "学生と高級寿司へ行くこと")      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
        human2.say()
        human2.think()
    }
}