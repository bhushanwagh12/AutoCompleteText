package com.example.autocompletetext

import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main2.*
import java.util.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        b1.setOnClickListener {
            nextScreen("en")
        }
        b2.setOnClickListener {
            nextScreen("mr")
        }
        b3.setOnClickListener {
            nextScreen("hi")
        }
    } // onCreate

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    fun nextScreen(lang:String)
    {
        val dm = resources.getDisplayMetrics()
        val conf = resources.getConfiguration()
        conf.setLocale(Locale(lang))
        resources.updateConfiguration(conf, dm)


        var i = Intent(this@Main2Activity,
            MainActivity::class.java)
        startActivity(i)


    }
}
