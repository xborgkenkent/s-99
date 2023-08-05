package example

object P05 {
  def main(args: Array[String]) = {
    val list = List(1, 1, 2, 3, 5, 8)
    println(reverse(list))
  }

  def reverse(list: List[Int]): List[Int] = {
    def rev(list: List[Int], curList: List[Int]): List[Int] = list match{
      case Nil => curList
      case h :: t => {
        rev(t, curList = h +: curList)
      }
    }
    rev(list, List())
  }
}
