import scala.io.StdIn.readInt

object Q2 {

  def patternMatch(n: Int) : String = n match {
    case x if x<=0 => "Zero/Negative"
    case x if x%2==0 => "Even"
    case x if x%2==1 => "Odd"
  }

  def main(args: Array[String]): Unit = {
    println("enter an integer : ")
    var n = readInt()

    println(patternMatch(n))
  }
}
