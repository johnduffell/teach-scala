package week4

import org.scalatest.{FlatSpec, Matchers}

class ListOperationsTest extends FlatSpec with Matchers {

  "An empty Se" should "have size 0" in {
    ListOperations(List(1,2,3)) should be (6)
  }

}
