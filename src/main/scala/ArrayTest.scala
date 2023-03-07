object ArrayTest {
  def main(args: Array[String]): Unit = {
    var v = Array(1,2,3,4,5,6,7,8,9)
    //Annonymus Fuction
    v.foreach(n=> {
      if (n ==5) {
        println("Five")
      } else {
        println(n)
      }
    })

    //Another type of for statement
    v.foreach(n=>println(n))

    v.foreach(println(_)) //Place Holder Notation
  }

}

