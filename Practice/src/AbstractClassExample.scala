//Eg-1
abstract class Vehicle {
  def run()                 //abstract method
}

class Car extends Vehicle {
  def run() {
    println("Car is running!")          //implementing abstract method
  }
}

object AbstractClassExample extends App {

  var car = new Car()
  car.run()
}



//--------Eg-2------------
abstract class Employee(message:String){
  var msg1="Hello"
  var msg2="Hi"

  def printMessage()                        //abstract method
}

class Managaer(message:String) extends Employee(message){

  def printMessage() {                          //implementing abstract method
    println(msg1)
    println(msg2)
    println(message)
  }

}

object newDemo extends App{
  var manager=new Managaer("I am manager")
  manager.printMessage()
}