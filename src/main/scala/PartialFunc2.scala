object PartialFunc2 {
    def main(args: Array[String]): Unit = {
      var myarr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
      var myarr2 = myarr.map((x) => {
        x * 2
      })
      var myarr3 = myarr.map(_ * 2)
      myarr2.foreach(print(_) + ",")
      println("\n")
      myarr3.foreach(println(_))
    }
}
