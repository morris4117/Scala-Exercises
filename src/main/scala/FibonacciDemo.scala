import scala.io.StdIn.readInt

object FibonacciDemo {
  def main(args: Array[String]): Unit = {
    println("Enter a number: ")
    var n = readInt()
    println(fib(n))

  }
  def fib(n:Int):Int={
    if(n<=1) n else fib(n-1)+fib(n-2)
  }
}