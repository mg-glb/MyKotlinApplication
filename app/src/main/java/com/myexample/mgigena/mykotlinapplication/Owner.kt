package com.myexample.mgigena.mykotlinapplication

/**
 * Visibility can be public, private, internal and protected.
 * If one does not define a constructor, Kotlin defines one by default.
 */
class Owner constructor(username: String){
    //Companion objects are used as a substitute of static identifiers, to enable constants.
    companion object {
        private const val DEFAULT_DISPLAY_NAME = "No name"
    }

    //Properties
    //var --> mutable
    //val --> read-only
    //Data types can be inferred. So, no need to declare explicit datatypes
    var username: String = username
    var displayName: String = DEFAULT_DISPLAY_NAME
        //This are the getter and setter
        get() = field
        set(value) {field = value}

    init {
        //This is the initialization block
    }

    constructor(username: String,displayName:String):this(username){
        //Secondary constructors must be bound to the primary constructor.
        //The :this() does the delegation from the primary constructor to the other ones.
        this.displayName = displayName
    }
}