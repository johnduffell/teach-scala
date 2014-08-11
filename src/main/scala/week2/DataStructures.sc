
// http://www.scala-lang.org/api/current/index.html#scala.collection.Seq

// List
val myList: List[Int] = Nil

val threeOnly = 3 :: Nil

val longerList = 1 :: ( 2 :: ( 3 :: Nil ) )

val prepended = 0 :: longerList

longerList

longerList.head
longerList.tail
longerList.tail.tail.tail
// immutable
// :: head tail Nil

// Set, Map, Vector, Range
val vec = Vector(1,2,3,4)
val appended = vec :+ 5
vec
Range(0, 10)
// +: :+ isEmpty

// contains, sum, product, count, max, min, reverse size
prepended.contains(3)
prepended.sum
prepended.product
prepended.max
prepended.reverse

// *take, drop, takeWhile, dropWhile, exists, find, partition, span, splitAt
prepended.drop(3)

def filter(x: Int): Boolean = x <= 2
prepended.takeWhile(filter)

prepended.takeWhile((x: Int) => x <= 2)
prepended.takeWhile(_ <= 2)

prepended.splitAt(2)._2

val x = (12, "qwerty", 122)
x._2

case class John(age: Int, name: String)

val helpful = John(32, "John")
helpful.name

// map, filter, foldLeft
prepended.map(_ * 10)
prepended.filter(_ < 2)
// zip, zipWithIndex

// toList, toSeq, toMap, toVector, toStream
