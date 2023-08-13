object Q3 {

  val toUpper: String => String = (str:String) => str.toUpperCase()

  val toLower: String => String = (str: String) => str.toLowerCase()

  val formatNames: (String, String => String) => String = (name: String, f: String=>String)  => f(name)

  def main(args: Array[String]): Unit = {

    var name1 = "Benny"
    var name2 = "Niroshan"
    var name3 = "Saman"
    var name4 = "Kumara"

    println(formatNames(name1, toUpper))
    println((formatNames(name2.substring(0, 2), toUpper))+formatNames(name2.substring(2), toLower))
    println(formatNames(name3, toLower))
    println(name4.substring(0, name4.length-1)+formatNames(name4.substring(name4.length-1), toUpper))

  }
}
