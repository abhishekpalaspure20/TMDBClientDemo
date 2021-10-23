package com.whatsapp.contacts.constructorinjectiondagger

import dagger.Component
import dagger.Module

@Component(modules = [MemoryCardModule::class])
interface SmartPhoneComponent {

    fun getSmartPhone():SmartPhone
}