package com.example.myapplicationassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        lb.setOnClickListener {
           var lg =  if(us.text.toString().equals("DbitAdmin")
                &&pwd.text.toString().equals("Admin123")) "Login Successful" else "Login Failed"
            Toast.makeText(this,lg,Toast.LENGTH_SHORT).show()
        }
    }
}