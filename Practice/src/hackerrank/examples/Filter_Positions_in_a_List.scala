package hackerrank.examples

object Filter_Positions_in_a_List extends App{
var array=new Array[Int](8)
  array=Array(2,5,3,4,6,7,9,8)
var length=array.length
 // for(i <- length)
    if(array(i)%2!=0)
println(array(i))

//  for(j<-array[i])
//    if(j %2!=0)
     // println(array[i])
 // list.foreach(x => println(list.filter(_%2!=0)))
  //println(list.filter(_%2!=0).map(_))
}
