object Q3 {

  def isPrime(n: Int, i: Int = 2): Boolean = {
    if (n <= 2)
      return n == 2
    if (n % i == 0)
      return false
    if (i * i > n)
      return true

    isPrime(n, i + 1)
  }

  def filterPrime(l: List[Int]) : List[Int] = {
      var res = l.filter((x: Int) => isPrime(x))
      res
  }
  def main(args: Array[String]): Unit = {
    var l = List(1,2,3,4,5,6,7,8,9,10)

    println(filterPrime(l))


  }
}
