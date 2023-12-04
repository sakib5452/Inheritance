fun main(args: Array<String>) {
var mango = Mango(
    "guti",
    "green",
    1.00

)

    var banana = Banana(
        "sagor",
        "yello",
        0.50,
        0.4
    )
println("Mango: ${mango.name} ${mango.color} ${mango.weight}" )
    println("Name: ${banana.name} Color: ${banana.color} Weight: ${banana.weight}  Size: ${banana.size}")

}