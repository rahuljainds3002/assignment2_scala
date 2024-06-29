object Question7_assignment2_scala {
  def main(args: Array[String]): Unit = {
var i = 1
    while(i<16) {
      var a = i%2
      if(a!=0) {
        println(s"the  number $i is odd number")
      }
      i+=1
    }
  }

}
