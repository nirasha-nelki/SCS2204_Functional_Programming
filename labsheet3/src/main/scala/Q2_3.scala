import scala.io.StdIn.{readInt, readLine}

object Q2_3 {

  def filterStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {
    print("Enter the number of strings that you want to input: ")
    val n = readInt()

    var strings: List[String] = List()

    println("Enter the strings:")
    for (i <- 0 until n) {
      val s = readLine()
      strings = strings :+ s
    }

    val filteredStrings: List[String] = filterStrings(strings)

    println("Filtered strings:")
    for (x <- filteredStrings){
      println(x)
    }
  }
}
