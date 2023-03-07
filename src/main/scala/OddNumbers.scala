import scala.io.StdIn.readInt

object OddNumbers {
  def main(args: Array[String]): Unit = {

    println("Enter a l_limit number: ")
    var l_limit: Int = readInt()

    println("Enter a u_limit number: ")
    var u_limit: Int = readInt()

    for (i <- l_limit to u_limit if (i % 2 != 0 && i % 7 != 0)) {
      println(i)
    }
  }


}
