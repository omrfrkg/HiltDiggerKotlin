package com.example.hiltkotlin

import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

interface MyInterface {

    fun myPrintFunction() : String
}
/*

                                            YÖNEM - 1

@InstallIn(ActivityComponent::class)
@Module
abstract class MyModule{
    @ActivityScoped
    @Binds
    abstract fun bindingFunction(myImplamenter : InterfaceImplamenter ) : MyInterface
}

 */

@InstallIn(SingletonComponent::class)
@Module
class MyModule{
    @FirstImplamentor //Annot için
    @Singleton
    @Provides
    fun providerFunction() : MyInterface{
        return InterfaceImplamenter()
    }

    @SecondImplamentor //Annot için
    @Singleton
    @Provides
    fun secondProviderFunction() : MyInterface{
        return SecondInterfaceImplementor()
    }

    @Singleton
    @Provides
    fun gsonProviderFunction() : Gson{
        return Gson()
    }
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplamentor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplamentor

