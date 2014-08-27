package week4

import scala.annotation.tailrec

object ListOperations {

  def apply(list: List[Int]): Int = {

    @tailrec
    def total0(list: List[Int], soFar: Int): Int = {
      if (list == Nil) soFar
      else total0(list.tail, soFar + list.head)
    }

    total0(list, 0)
  }

  def main(args: Array[String]) = {
    val x: List[Int] = args.map(Integer.parseInt(_)).toList
    val total: Int = ListOperations(x)
    println(total)
  }

}
