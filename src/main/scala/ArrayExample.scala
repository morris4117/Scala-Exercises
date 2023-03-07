import scala.io.StdIn.readLine

object ArrayExample {
  def main(args: Array[String]): Unit = {

    var myar:Array[String]=new Array[String](3)   //to create  array

    myar(0) = "Hello"
    myar(1) = "Hi"
    myar(2) = "Welcome"

    for(i<-myar){
      println(i)
    }

    var myar2 = Array(1,2,3,4,5)
    println(myar2.mkString(""))
  }
}
