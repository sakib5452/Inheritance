import Inheritance.Fruit

class Banana(
    name:String,
    color:String,
    weight:Double,
    var size:Double
):Fruit(
    name,
    color,
    weight
) {

}