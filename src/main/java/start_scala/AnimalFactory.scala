package start_scala

object AnimalFactory {
//  def apply(): Animal = new Dog

  def main(args: Array[String]): Unit = {
  //  AnimalFactory.apply().makeSound()
    val dog = new Dog(11)
    println(dog.age)
  }
}
