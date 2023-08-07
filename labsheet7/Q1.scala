object Q1 {

  def filterEvenNumbers(arr: List[Int]) : List[Int] = {
    var res = arr.filter ((x: Int) => (x % 2 == 0))
    res
  }

  def main(args: Array[String]): Unit = {
    var l = List(1,2,3,4,5,6,7,8,9,10)

    println(filterEvenNumbers(l))
  }
}
