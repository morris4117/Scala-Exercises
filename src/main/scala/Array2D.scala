object Array2D {
  def main(args: Array[String]): Unit = {
    val myarr=Array.ofDim[Int](2,2)
    val n=1

    val myarr2=Array(Array(1,2,3,4),Array(3,4,2,1))

    myarr(0)(0) = 10
    myarr(0)(1) = 20

    println(myarr(0)(0))
    println(myarr(0)(1))


    for (i<- 0 to n ; j<-0 until n)
        print(i,j)

        //Accessing the Element
        println("="+myarr)

//    }
  //}

 }

}
