object Q4 {


  def attendees(price: Int):Int = 120 + (15-price)/5*20

  def attendanceCost(price: Int): Int = attendees(price)*3

  def totCost(price:Int) : Int = (500 + attendanceCost(price))

  def income(price:Int): Int = price*attendees(price)

  def calProfit(price: Int) : Int = (income(price) - totCost(price))

  def calBestPrice(): Int ={
    var bestPrice : Int = 0
    var bestProfit : Int = 0
    for (i<-5 until(40, 5)){
      var profit = calProfit(i)
      if (profit >= bestProfit){
        bestProfit = profit
        bestPrice = i
      }
    }
    bestPrice
  }

  def main(args: Array[String]): Unit = {
    println("the best ticket price is " + calBestPrice())
  }
}

