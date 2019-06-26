
//Eg-1
object demo {

  class Sample{
    def solveMeFirst(a:Int,b:Int):Int={

      a+b
    }
  }
  def main(args: Array[String]) {
    val s=new Sample()
    println(s.solveMeFirst(2,3))
    // println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)
  }
}

//Eg-2
object Solution extends App {

  def f(n: Int) {
    (0 until n).foreach( _ => println("Hello World"))
  }

  println("Enter input-")
  var num = scala.io.StdIn.readInt
  f(num)

def swap(x:String,y:String)=(y,x)
  val (a,b)=swap("Hello","World")
  println(a+" "+b)

  var (x,y,z)=(1,2,3)
  println(x,y,z)

  var sum=0
  println("Enter-")
  var i=scala.io.StdIn.readInt()
  while(i <5){
    sum+=i
    i+=1
  }
  println(sum)


}


