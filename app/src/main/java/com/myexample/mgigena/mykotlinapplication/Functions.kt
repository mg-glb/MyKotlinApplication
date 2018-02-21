package com.myexample.mgigena.mykotlinapplication

//Top level function
//Top level functions can live outside any class or interface, and can be imported directly to other classes
fun sayMyName(name:String):String{
    return "Hello $name"
}
/**
 * Created by m.gigena on 2/8/2018.
 */
class Functions{
    //Member function
    fun printHello(){
        val message = sayMyName("Maxi")
        println(message)
    }
    //Single line function
    fun sum(a:Int, b:Int) = a + b
}