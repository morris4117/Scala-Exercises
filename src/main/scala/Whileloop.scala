import scala.io.StdIn.readInt

object Whileloop {
  def main(args: Array[String]): Unit = {

    def main(args: Array[String]): Unit = {

      //var i = 10;
      while (true){
        //num+=1
        println("Please enter your input: ")
        println("1.Add 2.Sub 3.Multply 4.divide")

        var choice = readInt()
        println("Enter a value: ")
        var a = readInt()
        println("Enter b value: ")
        var b = readInt()
        choice match {
          case 1 => println(a + b)
          case 2 => println(a - b)
          case 3 => println(a * b)
          case 4 => println(a / b)
          case 4 => println(a / b)
          case _ => println("Invalid Input")
        }

      }

    }
  }

}
