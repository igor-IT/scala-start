package start_scala.quoters

import com.github.javafaker.Faker

trait Quoter {
  def sayMassage():Unit
}

case class MessageQuoter(message:String="quoterMessage") extends Quoter {
  override def sayMassage(): Unit = println(message)
}

class ShakespearQ(message:String="quoterSheks") extends Quoter {
  override def sayMassage(): Unit = println(message)
}

object RandomQuoter extends Quoter {
  val faker = new Faker()

  override def sayMassage(): Unit = {
   println(faker.chuckNorris().fact())

  }
}
class QuoterAggregator(quoter:List[Quoter]){
  def sayAll():Unit={
  quoter.foreach(_.sayMassage())
  }
}

