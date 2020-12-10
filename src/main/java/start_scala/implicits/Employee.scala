package start_scala.implicits

case class Employee(age:Int=0,name:String="Vasya"){
  def print():Unit = println(this)
}
