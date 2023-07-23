object Q1 {

  // part a
  def createString(c:Char, s2: String): String = s2.concat(c.toString)

  def encrypt(s:String, n:Int): String = {
    var s2 = ""
    for (c <- s){
      if (c.isUpper){
        var x = ((c+n-65)%26+65).toChar
        s2 = createString(x, s2)
      } else {
        var x = ((c+n-97)%26+97).toChar
        s2 = createString(x, s2)
      }
    }
    s2
  }

  def decrypt(s:String, n:Int): String = {
    var s2 = ""
    for (c <- s){
      if (c.isUpper){
        var x = ((c+26-n-65)%26+65).toChar
        s2 = createString(x, s2)
      } else {
        var x = ((c+26-n-97)%26+97).toChar
        s2 = createString(x, s2)
      }
    }
    s2
  }

  // part b
  def caesarCipher(s:String, n:Int, f:(String, Int)=>String):String={
    f(s,n)
    }


  def main(args: Array[String]): Unit = {
    var rawText = "hello world"
    var encryptedText = "dag"
    println(caesarCipher(rawText, 2, encrypt))
    println(caesarCipher(encryptedText, 2, decrypt))
  }
}
