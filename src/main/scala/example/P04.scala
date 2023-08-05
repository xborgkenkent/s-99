package example

import scala.annotation.tailrec

object P04 {
  def main(args: Array[String]) = {
    val list = List()
    println(length(list))
  }

  def length(list: List[Int]): Int = {
    @tailrec
    def getSize(list: List[Int], accum: Int): Int = list match{
      case Nil => accum
      case h :: tail => getSize(tail, accum+1)
    }
    getSize(list, 0)
  }
}
