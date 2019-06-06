
object ClassExample extends App {

  class Student(id: Int, name: String)

  var id = 23
  var name = "John"
  println(id + " " + name)

  case class Employee(id: Int = 101, name: String = "Seema", salary: Float = 34000f)

  //case class with default args
  var emp = Employee() //case class allows to call default constructor & only class then not allowed
  println(emp)

  emp = Employee(101) //with emp id we can fetch its data.Hereid is first arg
  println(emp)

  emp = Employee(101, "Seema")
  println(emp)

  var data = List(Employee(103, "Shekhar", 87000f))
  data.foreach { information: Employee => println(information) }
  //datatype is Employee

  //or

  var data1 = List(Employee(104, "Mayur", 49000f))
  data1.foreach { information: Any => println(information) } //datatype is Any


}
