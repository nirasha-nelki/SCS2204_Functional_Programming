object Q3{
  var tax : Double = 12/100

  def normalSal(workHours : Int):Int = 250* workHours

  def OTSal(ot: Int) : Int = 85*ot

  def sal(workHours : Int, ot: Int): Int = normalSal(workHours) + OTSal(ot)

  def takeHomeSal(workHours : Int, ot: Int): Double = {
    var salary = sal(workHours, ot)
    var totSal = salary - salary*tax
    totSal
  }
  def main(args: Array[String]): Unit = {
      println("take home salary weekly= "+takeHomeSal(40, 30))
  }
}
