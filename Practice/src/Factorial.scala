
object Factorial extends App {
  var fact = 1

  println("Enter number to find its factorial-")
  var num = scala.io.StdIn.readInt()

  for (i <- 1 to num) {
    fact = fact * i

  }
  println(s"Factorial of $num is $fact")

}


//for 1 to 5 factorials
object FactorialDemo extends App {
  var fact = 1
  println("Factorial of 1 to 5 are-")
  for (j <- 1 to 5) {
    fact = fact * j
    println(fact)
  }
}