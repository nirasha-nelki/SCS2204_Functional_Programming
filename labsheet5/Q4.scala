object Q4 {

  def isEven(n:Int): Boolean = n match {
    case 0 => true
    case _ => isOdd(n-1)
  }

  def isOdd(n: Int): Boolean = !isEven(n)

  def checkEvenOdd(n:Boolean):String={
    if (n) "even"
    else "odd"
  }

  def main(args: Array[String]): Unit = {
      println("%d is %s".format(4, checkEvenOdd(isEven(4))))
      println("%d is %s".format(5, checkEvenOdd(isEven(5))))
  }
}
