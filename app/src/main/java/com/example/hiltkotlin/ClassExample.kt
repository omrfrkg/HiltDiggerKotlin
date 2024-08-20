package com.example.hiltkotlin

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample
@Inject constructor(@FirstImplamentor private val  interfaceImplamenter: MyInterface,
                    private val gson : Gson,
                    @SecondImplamentor private val secondInterfaceImplementor: MyInterface){
    fun myFunction() : String{
        return "working : ${interfaceImplamenter.myPrintFunction()}"
    }

    fun secondFunction() : String{
        return "Working : ${secondInterfaceImplementor.myPrintFunction()}"
    }
}