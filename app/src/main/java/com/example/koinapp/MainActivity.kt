package com.example.koinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.get

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var stu = get<Student>()
        var viewModel = get<MyViewModel>()

        stu.beSmart()

        viewModel.performOperation()


    }


}