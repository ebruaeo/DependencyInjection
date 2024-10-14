package com.example.dependencyinjectionusingdagger

import android.util.Log
import javax.inject.Inject

class ClassC @Inject constructor(val classA: ClassA, val classB: ClassB){
    fun startClassC() {
        classA.startClassA()
        classB.startClassB()
        Log.i("TAG", "Class C is created")
    }

}