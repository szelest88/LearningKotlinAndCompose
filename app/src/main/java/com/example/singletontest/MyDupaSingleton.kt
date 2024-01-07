package com.example.singletontest

import android.util.Log

object MyDupaSingleton {
    init {
        Log.d("dupatag", "initialized")
    }

    fun printDupa() {
        Log.d("dupatag", "dupa" + zupa)
    }

    var zupa = 0
}