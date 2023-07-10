object Q3 {

  def addition(n:Int):Int= n match {
      case 1 => 1
      case _ => n+addition(n-1)

      //    if (n==1) 1
      //    else n+addition(n-1)
    }

  def main(args: Array[String]): Unit = {
    println(addition(5))
  }
}
