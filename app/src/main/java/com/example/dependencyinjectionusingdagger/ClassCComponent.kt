package com.example.dependencyinjectionusingdagger

import dagger.Component

@Component(modules = [ClassABModule::class])
interface ClassCComponent {
    fun getClassCInstance(): ClassC
}