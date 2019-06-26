package hackerrank.examples


object MessageTimes extends App {
  def printMsg(n: Int) {

    (1 to n).foreach(_ =>println("Hello World"))
  }

  println("Enter number of times you want to print message-")
  var n = scala.io.StdIn.readInt()

  printMsg(5)

}
