
object IteratorExample extends App {

  var cars = Iterator("Nexon", "Audi", "Santro")

  while (cars.hasNext) {
    println(cars.next())
  }

}
