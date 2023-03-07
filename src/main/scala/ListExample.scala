object ListExample {
  def main(args: Array[String]): Unit = {
    //Creating a List
    var l1 = List(1,4,3,5,6,9)
    var l2:List[String] = List("Morris", "Manvitha", "Lavanya")

    //To Create Empty List
    var l3 = Nil
    var l4 = List.empty

    //Printing a List
    println(l1)
    println(" ")
    // ::: means Concatenation [Concatenate 3 at the last (Nil means last empty element of list)]
    println(l2:::(3::Nil))
    println(" ")
    //fill is used to print the number in no.of times, 6 is printed 7 times.
    var v3=List.fill(7)(6)
    println(v3)
    println(" ")
    println(v3.size)
    println(" ")
    println(v3.length)
    println(" ")
    println(l1.length)
    println(" ")
    println(l1.apply(2))
    println(" ")
    println(l1(1))
    println(" ")

    for(i<-l1){
      print(i)
    }
    println()
    println(" ")
    println(l1.head)
    println(" ")
    println(l1.tail)
    println(" ")
    println(l1.contains(1))


    //Filtration of a List
    var filterd = l1.filter(x=>x>3)
    var filterd2 = l1.filter(_>3)
    println(filterd)
    println(" ")
    println(filterd2)
    println(" ")

    var (even, odd) = l1.partition(_%2==0)

    //Map Function using Anonymous Function
    var l5:List[Int] = l1.map((x)=>x*2)
    var l6:List[Int] = l1.map((y)=>{
      y*2
    })
    println(l5)
    println(" ")

    //FlatMap Function
    var l7 = l1.flatMap(x=>List(x,x+1))
    println(l7)
    println(" ")

    println(even)
    println(odd)
    println(" ")

    l1.foreach(x=>print(x+" "))
    println()
    println(" ")
    var l8 = l1.map(x=>x+200)
    println(l8)
  }



}
