package hackerrank.examples


object UpdateList extends App{
def f(arr:List[Int]):List[Int]=arr

  var list=List(2,-4,3, -1, 23,-4, -54)

  val input=list.filter(_ < 0).map(_.abs)
  println(f(input))
}
