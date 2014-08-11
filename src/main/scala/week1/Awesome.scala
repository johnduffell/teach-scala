// extend App to just write some code
// you can right click and Run it
object Awesome extends App {

  val x = "John"

  // use s before a string to allow substitution using $
  println(s"hello $x")
  println(s"hello ${x.toUpperCase()}")

  // use triple quotes to include things in a string that you couldn't normally
  println(
    """hello
      |"john"!""".stripMargin)

}
