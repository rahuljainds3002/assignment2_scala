object print_pattern_2 {
  def main(args: Array[String]): Unit ={

    for (i<-1 until 5)
    {
      var a  = i
      for(j<-1 to i)
        {
          print(a)
        }
      println()
    }


  }
}

