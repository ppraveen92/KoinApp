package com.example.koinapp

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModel

class Student(val course:Course,val friend: Friend) {

    fun beSmart()
    {
        course.study()
        friend.play()
    }
}

class Course
{
    fun study()
    {
        Log.v("studddd","studing")
    }

}

class Friend{
    fun play()
    {
        Log.v("studddd","playing")
    }
}

class MyViewModel(val course:Course,val friend: Friend):ViewModel()
{

    fun performOperation(){
        Log.v("studddd","calee")
    }


}