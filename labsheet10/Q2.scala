object Q2 {

  def countLetterOccurrences(ar: Array[String]):Int = {
    var ar2 = ar.map(x=> x.length)
    var sum = ar2.reduce((x,y)=>x+y)
    sum
  }

  def main(args: Array[String]): Unit = {
    var fruits = Array("apple", "banana", "cherry", "date")
    println("Total count of letter occurrences: "+countLetterOccurrences(fruits))
  }

}
