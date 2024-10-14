package com.example.dependencyinjectionusingdagger

import android.util.Log

class ClassC {
    private val classA = ClassA()
    private val classB = ClassB()

    fun startClassC() {
        classA.startClassA()
        classB.startClassB()
        Log.i("TAG", "Class C is created")
    }
}