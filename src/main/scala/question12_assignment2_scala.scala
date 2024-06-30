object question12_assignment2_scala {
  def main(args: Array[String]): Unit = {
    var num =20
    var a=1
    var sum = 0
    while(a<num+1) {
      var c = a%2
      if(c==0){
        sum+=a
        println(s" number of  b is $a")
        println(s"the  sum of this number $a is $sum")
      }
      a+=1
    }
    println(s" total sum is $sum")

  }


}
