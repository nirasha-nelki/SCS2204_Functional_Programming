object Q5 {

  def isEven(n:Int): Boolean = n match {
    case 0 => true
    case _ => isOdd(n-1)
  }

  def isOdd(n: Int): Boolean = !isEven(n)

  def sumEven(n:Int):Int= n match {
      case 0 => 0
      case x if(isEven(x)) => x+sumEven(x-1)
      case _ => sumEven(n-1)
    }

  def main(args: Array[String]): Unit = {
    println(sumEven(10))

  }
}
