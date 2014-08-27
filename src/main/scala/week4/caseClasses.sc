import scala.annotation.tailrec

// tail recursion - total up a list - annotation
val myList = List(1,2,3)

def total(list: List[Int]): Int = {
  if (list == Nil) 0
  else list.head + total(list.tail)
}

@tailrec
def totalT(soFar: Int, list: List[Int]): Int = {
  if (list == Nil) soFar
  else totalT(soFar + list.head, list.tail)
}

total(Range(0,1000000).toList)
// tuples, case classes - companion objects
// apply method
// -create an object SizedList with an apply method to create a list of n items where n must be 1-10
// unit testing - google for ScalaTest and go to the quick start
// -write some tests with FeatureSpec (or FlatSpec)
