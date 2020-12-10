package start_scala.case_class

object Main {
  def main(args: Array[String]): Unit = {
    val p1 = Point(1,2)
    val p2 = Point(1,2)
    println(p1 == p2)
    println(p1)
  }

}
