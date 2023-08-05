package example

object P01 {
  def main(args: Array[String]) = {
    val list = List(1,2,3,4,5,6)
    println(last(list))
  }

  def last(list: List[Int]): Int =  list match{

    case x :: Nil => x
    case _ :: tail => last(tail)
    case _    => throw new NoSuchElementException
  }
}
