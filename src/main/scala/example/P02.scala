package example

object P02 {
  def main(args: Array[String]) = {
    val list = List(1, 1, 2, 3, 5, 8)
    println(penultimate(list))
  }

  def penultimate(list: List[Int]): Int = list match{
    case h :: _ :: Nil => h
    case _ :: tail => penultimate(tail)
  }
}
