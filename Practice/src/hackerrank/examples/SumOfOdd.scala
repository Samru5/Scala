package hackerrank.examples


object SumOfOdd extends App {
var list=List(3,2,4,6,5,7,8,0,1)
  println(list.filter(_%2!=0).sum)
}
