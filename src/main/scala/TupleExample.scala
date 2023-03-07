object TupleExample {
  def main(args: Array[String]): Unit = {
    var myTuple = (1, 2, 3l, 4.5, "test")
    var myTuple2 = new Tuple5(1, 2.0, 3l, 4.1, "test")
    var myTuple3 = new Tuple6(1, 2.0, 3l, 4.5, "test", (2, 3))
    var myTuple6 = Tuple6(1, 2.0, 3l, 4.5, "test", (2, 3))

    println(myTuple._1)
    println(myTuple3._6._1)
    println(" ")

    myTuple.productIterator.foreach((x)=>{
      println(x)
    })
    println(" ")
    myTuple2.productIterator.foreach((x)=>println(x))
    println(" ")
    myTuple3.productIterator.foreach(println(_))
    println(" ")

    var myTuple4 = ("a"->"b")
    println(myTuple4)
    println(" ")

    var (z,i) = myTuple4
    println(z)
    println(i)
  }
}
