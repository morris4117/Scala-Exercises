
object MinMaxFunction {
  def main(args: Array[String]): Unit = {
    findminmax(900,677)
  }

  def findminmax(a: Int, b: Int): Unit = {
    def max(a: Int, b: Int): Unit = {
      if (a > b) {
        println(s"$a is Maximum")
      }
    }

      def min(a: Int, b: Int): Unit = {
        if (a < b) {
          println(s"$b is Minimum")
        }
      }
        max(a, b)
        min(a, b)

    }

}
