package com.myexample.mgigena.mykotlinapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "Demo"
        private const val GUITAR = "Guitar"
        private const val PIANO = "Piano"
        private const val DRUMS = "Drums"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        texty.text = "Hey"
        //NULL HANDLING
        //=============
        //Create a null owner reference
        var owner : Owner? = null

        //1-Null conditions
        //If Statement
        var username : String? = null
        if(owner != null){
            username = owner.username
        }
        //If expression
        val username2 = if(owner != null) owner.username else "No username"

        //2-Safe Call ?.
        //This operator returns a string if owner!=null, and null if owner is null
        val username3 = owner?.username

        //3-Elvis expression ?:
        val username4 = owner?.username ?: "No username"

        //4-Handle Exceptions
        try {
            val username5 = owner!!.username
        } catch (e: Exception) {
            //Show alert!
        }

        //IF HANDLING
        //===========
        //1-If Statements
        val a = 10
        val b = 20
        var c = a

        if(a<b){
            c = b
        }

        var d = 0

        if(a>b) {
            d = a
        }else{
            d = b
        }

        //2-If Expressions
        val e = baz(a,b)

        //WHEN HANDLING
        //=============
        val instrument = "Guitar"
        when(instrument){
            GUITAR -> Log.i(TAG,"This is a guitar!")
            DRUMS -> Log.i(TAG,"This is a set of drums!")
            else -> Log.i(TAG,"I'm playing an unknown instrument!")
        }
        val type = when(instrument){
            GUITAR,PIANO -> "string instrument"
            DRUMS -> "percussion instrument"
            else -> "unknown instrument"
        }

        //LOOP HANDLING
        //=============
        //For Loops
        for(i in 0 until 10){
            //Do something
        }
        for(i in 0..9){
            //Do something else
        }
        for(i in 9 downTo 0){
            //Go decreasing
        }

        for(i in 1..10 step 2){
            //Go through 1,3,5,7 and 9
        }

        val owners = listOf<Owner>()
        for(owner in owners){
            Log.i(TAG,"Owner: ${owner.username}")
        }
        for(index in owners.indices){
            Log.i(TAG,"Pos: $index Owner: ${owners[index].username}")
        }
        for((index,owner) in owners.withIndex()){
            Log.i(TAG,"Pos: $index Owner: ${owner.username}")
        }
        //While Loops
        var i=0
        while(i<10){
            i++
        }
        println(i)

        do{
            val value=0
        }while (value>0)
    }

    fun bar(data: Any){
        //Avoid ClassCastException
        val text : String? = data as? String
        when(data){
            is String -> Log.i(TAG,"data is a String")
            is Int -> Log.i(TAG,"data is an Int")
            is Owner -> Log.i(TAG,"data is Owner: $data.username")
        }
    }

    fun foo(data:String?){
        //Handle exception here
    }
    private fun baz(a:Int,b:Int) = if(a>b) a else b
}
