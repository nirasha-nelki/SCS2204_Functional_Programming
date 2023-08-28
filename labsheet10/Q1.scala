object Q1 {

  def calculateAverage(ar: Array[Int]) : Int = {
    var l = ar.length
    var ar2 = ar.map(x => (x*9/5)+32)
    var sum = ar2.reduce((x,y) => x+y)
    var avg = sum/l
    avg
  }

  def main(args: Array[String]) = {
    var temp = Array(0, 10, 20, 30)

    println("Average Fahrenheit temperature: "+ calculateAverage(temp))


  }

}
