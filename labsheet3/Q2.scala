import scala.collection.mutable.ListBuffer
import scala.io.StdIn.{readInt, readLine}

object Q2 {

  def checkStrings(listbuffer: ListBuffer[String]): ListBuffer[String] = {
    var l = new ListBuffer[String]
    for (element <- listbuffer) {
      if (element.length >= 5) {
        l += element
      }
    }
    l
  }
    def main(args: Array[String]): Unit = {
      var s: String = ""

      print("Enter the number of strings that you want to input: ")
      var n = readInt()

      var ar = new ListBuffer[String]

      println("Enter the strings:")
      for (i <- 0 until n) {
        s = readLine()
        ar += s
      }

      var ar2: ListBuffer[String] = checkStrings(ar)

      println("filtered strings")
      for (x <- ar2) {
        println(x)
      }
    }
  }

