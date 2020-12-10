package start_scala.traits

trait Killer {
  val id:Int
  def killAll(): Unit = println("KILLING ....")
  def resurrect():Unit

}
