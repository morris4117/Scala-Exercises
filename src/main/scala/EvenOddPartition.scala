object EvenOddPartition {
  def main(args: Array[String]): Unit = {

    var myarr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 17, 18, 20)
    var (even, odd) = myarr.partition((p) => {
      if (p % 2 == 0) {
        true
      } else {
        false
      }
    })

      var (even1, odd1) = myarr.partition(_%2==0)
      even1.foreach(print(_))
      println("\n")
      odd1.foreach(print(_))
    }
}
