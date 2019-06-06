import scala.collection.mutable.Map

object MutableMap extends App {

  /*Whenever we import import scala.collection.mutable.Map so we can add/remove Map elements even if they are val variables
 but we can't change its reference by assigning new Map to it*/


  val myMap = Map(1 -> "Tony", 2 -> "Reena", 3 -> "Aditi")
  println(myMap)

  myMap += (4 -> "John") /*even if val is used we can add/remove val value by importing mutable package if immutable package
                               then not allowed*/

 println(myMap)

 //val  myMap=Map(9->"Sony")        //error bcoz val so reference remains same means we can't change its reference



val sample=myMap.toMap            //it converts mutable map into immutable form so can't add/remove elements now
  //sample +=(5-> "Sarita")         //error

}
