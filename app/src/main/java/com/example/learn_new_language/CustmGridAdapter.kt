package com.example.learn_new_language

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustmGridAdapter(private val courceList: List<Course>,private val context: Context):BaseAdapter(){
    private var layoutInflater:LayoutInflater?=null
    private lateinit var courseText:TextView
    private lateinit var courseImage:ImageView

    override fun getCount(): Int {
return courceList.size
    }

    override fun getItem(p0: Int): Any? {
return null
    }

    override fun getItemId(p0: Int): Long {
return 0
    }

    override fun getView(p0: Int, convertView: View?, p2: ViewGroup?): View {
var convertView= convertView
    if (layoutInflater==null){
        layoutInflater=context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater
    }
        if (convertView==null){
            convertView=layoutInflater!!.inflate(R.layout.grid_viewi_tem,null)
        }
        courseText=convertView!!.findViewById(R.id.langugh_text)
        courseImage=convertView!!.findViewById(R.id.image_View)
        courseText.setText(courceList[p0].name)
        courseImage.setImageResource(courceList[p0].image)

        return convertView
    }


}