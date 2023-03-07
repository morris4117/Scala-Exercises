import FunctionDemo.sum

import scala.io.StdIn.readInt

object FunctionDemo {
  def main(args: Array[String]): Unit = {
    var res = sum(20,30)
    println(res)

  }

  def sum(a: Int, b: Int): Int = {
    var sum = a + b
    sum
  }

}
