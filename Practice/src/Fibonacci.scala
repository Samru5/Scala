
object Fibonacci extends App {
  var f1 = 0
  var f2 = 1

  println("Numbers for which fibonacci to find-")
  var n = scala.io.StdIn.readInt()

  for (i <- 0 to n) {
    var fibo = f1 + f2
    print(f1+"\t")
    f1 = f2
    f2 = fibo

  }




}