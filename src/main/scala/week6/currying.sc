// currying?
// partial application?
//
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
object Generics {

  sealed trait Maybe[+T] {
    def get: T
  }

  case object Zero extends Maybe {
    def get = ???
  }

  case class One[T](get: T) extends Maybe[T]

  def map[T, R >: T](m: Maybe[T]/*we are a maybe Human*/)(f: Function[R, String]) = f.f(m.get)
  // but it's fine for the function to accept an Animal

  def orElse[T, S <: T](first: Maybe[T], otherwise: Maybe[S]): Maybe[T] =
    first match {
      case Zero => otherwise
      case _ => first
    }

}
import Generics._
import week6._

// generics - standard - put an Animal in
// covariance
val x: Maybe[Swan] = One(Swan("bob"))
val gotOut: Animal = x.get
// contravariance
case class Function[F,T](f: F => T)
//
def toLift = Function[Animal,String](_.toString)
val mapped: String = map(x)(toLift)
// type bounds <: - list of Birds but we have a function that takes a list of animals
val birds: Maybe[Bird] = One(Swan("bill"))
def function[X <: Animal](animals: Maybe[X]): String = ???
function(birds)
// _ in generics
def ignoreEverything(m: Maybe[_]) = println("told you")
