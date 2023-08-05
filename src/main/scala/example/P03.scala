package example

object P03 {
  def main(args: Array[String]) = {
    println(nthRecursive(5, List(1, 1, 2, 3, 5, 8)))
  }

  def nthRecursive[A](n: Int, ls: List[A]): A = (n, ls) match {
    case (0, h :: _   ) => h
    case (n, _ :: tail) => nthRecursive(n - 1, tail)
    case (_, Nil      ) => throw new NoSuchElementException
  }
}
