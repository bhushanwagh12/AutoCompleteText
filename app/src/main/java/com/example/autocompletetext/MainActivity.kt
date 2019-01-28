package com.example.autocompletetext

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



         var values=resources.getStringArray(R.array.countries)
        var myadapter=ArrayAdapter<String>(this,R.layout.indiitem,values)
        actv.setAdapter(myadapter)



    }


}
