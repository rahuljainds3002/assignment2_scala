object question17_assignment2_scala {
  def main(args: Array[String]): Unit ={
    var prd = 1
    for (i<-1 until 6)
      {
         prd = prd * i
      }
      print(s"product of 1st 5 numbers are : $prd")

  }
}
