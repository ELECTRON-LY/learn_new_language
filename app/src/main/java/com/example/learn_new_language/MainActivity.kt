package com.example.learn_new_language

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var listofcourses= mutableListOf<Course>(Course("الـتـركـيـة",R.drawable.turkey),Course("الإنـجـليـزيـة",R.drawable.united_kingdom),Course("الـفـرنـسـيـة",R.drawable.france),Course("اليـبـانـيـة",R.drawable.japan),Course("الـروسـيـة",R.drawable.russia))
   var grideView=findViewById<GridView>(R.id.home_grid_view)
        val courseAdapter=CustmGridAdapter(listofcourses,this)

        grideView.adapter=courseAdapter
    }
}