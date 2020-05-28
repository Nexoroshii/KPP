object DeleteDuplicates {
  def check(list_h:String,list_t:List[String]):List[String] ={
    list_t.filterNot(_==list_h)
  }

  def delAllDuplicates(elements:List[String]):List[String] = elements match {
    case Nil => elements
    case head::tail => head :: delAllDuplicates(check(head,tail))
  }

  def main(args:Array[String]): Unit = {
    print(delAllDuplicates(List("aa","ggggg","jjjjj","aa","aa","ggggg")))

  }
}
