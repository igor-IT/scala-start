package start_scala.implicits

object VariableExample {
  def printMe(implicit text:String="Hello"):Unit={
    println(text)
  }

}
