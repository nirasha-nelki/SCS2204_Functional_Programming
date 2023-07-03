import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn.{readInt, readLine}

object Q2_2 {

  def checkStrings(arrayBuffer: ArrayBuffer[String]): ArrayBuffer[String] = {
    var l = new ArrayBuffer[String]
    for (element <- arrayBuffer) {
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

      var ar = new ArrayBuffer[String]

      println("Enter the strings:")
      for (i <- 0 until n) {
        s = readLine()
        ar += s
      }

      var ar2: ArrayBuffer[String] = checkStrings(ar)

      println("filtered strings")
      for (x <- ar2) {
        println(x)
      }
    }
  }

