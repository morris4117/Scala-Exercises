import scala.io.StdIn.readInt
import scala.math.Equiv

object MathOperation {
  def mathfunc(name:String):(Int, Int)=>Int = (x:Int, y:Int) => {
    name match {
      case "1.addition" => x + y
      case "2.subtraction" => x - y
      case "3.multiplication" => x * y
      case "4.division" => x / y
    }
  }

    def add:(Int,Int)=>Int=mathfunc("1.addition")
    def sub:(Int,Int)=>Int=mathfunc("2.subtraction")
    def mul:(Int,Int)=>Int=mathfunc("3.multiplication")
    def div:(Int,Int)=>Int=mathfunc("4.division")

    def main(args: Array[String]): Unit = {

    }
}
