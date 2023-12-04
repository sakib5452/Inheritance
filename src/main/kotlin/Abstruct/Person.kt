package Abstruct

abstract class Person(var name:String) {
    fun display(name:String){
        println(name)
    }

    abstract fun personJob()
}