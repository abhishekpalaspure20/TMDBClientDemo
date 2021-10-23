package com.whatsapp.contacts.constructorinjectiondagger

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor() {

    fun getPower()
    {
        Log.i("TAG","Battery Power is Available")
    }
}