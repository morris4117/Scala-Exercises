object CallingaFuncintoFunc {
  def myfunc():(String, String)=>String={
    return myfunc2;
  }
  def myfunc2(a:String, b:String):String={
    return a.toUpperCase()+b.toUpperCase()
  }

  def main(args: Array[String]): Unit = {
    var x = myfunc()
    println(x("hello all \n", "myself morris from data team"))
  }
}
