package com.myexample.mgigena.mykotlinapplication

/**
 * Created by m.gigena on 2/7/2018.
 */
class ObjectDemo {
    fun foo(){
        val owned: Owned = Owned("maxi","Maximiliano Gigena")
        val owned2 = Owned("axel")
        val owned3 = Owned("maxi","Maximiliano Gigena")

        //Check whether owned and owned3 are equal
        if(owned == owned3){
            //Objects have the same data
        }
    }
}