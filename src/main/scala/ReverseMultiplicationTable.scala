// Write a program to print multiplication table in reverse and avoid printing 7th row(2*7=14)

import scala.io.Source.DefaultBufSize.!=
import scala.io.StdIn.readInt

object ReverseMultiplicationTable {
  def main(args: Array[String]): Unit = {

        println("Please Enter your input: ")

        var num: Int = readInt()


        for (i <- (10 to  1 by -1) if (i != 7)) {


          //String Intrepolation
          println( s"$num*$i=${num * i}")

        }
      }
}
