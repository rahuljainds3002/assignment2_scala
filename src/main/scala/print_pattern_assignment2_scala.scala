object print_pattern_assignment2_scala {
  def main(args: Array[String]): Unit =
  {
    var i = 1
    var j = 1
    for (i <- 1 to 4)
      {
        for (j <-1 to i)
          {
            print("*")
          }
          println()
      }
   }
 }
