package com.example.readlog.navigation

import java.lang.IllegalArgumentException

enum class Screens {
    SplashScreen,
    LoginScreen,
    CreateAccountScreen,
    HomeScreen;
    companion object{
        fun fromRoute(route:String?) : Screens
        = when(route?.substringBefore("/")){
            SplashScreen.name -> SplashScreen
            LoginScreen.name -> LoginScreen
            CreateAccountScreen.name -> CreateAccountScreen
            HomeScreen.name -> HomeScreen
            else -> throw IllegalArgumentException("Route $route is not recognized")
        }
    }
}
