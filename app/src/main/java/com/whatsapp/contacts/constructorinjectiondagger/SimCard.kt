package com.whatsapp.contacts.constructorinjectiondagger

import javax.inject.Inject

class SimCard @Inject constructor(private val serviceProvider: ServiceProvider) {

    fun getConnection()
    {
serviceProvider.getServiceProvider()
    }
}