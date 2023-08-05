package example

object P06 {
  def main(args: Array[String]) = {
    val list = List(1, 2, 3, 2, 1)
    print(isPalindrome(list))
  }

  def isPalindrome(list: List[Int]): Boolean = {
    list == list.reverse
  }

}
