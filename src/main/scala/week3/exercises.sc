// Example: implement filter using foldRight
def filterR[A](source: List[A])(f: A => Boolean): List[A] =
  source.foldRight(Nil: List[A])({
    case (current, soFar) =>
      if (f(current)) current :: soFar else soFar
  })

// Example: implement filter using foldLeft
def filterL[A](source: List[A])(f: A => Boolean): List[A] =
  source.foldLeft(Nil: List[A])({
    case (soFar, current) =>
      if (f(current)) current :: soFar else soFar
  }).reverse

val list: List[Int] = Range(0, 10).toList
filterR(list)(x => (x % 2) == 0)
filterL(list)(x => (x % 2) == 0)


// Q1: implement sum using recursion
def sumR(source: List[Int]): Int = ???

// Q2: implement sum using foldRight
def sumF(source: List[Int]): Int = ???

// Q3: implement map yourself using recursion
def mapR[A,B](source: List[A])(f: A => B): List[B] = ???

// Q4: implement map using foldRight
def mapF[A,B](source: List[A])(f: A => B): List[B] = ???

// Q5: implement fib using a stream
// hint, use zip and map, similar to how I implemented "numbers" in the class
val fib: Stream[Int] = ???

// Q6+: 99 problems questions 1-10 +
// http://aperiodic.net/phil/scala/s-99/
