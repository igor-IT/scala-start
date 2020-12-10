package start_scala.quoters

object Main {
  def main(args: Array[String]): Unit = {
   val agreg = new QuoterAggregator(List(RandomQuoter, new ShakespearQ(),MessageQuoter("bala bla")))

   val sin = Math.sin(130)
    println(sin)
    agreg.sayAll()
  }

}
