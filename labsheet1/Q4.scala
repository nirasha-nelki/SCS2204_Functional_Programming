object Q4 {

  def calDiscount(coverPrice: Double):Double={
    coverPrice*60/100
  }
  def calShippingCost(coverPrice: Double, num:Int):Double={
    var price = calDiscount(coverPrice)

    if (num<=50){
      (price+3)*50
    }
    else{
      (price+3)*50+(price+0.75)*(num-50)
    }
  }

  def main(args: Array[String]): Unit = {
    println(calShippingCost(24.95,60))
  }
}
