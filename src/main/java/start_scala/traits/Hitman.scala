package start_scala.traits

case class Hitman(x:Int) extends Killer {
  override val id: Int = x

  override def resurrect(): Unit = {
    println("No-----NO")
  }
}
