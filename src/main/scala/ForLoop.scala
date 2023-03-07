object ForLoop {
  def main(args: Array[String]): Unit = {
    //JUST PRINT 1 TO 10
    /*for (i <- 1 to 10) {
      print(i +" ")
    }
    println( )
    // PRINTS 1 TO 9 NOT 10 BECAUSE UNTIL IS USED
    for (j <- 1 to 10) {
      print(j+" ")
    }
    println( )
    //we can give if loop inside a for loop
    for (k <- 1 to 10 if k % 2 == 0) {
      println(k)
    }
    println( )
    //seperating by 2 values
    for (l <- 1 to 10 by 2) {
      println(l)
    }
    println( )
    //seperating by -2 values
    for (m <- 10 to -3 by -2) {
      println(m)
    }
    println( )*/

    for (n <- 10 to 1 if n % 2 == 0) {
      println(n)
    }
  }
}
