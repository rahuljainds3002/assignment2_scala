object question8_assignment2_scala {
  def main(args: Array[String]): Unit = {
    var num = 7
    var a = 1
    for(i<-1 to num) {
      a =a*i
    }
    println(s"the  factorial of $num is $a")
  }

}
