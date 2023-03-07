import scala.io.StdIn.{readInt, readLine}

object StudentDatabase {
  var students:Array[String] = new Array[String](10)
  var i=0

  def addstudent():Unit={
    println("Please Enter the Name: ")
    var sname = readLine()
    students(i)=sname
    //i++ increment
    i=i+1
  }

  def liststudent():Unit= {
    print("Student Name: ")
    println("===========")
    for (k <- 0 to i-1) {
      println(students(k))
    }
  }

    def main(args: Array[String]): Unit = {
      while (true){
        println("Choose your Operation:")
        println("1. Add Student,\n2. List Students")
        var ch:Int=readInt()
        ch match {
          case 1 => addstudent()
          case 2 => liststudent()
          case _ => println(s"Invalid option")
        }
      }
    }
}
