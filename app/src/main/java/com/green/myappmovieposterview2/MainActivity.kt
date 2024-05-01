package com.green.myappmovieposterview2

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Gallery
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var gallery = findViewById<Gallery>(R.id.gallery1)
        var galAdapter = MyGalleryAdapter(this)
        gallery.adapter = galAdapter


    }

    inner class MyGalleryAdapter(var context: Context) : BaseAdapter() {
        var posterID = arrayOf(
            R.drawable.mov01, R.drawable.mov02, R.drawable.mov03, R.drawable.mov04,
            R.drawable.mov05, R.drawable.mov06, R.drawable.mov07, R.drawable.mov08,
            R.drawable.mov09, R.drawable.mov10
        )

        var posterTitle = arrayOf("Inside Out", "주먹왕 랄프", "웡카", "엘리멘탈", "토이스토리", "코코", "업(UP)", "루카", "니모를 찾아서", "라이온킹",
            "Inside Out", "주먹왕 랄프", "웡카", "엘리멘탈", "토이스토리", "코코", "업(UP)", "루카", "니모를 찾아서", "라이온킹",
            "Inside Out", "주먹왕 랄프", "웡카", "엘리멘탈", "토이스토리", "코코", "업(UP)", "루카", "니모를 찾아서", "라이온킹")

        override fun getCount(): Int {
            return posterID.size
        }

        override fun getItem(position: Int): Any {
            return 0
        }

        override fun getItemId(position: Int): Long {
            return 0
        }

        override fun getView(p0: Int, p2: View?, p3: ViewGroup?): View {
            var imageview = ImageView(context)
            imageview.layoutParams = Gallery.LayoutParams(200, 300)
            imageview.scaleType = ImageView.ScaleType.FIT_CENTER
            imageview.setPadding(5, 5, 5, 5)
            imageview.setImageResource(posterID[p0])

            imageview.setOnTouchListener { v, event ->
                var ivPoster = findViewById<ImageView>(R.id.ivPoster)
                ivPoster.scaleType = ImageView.ScaleType.FIT_CENTER
                ivPoster.setImageResource(posterID[p0])
                false
            }

            return imageview
        }

    }

}