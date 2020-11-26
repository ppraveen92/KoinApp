package com.example.koinapp

import android.util.Log
import androidx.lifecycle.ViewModel

class MyViewModel(val course:Course,val friend: Friend): ViewModel()
{
    fun performOperation(){
        course.study()
        friend.play()
        Log.v("studddd","calee")
    }
}