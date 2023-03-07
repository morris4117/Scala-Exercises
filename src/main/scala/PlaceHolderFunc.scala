object PlaceHolderFunc {
  def main(args: Array[String]): Unit = {
    var  a =10
    var  b =20
    var  d =30
    val v1 = testM(_+_,a,b,d)
//    println(a)
//    println(b)
//    println(d)
    println(s"($a+$b)*30.0")
    println("========")
    println(s"$v1")
  }
  def testM(highFunction:(Int, Int)=>Int, a:Int, b:Int, d:Double):Double={
    highFunction(a,b)*d
  }

}
