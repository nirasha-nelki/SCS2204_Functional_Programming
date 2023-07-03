object Q1 {

  def reverse(s:String): String = {
    var n = s.length
    if (n <= 1){
      s
    } else {
      reverse(s.substring(1))+s.charAt(0)
    }
  }
  def main(args: Array[String]): Unit = {
    println(reverse("heloo"))
  }
}
