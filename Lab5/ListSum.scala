object ListSum {

  def sumListTailRec(xs: List[Int]): Int = {

    def inner(xs: List[Int], accum: Int): Int = {
      xs match {
        case x :: tail => inner(tail, accum + x)
        case Nil => accum
      }
    }
    inner(xs, 0)
  }



  def sumList(xs: List[Int]): Int = {
    xs match {
      case x :: tail => x + sumList(tail)//if there is an element, add it to the sum of the tail
      case Nil => 0//if there are no elements, then the sum is 0
    }
  }


  def main(args:Array[String]): Unit = {

    sumListTailRec(List(1,53,2,22,5,12))
    sumList(List(1,53,2,22,5,12))
    println(sumListTailRec(List(1,53,2,22,5,12)))
    print(sumList(List(1,53,2,22,5,12)))
  }
}
