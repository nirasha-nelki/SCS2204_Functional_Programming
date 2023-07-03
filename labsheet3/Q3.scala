object Q3 {
  def calMean(x:Int, y:Int) : Float = {
      var a : Float = x
      var b :Float = y
      var avg: Float = (a+b)/2
    avg
  }
  def main(args: Array[String]): Unit = {
    var avg : Float = calMean(3, 4)
    println("average = %.2f".format(avg))
  }
}
