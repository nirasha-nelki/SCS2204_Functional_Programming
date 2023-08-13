object Q1 {

//  val calInterest : Int => Double = {
//    case x if x >= 2000000 => x * 6.5 / 100
//    case x if x >= 200000 => x * 3.5 / 100
//    case x if x >= 20000 => x * 4 / 100
//    case x if x >= 0 => x * 2 / 100
//  }

  val calInterest: Int => Double = (value: Int) => value match {
    case x if x >= 2000000 => x * 6.5 / 100
    case x if x >= 200000 => x * 3.5 / 100
    case x if x >= 20000 => x * 4 / 100
    case x if x >= 0 => x * 2 / 100
  }


  def main(args: Array[String]): Unit = {
    println("interest for 1000 = " + calInterest(1000))
    println("interest for 5000 = " + calInterest(5000))
    println("interest for 30000 = " + calInterest(30000))
    println("interest for 120000 = " + calInterest(120000))
  }
}
