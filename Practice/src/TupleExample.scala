
object TupleExample extends App {
  //Eg-1
  var data = (1, "John")
  println(data._1)
  println(data._2)

  //or

  var info = new Tuple2(2, "Alice")
  println(info._1)
  println(info._2)

  //or

  var (id, name) = (3, "Meena")
  println(id)
  println(name)

  //Eg-2

  var planets = List(("Earth", 456.67), ("Mercury", 567.09), ("Neptune", 78.900))
  planets.foreach {
    case ("Earth", distance) => println(s"Eath is $distance miliion kms form us") /*$ is used to fetch that data
                                                                                       and s is used before "" to print that*/
    case ("Mercury", distance) => println(s"Mercury is $distance million kms form us")
    case _ => println("Invalid choice")
  }

  //or
  var information = List((1, "Amey"), (2, "Reshma"))
  information.foreach {
    case (1, name) => println(s"Name of student1 is $name")
    case (2, name) => println(s"Name of student2 is $name")
    case _ => println("Invalid")
  }

  //or
  information.productIterator.foreach {
    //iteration of tuple
    i => println(i)
  }

  //Eg-3

  val myTuple = new Tuple3(1, "Hello", (2, 3))
  println(myTuple._3) //prints (2,3)
  println(myTuple._3._1) //prints 2
  println(myTuple._3._2) //prints 3


}
