class Rational(n:Int, d:Int) {
  require(denominator != 0, "denominator cannot be zero")
  def numerator = n
  def denominator = d

  def sub(r:Rational) = new Rational(this.numerator*r.denominator - this.denominator*r.numerator, this.denominator*r.denominator)
  override def toString(): String = numerator + "/" + denominator // This is the method signature. It states that the method is named toString, takes no arguments, and returns a value of type String.
}


object Q2 {
  def main(args: Array[String]): Unit = {
    val x = new Rational(3,4)
    val y = new Rational(5,8)
    val z = new Rational(2,7)

    val res = x.sub(y).sub(z)

    println(res)
  }
}


