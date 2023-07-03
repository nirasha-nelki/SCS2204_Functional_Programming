object Q3 {
  def toUpper(s:String): String = s.toUpperCase

  def toLower(s:String) : String = s.toLowerCase

  def toUpper(s:String, i:Int):String={
    var str = new StringBuilder(s)
    var c = toUpper(s.charAt(i).toString)
    str.deleteCharAt(i)
    str.insert(i, c).toString()
  }

  def formatNames(name:String, f:String=>String):String = f(name)

  def formatNames(name:String, f:(String,Int)=>String, index:Int):String= f(name, index)

  def main(args: Array[String]): Unit = {
    var arr:Array[String] =  Array ("Benny", "Niroshan", "Saman" ,"Kumara" )
    println(formatNames(arr(0), toUpper))
    println(formatNames(arr(1), toUpper, 1))
    println(formatNames(arr(2), toLower))
    println(formatNames(arr(3), toUpper, arr(3).length-1))

  }
}
