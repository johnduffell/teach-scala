
//
// case classes
case class Person(name: String, age: Int)

val desiredName = "John"

val john = Person("John", 32)
// pattern matching again
john match {
  case Person(name, 32) if (name == desiredName) => s"what a cool age for $desiredName"
  case Person(name, _) => "boo"
}
// unapply method
//
// case objects
val op1: Option[Int] = Some(12)
val op2: Option[Int] = None
// sealed trait
// simple case class for a list
val list = 1 :: 2 :: Nil

sealed trait MyList
case object End extends MyList
case class Another(head: Int, tail: MyList) extends MyList

val myList: MyList = Another(1, Another(2, End))
// pattern matching again
//
