package com.example.koinapp

import android.util.Log

class Student(val course: Course, val friend: Friend) {
    fun beSmart() {
        course.study()
        friend.play()
    }
}

class Course {
    fun study() {
        Log.v("studddd", "studing")
    }
}

class Friend {
    fun play() {
        Log.v("studddd", "playing")
    }
}

