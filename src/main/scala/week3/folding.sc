
// recursion - fib
// folding
// map - List/Option
// Streams

val s = Stream.from(1, 4)
s(5)
s

//val l = 1 #:: 2 #:: 3 #:: Stream.empty

val numbers: Stream[Int] = 1 #:: numbers.map(_ * 2)
numbers(10)


val list: List[Int] = Range(0, 10).toList
// implement filter yourself!
type FilterFunction[A] = A => Boolean

// currying
def filter[A](source: List[A])(f: FilterFunction[A]): List[A] =
  if (source == Nil) Nil
  else {
    // call ourselves with the tail
    val recursive = filter(source.tail)(f)
    // do something with "head"
    if (f(source.head)) source.head :: recursive
    else recursive
  }

val filterCurried = filter(list)_

filterCurried(x => x % 2 == 0)

filter(list)(x => (x % 2) == 0)

// currying add function
def add(a: Int)(b: Int) = a + b
add(2)(4)
val add2 = add _
val increment = add(1)_
increment(5)
