object question18_assignment2_scala {
  def main(args: Array[String]): Unit ={

    var num  = 16
    var i = 1
    var b = 0
    while(i<num){
      var c = i*i
      if(c==num){ b=1
      }
      i+=1
    }
    if(b==1){print(s"number $num is a perfect square")}
    else {print(s"number $num is not a perfect square")}
  }


}
