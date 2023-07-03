object Q5 {
  def calTime1(d:Int):Double=d*8
  def calTime2(d:Int):Double=d*7
  def totTime():Double=calTime1(2)+calTime2(3)+calTime1(2)

  def main(args: Array[String]): Unit = {
    println(totTime()+"mins")
  }
}
