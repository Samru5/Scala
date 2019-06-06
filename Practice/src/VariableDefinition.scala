
object VariableDefinition extends App {

  val i = 4 //val so acts as constant
  println(i)

  //i=5                       //error bcoz val is immutable.
  val result = i + 8
  println(result)

  val result1 = i.+(22)
  val result2 = result1 + 4
  println(result1)
  println(result2)

  var j = 9
  j = 2
  println(j)

  var str: String = "Hello"
  println(str)

  //str=9                         //error bcoz Scala is typesafe so once datatype is assigned it can't be change.Only String can be added


}
