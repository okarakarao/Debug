package jp.techacademy.tomoyuki.sugiyama.debug

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<String>()
        list.add("おはようございます！")
        list.add("こんにちは！")

        for(i in list.indices){
            Log.d("ANDROID","list[$i]=${list[i]}")
        }

        textView.text = list[2]
    }
}
