package com.myexample.mgigena.mykotlinapplication

/**
 * Created by m.gigena on 2/14/2018.
 */
class Collections {
    //Mutable vs immutable collections
    //LISTS
    //=====
    //1-Create an immutable list of strings
    val names = listOf<String>("Lucas","Matias","Dani")

    fun printImmutableListOfNames() {
        for (name in names) {
            println(name)
        }
    }

    fun printMutableListOfNames() {
        val mutableNames1 = names.toMutableList()
        mutableNames1.add("Andres")
        println(mutableNames1)
    }

    fun mutableExamples() {
        //A mutable list of String
        val mutableListNames: MutableList<String> = mutableListOf<String>("Juan","Pedro")
        mutableListNames.add("Maria")
        mutableListNames.removeAt(1)
        mutableListNames[0]="Mario"
        print(mutableListNames) //Will print Mario Maria

        val mutableListMixed = mutableListOf("Audi","Toyota",1,2,3,'a')
    }

    //Immutable empty list of String
    val emptyList: List<String> = emptyList<String>()
    //Other functions are listOfNotNull() and arrayList() Look them up!

    //SETS
    //====
    //2-Creates an immutable set of mixed types.
    val mixedTypesSet = setOf(2,4,254, "how","far", 'c')
    var intSet: Set<Int> = setOf(1,2,3)

    fun mutableSet(){
        //Creates a mutable set of int types only
        val intsMutableSet: MutableSet<Int> = mutableSetOf(3,5,6,2,0)
        intsMutableSet.add(8)
        intsMutableSet.remove(3)
    }

    fun mutableHashSet() {
        //Creates a mutable hash set of int types only
        val intsHashSet: java.util.HashSet<Int> = hashSetOf(1,2,6,3)
        intsHashSet.add(5)
        intsHashSet.remove(1)
    }

    //Other functions sortedSetOf(), linkedSetOf()

    //MAPS
    //====
    fun immutableMap() {
        val callingCodesMap: Map<Int,String> = mapOf(54 to "Argentina", 1 to "USA")
        for ((key,value) in callingCodesMap){
            println("$key is the calling code of $value")
        }
    }

    fun mutableMap() {
        val currenciesMutableMap: MutableMap<String, String> = mutableMapOf("Pesos" to "Argentina", "Dollars" to "USA","Pounds" to "UK")
        println("Countries are ${currenciesMutableMap.values}")
        println("Currencies are ${currenciesMutableMap.keys}")
        currenciesMutableMap.put("Reals","Brazil")
        currenciesMutableMap.remove("Dollars")

        println(currenciesMutableMap.get("Pesos"))
        println(currenciesMutableMap["Reals"])
    }

    fun mutableHashMap() {
        val personsHashMap: java.util.HashMap<Int, String> = hashMapOf(1 to "Ana", 2 to "Maria", 3 to "Eugenia")
        personsHashMap.put(4,"Julia")
        personsHashMap.remove(2)
        println(personsHashMap[1])
    }

    //Other functions sortedMapOf(), linkedHashMap()

    //COLLECTION OPERATION FUNCTIONS
    //==============================
    fun collectionFunctions() {
        val stringList: List<String> = listOf("in", "the", "club")
        println(stringList.first()) //in
        println(stringList.last())//club

        val intSet: Set<Int> = setOf(3,5,6,6,6,3)
        println(intSet.first())//3
        println(intSet.last())//6

        //Chaining functions
        stringList.subList(0,1).last()

        //Other functions max(), average(), plus(), minus()
    }
}