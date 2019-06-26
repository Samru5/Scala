//Eg-1
trait Printable {
  def printMessage()        //abstract method
}

class Page extends Printable {
  def printMessage() {                    //implementing abstract method
    println("Welcome to drawing competition!")
  }
}

object TraitExample extends App {
  var page = new Page()
  page.printMessage()
}

//Eg-2:Implementing Multiple Traits in a Class

trait Runnable {
  def run()
}

trait Features {
  def color()
}

class Bike extends Runnable with Features {       //Use with to extend multiple traits

  def run() {                                       //implementing abstract method
    println("Bike is running!")
  }

  def color() {                                     //implementing abstract method
    println("Bike color is Red ")
  }
}

object Demo extends App {
  var bike = new Bike()
  bike.run()
  bike.color()
}

//Eg-3:Trait having abstract and non-abstract methods
trait Details {

  def myDetails()                     //abstract method

  def location() {                    //non-abstract method
    println("Location is Mumbai")
  }
}

class Manager extends Details {
  def myDetails {
    println("Name of employee is John")
  }
}

object MyDemo extends App {
  var manager = new Manager()
  manager.myDetails()
  manager.location()
}

//Eg-4:Mixins Order Maintained
trait MyVehicle {
  def run()
}

abstract class FourWheeler {
  def numberOfWheels()
}

class MyCar extends FourWheeler with MyVehicle {   //always extend abstract class first followed by multiple traits seperated using with
  def run() {
    println("My car is running now")

  }

  def numberOfWheels() {
    println("Car has 4 wheels")
  }
}

object Sample extends App {
  var car = new MyCar()
  car.numberOfWheels()
  car.run()

}

//Eg-5
trait Vehicle1{
  def run(){
    println("Vehicle is running")
  }
}
trait Bike1{
  def run(){
    println("Bike is running")
  }
}

class MyBike1 {

  def print{
    ("It is my bike")
  }

}

object NewDemo extends App{
  var b1=new MyBike1 with Vehicle1
  b1.run()
  var b2=new MyBike1 with Bike1
  b2.run()

}