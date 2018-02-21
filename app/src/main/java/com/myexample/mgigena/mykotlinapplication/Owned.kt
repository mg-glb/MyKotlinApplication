package com.myexample.mgigena.mykotlinapplication

/**
 * Example of a Data Class. Data Classes infer equals and hashcode functions automatically.
 */
data class Owned (var userName:String, var displayName: String = DEFAULT_DISPLAY_NAME){
    companion object {
        private const val DEFAULT_DISPLAY_NAME = "No name"
    }
}