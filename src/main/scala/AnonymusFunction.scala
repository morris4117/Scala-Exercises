object AnonymusFunction {

  //Calling a function in a variable without calling a function
  def main(args: Array[String]): Unit = {
    val myvar = (i:Int)=>{
      println("Hello Morris")
      //return i;
      i
    }
    println(myvar(10))
  }

}
