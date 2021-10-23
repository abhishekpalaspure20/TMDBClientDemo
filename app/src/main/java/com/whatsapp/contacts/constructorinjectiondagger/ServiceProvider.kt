package com.whatsapp.contacts.constructorinjectiondagger

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor() {

    fun getServiceProvider()
    {
        Log.i("TAG","Service Provider Connected")
    }
}