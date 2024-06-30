object question9_assignment2_scala {
  def main(args: Array[String]): Unit = {
    var num = 12
    var a = 2
    var d = 0
    while(a<num) {
      var c = num%a
      if(c==0){
        d = 1
        println(s" number of  b is $d")
        println(s"the  factorial of $num is $a")
      }
      a+=1
    }
    println(s" number of  d is $d")
    if(d==1){println(s"number $num is not a prime number")}
    else {println(s"number $num is a prime number")}
  }

}
