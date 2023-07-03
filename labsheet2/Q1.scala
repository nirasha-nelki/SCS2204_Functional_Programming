object Q1{

  def main(args: Array[String]): Unit = {
    var k,i,j = 2
    var m, n  = 5
    var f = 12.0f
    var g = 4.0f
    var c = 'X'

    println("k+12*m = " + (k+12*m)) // 62
    println("k+12*m = " + (m/j)) // 2
    println("n%j = " + (n%j)) // 1
    println("n%j = " + (m/j*j)) // 4
    println("f+10*5+g = " + (f+10*5+g)) // 66.0
    println("++i*n = " + (i+1)*n) // 15
  }
}
