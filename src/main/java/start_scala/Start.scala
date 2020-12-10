package start_scala

import java.util.Random

object Start {
  def printName():Unit = println("Name")

  def main(args: Array[String]): Unit = {
//   val person = new Person(13)
//    println(person)
//    println("Hello World")
//    var s = ""
//    s.exists(_.isDigit)
//    val random = new Random()
//    val i = random.nextInt(100)

var list:List[String] = Nil
   list = "Java"::"Hello"::list
    println(list)
  }

}
