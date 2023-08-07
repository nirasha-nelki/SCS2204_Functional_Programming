object Q2 {

  def calculateSquare(l: List[Int]) : List[Int] = {
    var res = l.map((x:Int) => x*x)
    res
  }
  def main(args: Array[String]): Unit = {
    var l = List(1,2,3,4,5)
    println(calculateSquare(l))
  }
}