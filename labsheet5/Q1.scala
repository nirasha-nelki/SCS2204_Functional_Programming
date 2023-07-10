//The greatest common divisor (GCD) of all prime numbers is 1.

object Q1 {

  def GCD(a:Int, b:Int): Int= b match {
    case 0 => a
    case x if (x>a) =>  GCD(x, a)
    case x => GCD(x, a%x)
  }

  def prime(p:Int, n:Int = 2):Boolean = n match {
    case x if (x==p) => true
    case x if (GCD(p, x)>1) => false
    case x =>prime(p, x+1)
  }

  def checkPrime(n: Boolean): String = {
    if (n) "True" else "False"
  }
  def main(args: Array[String]): Unit = {
    var res :   Boolean = prime(5)
    println(checkPrime(res))

    res = prime(8)
    println(checkPrime(res))
  }
}


