// type alias
type John = (Int, String)

// tuples
val list: List[String] = List("asdf", "qwer")
val myTuple: John = (12, "hello")
val another = (List(1), "hello", 1.23, myTuple)

// constructing, accessing with _1 and _2
another._2
// Tuple2, 3, 4 etc
// list.partition
val longList = Range(1,100).toList
longList.filter(_ % 2 == 0)
longList.partition(_ % 2 == 0)._2
val longListReversed = longList.reverse

val zipped = longList.zip(longListReversed)
// -> operator - makes it look nicer
val sugar = 12 -> "twelve"
val lessS = 12.->("twelve")
//
// pattern matching
myTuple match {
  case (2, "hello") => "correct"
  case (a, b) if (a == 122) => s"yes a = $a and b = $b"
  case (a, b) => s"no  a = $a and b = $b"
  case _ => "wrong"
}
// pair match a tuple
// match with an if statement
// match in a partial function
List(1,2,3).map(_ * 2)

val x: ((Int, Int)) => (Int) = {
  case (a, b) => a + b
}
zipped.map(a => a._1 + a._2)

val (age, name) = myTuple
