object PartialFunction {
  def main(args: Array[String]): Unit = {

    val abill = getbill(20,100,400)
    println(abill)

    val actbill = calculateBill(400)
    println(s"==>$actbill")
  }
  def calculateBill= getbill(20,100,_:Double)

  def getbill(vatPercentage:Int, ServiceTax:Int, netBill:Double):Double={
    netBill*(vatPercentage/100.0)+ServiceTax+netBill;
  }

}
