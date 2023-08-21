//class Rational(n:Int, d:Int) {
//  require(denominator != 0, "denominator cannot be zero")
//  def numerator = n
//  def denominator = d
//
//  def add(r:Rational) = new Rational(this.numerator*r.denominator + this.denominator*r.numerator, this.denominator*r.denominator)
//  def neg = new Rational(-this.numerator, this.denominator)
//  override def toString(): String = numerator + "/" + denominator // This is the method signature. It states that the method is named toString, takes no arguments, and returns a value of type String.
//}
//
//object Q1 {
//
//  def main(args: Array[String]): Unit = {
//    val obj1 = new Rational(1,2)
//    val obj2 = new Rational(4,5)
//    println(obj1.neg)
//    val q = obj1.add(obj2)
//    println(q)
//  }
//
//
//}
