import scala.collection.mutable.ArrayBuffer

object ArrayBufferExample {
  def main(args: Array[String]) {
    val arr = new ArrayBuffer[Any]()
    arr += 1 //adds elements
    arr += "John"
    arr +=(2, "Neha", "Harry", 3)
    println(arr)

    arr -= (3) //removes particular element form ArrayBuffer so 3 gets removed
    println(arr)



    val result = Array(1, 3, 4).sum
    println(result)
    val maximum = Array(12, 23, 98).max
    println(maximum)

    val minimum = Array(12, 23, 98).min
    println(minimum)


  }

}
