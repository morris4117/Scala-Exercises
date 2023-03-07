// Write a program to print multiplication table and avoid printing 5th row(2*5=10)

import scala.io.Source.DefaultBufSize.!=
import scala.io.StdIn.readInt

object MultiplicationTable {
  def main(args: Array[String]): Unit = {
    println("Please Enter your input: ")

    var num: Int = readInt()

    for(i<-(1 to 10) if(i!=5)){

       //String Intrepolation
       println(s"$num*$i=${num*i}")
    }
  }

}
