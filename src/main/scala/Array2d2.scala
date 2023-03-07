object Array2d2 {
  def main(args: Array[String]): Unit = {
    var arr = Array(Array(1, 2, 3, 4),
      Array(3, 4, 5, 6))
    var arr2 = Array(Array(7, 8, 9, 10),
      Array(11, 12, 13, 14))

    for (i <- 0 to 1) {
      for (j <- 0 to 3) {
        if (j != 0) {
          print("," + arr(i)(j))
        } else {
          print(arr(i)(j))
        }

      }
      println()
    }
    for (k <- 0 to 1) {
      for (l <- 0 to 3) {
        if (l != 0) {
          print("," + arr2(k)(l))
        } else {
          print(arr2(k)(l))
        }

      }
      println()

    }
  }

}
