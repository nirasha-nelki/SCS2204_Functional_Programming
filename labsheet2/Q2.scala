object Q2{


  def main(args: Array[String]): Unit = {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var k = 4.3f


    println("(- -b * a + c *d - -) = " +({
      b -= 1;
      b
      } * a+c * {
      d -= 1;
      d + 1
      }))   // 24

      println("a++ = " + {a += 1; a - 1}) // 2

      println ("(–2)*(d–k)+c = %f".format(-2 * (d - k) + c) ) // 4.600000

      println ("c=c++ = " + {c+=1; c-1}) //  4

      println ("c=++c*a++ = " + {c+=1; c}*{a+=1; a-1}) //  18
  }


}
