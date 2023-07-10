object Q2 {
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

  def primeSeq(n:Int): Unit={
      if (n>=2) {
          n match {
            case x if(prime(x)) => {println(x); primeSeq(x-1)}
            case _ => primeSeq(n-1)
          }
      }
  }

  def main(args: Array[String]): Unit = {
    primeSeq(20)
  }
}
