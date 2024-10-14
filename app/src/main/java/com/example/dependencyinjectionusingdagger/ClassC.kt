package com.example.dependencyinjectionusingdagger

import android.util.Log

class ClassC {
    lateinit var classA : ClassA
    lateinit var classB : ClassB

    fun startClassC() {
        classA.startClassA()
        classB.startClassB()
        Log.i("TAG", "Class C is created")
    }

}