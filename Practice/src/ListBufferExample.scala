import scala.collection.mutable.ListBuffer

object ListBufferExample extends App {
  val listBuffer = ListBuffer("Java", "Scala", 1, "HTML", 2)
  listBuffer += ("Ruby")        //adds element to ListBuffer
  println(listBuffer)

  listBuffer +=("C", "C++")
  println(listBuffer)

  listBuffer.foreach {
    i => println(i)
  }

  //or
  listBuffer.foreach(println)

  val myList = listBuffer.toList //converts ListBuffer to List
  println(myList)


}
