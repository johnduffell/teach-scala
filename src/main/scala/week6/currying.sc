// currying?
// partial application?
// traits and classes - colours
// generics - Option
object NoGenerics {

  sealed trait Maybe {
    def get: Int
  }

  case object Zero extends Maybe {
    def get = ???
  }

  case class One(get: Int) extends Maybe

  def map(m: Maybe)(f: Int => String) = f(m.get)

}
import NoGenerics._
import week6._

// generics - standard - put an Animal in
// covariance
val x: Maybe = One(Swan("bob"))
val gotOut: Swan = x.get
// contravariance
def toLift(swan: Swan): String = swan.toString
val mapped: String = map(x)(toLift)
// type bounds <: - list of Birds but we have a function that takes a list of animals
val birds: Maybe/*[Bird]*/ = One(Swan("bill"))
def function(animals: Maybe/*[Animal]*/): String = ???
function(birds)
// _ in generics
