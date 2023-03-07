import javax.management.Query.eq

object EqualstoFunction {
  def main(args: Array[String]): Unit = {
    val a = null
    val b = null

    // "==" finction
    if(a==b){
      println("a equals to b")
    }else{
      println("a not equals to b")
    }

    // "eq" function
    if (a eq b) {
      println("a equals to b")
    } else {
      println("a not equals to b")
    }

    val n1 = "Morris"
    val n2 = "morris"
    var n3 = "Kranthi"

    if (n1 == n2) {
      println("n1 equals to n2")
    } else {
      println("n1 not equals to n2")
    }
    if (n1 eq n2) {
      println("n1 equals to n2")
    } else {
      println("n2 not equals to n2")
    }

    if(n1.toUpperCase()==n2.toUpperCase()){
      println("n1 equals to n2")
    } else {
      println("n2 not equals to n2")
    }

    if(n1.equalsIgnoreCase(n2)){
      println("n1 equals to n2")
    } else {
      println("n2 not equals to n2")
    }
  }
}
