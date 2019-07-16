
object OptionExample extends App{

  //Option is a container which holds zero or more elements of given type

  //Eg-1
def fraction(numerator:Double,denominator:Double):Option[Double]={
if(denominator==0) None
  else
  Some(numerator/denominator)

}
  println(fraction(22,7))
  println(fraction(22,0))

  println(fraction(22,7).getOrElse("Denominator can't be zero"))
  println(fraction(22,0).getOrElse("Denominator can't be zero"))

  //case match
  fraction(22,0) match{
    case Some(value) => println(value)
    case None =>"Denominator can't be zero"
    case _ =>"Invalid choice"
  }


  //Eg-2
  val testMe:Option[String]=Some("Test me value")
  println(testMe.isDefined)
  println(testMe.isEmpty)

val test:Option[String]=None
  println(test.isDefined)
  println(test.isEmpty)

  //Eg-3
  case class Student(id:Int,name:String,marks:Int,gender:Option[Any])
  val student=Student(1,"John",34,None)
  println(student.gender.getOrElse("Gender not defined"))
  
  //Eg-4
  val students=Map(1->"John",2->"Nidhi")
  println(students.get(2))

  println(check(students.get(2)))

  def check(s:Option[String]) = s match{
    case Some(s) =>s
    case None =>println("Value not found")
   
    //Eg-5
    val some:Option[Int]=Some(12)
  val none:Option[Int]=None

  val x=some.getOrElse("Not correct value of x")
  val y=none.getOrElse("Not correct")
  println(x)
  println(y)
    

  }


}
