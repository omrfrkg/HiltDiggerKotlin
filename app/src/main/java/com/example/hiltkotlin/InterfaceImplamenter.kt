package com.example.hiltkotlin

import javax.inject.Inject

class InterfaceImplamenter
    @Inject constructor()
    : MyInterface {
    override fun myPrintFunction(): String {
        return "My Interface Implementor"
    }
}