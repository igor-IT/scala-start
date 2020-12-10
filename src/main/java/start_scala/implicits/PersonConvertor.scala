package start_scala.implicits

object PersonConvertor {
  implicit def ageToEmployee(age:Int):Employee ={
    Employee(age = age)
  }
  implicit def nameToEmployee(name:String):Employee ={
    Employee(name = name)
  }


}
