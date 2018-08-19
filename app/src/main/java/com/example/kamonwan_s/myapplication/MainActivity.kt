package com.example.kamonwan_s.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    private lateinit var mEditText: EditText
    private lateinit var mButton: Button
    private lateinit var mImageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindWidget()
        setEvens()

    }

    private fun setEvens() {
        mButton.setOnClickListener(View.OnClickListener { view ->
            Toast.makeText(applicationContext, "Hi" + mEditText.text,
                    Toast.LENGTH_LONG).show()
            Glide.with(applicationContext).load("https://organicfoodshare.com.au/wp-content/uploads/2016/08/Large-Fruit-Box.jpg").into(mImageView)
            Toast.makeText(applicationContext, JavaClass().showDummy(),
                    Toast.LENGTH_LONG).show()
        })

    }



    private fun bindWidget() {
        mEditText = findViewById(R.id.editText) as EditText
        mButton = findViewById(R.id.button) as Button
        mImageView = findViewById(R.id.imageView) as ImageView
    }
}
