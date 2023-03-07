object StringInterpolation {
  def main(args: Array[String]): Unit = {
    val i = 10
    println(s"The value of is $i")

    val l = 2.3
    val k = s"The value of is $l"
    println(k)

    println(f"The value is $l%2.30f $k%s")

    println(f"The value is $l%2.30f $k%S")

    println(raw"The value \n of i is $i")

    println(s"The value \n of i is $i")

    println(s"The valu$$e of i is $i")

  }

}
