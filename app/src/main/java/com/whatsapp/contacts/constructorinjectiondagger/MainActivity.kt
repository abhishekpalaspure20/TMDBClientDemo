package com.whatsapp.contacts.constructorinjectiondagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var smartPhone: SmartPhone
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerSmartPhoneComponent.create()
                .getSmartPhone()
                .makeCallWithRecording()

//        val smartphone = SmartPhone(Battery(), SimCard(ServiceProvider()), MemoryCard())  ----- > This is not the best practice so we have dagger dependcy injection
//        smartphone.makeCallWithRecording()
    }
}