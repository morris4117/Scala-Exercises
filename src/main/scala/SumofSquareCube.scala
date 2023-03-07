object SumofSquareCube {
    def sumofSC(a: Int, b: Int, func: (Int) => Int): Int = func(a) + func(b)

    def main(args: Array[String]): Unit = {
      var sq = sumofSC(10, 20, square)
      var cb = sumofSC(10, 20, cube)
//      (x:Int)=>x*x*x*x) Using Anonymus Function in a variable itself
      var c3 = sumofSC(10, 20, (x:Int)=>x*x*x*x)
      println(sq)
      println(cb)
      println(s"==>$c3")
      var sum = sq + cb;
      println(s"Sum of Square and Cube is: $sum")


    }

    def square(a: Int): Int = (a * a)
    def cube(a: Int): Int = (a * a * a)
}
