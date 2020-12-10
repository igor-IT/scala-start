package start_scala

case class Person(json:String) {

  def get(json: String, value:String):String = {
    value
  }


  val age = get(json,"age")
  var name = "Misha"
}
