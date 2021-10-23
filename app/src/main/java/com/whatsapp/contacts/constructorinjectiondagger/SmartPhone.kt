package com.whatsapp.contacts.constructorinjectiondagger

import android.util.Log
import javax.inject.Inject

class SmartPhone @Inject constructor(val battery: Battery,val simCard: SimCard, val memoryCard: MemoryCard) {

  init {
      battery.getPower()
      simCard.getConnection()
      memoryCard.getSpaceAvailaibility()
  }

    fun makeCallWithRecording()
    {
        Log.i("TAG","Calling.....")
    }
}