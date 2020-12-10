package start_scala

class Dog(var age:Int) extends Animal {
  override def makeSound(): Unit = {
    println("GAV - GAV"+age)
  }
  object Dog{
    def apply(age:Int): Dog = new Dog(age)
  }
}
