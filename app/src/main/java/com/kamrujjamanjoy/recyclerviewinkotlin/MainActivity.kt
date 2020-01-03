package com.kamrujjamanjoy.recyclerviewinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setRecyclerView()
    }

    private fun setRecyclerView() {
//        val layoutManager = LinearLayoutManager(this)
//        layoutManager.orientation = LinearLayoutManager.VERTICAL
        customRecyclerView.layoutManager = LinearLayoutManager(this)
//        val adapter = MyAdapter(this,Hobby.Supplier.hobbies)
        customRecyclerView.adapter = MyAdapter(this,Hobby.Supplier.hobbies)
    }
}
