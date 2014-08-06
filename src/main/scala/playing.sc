"hello"

// can be reassigned - don't use it!
var x = 23

x

// evaluated as soon as it's encountered
val y: Int = x

x = 45

// evaluated every time it's used
def z = println("hello")

z
z

// evaluated the first time it's used
lazy val p = println("asdf")

p
p

/**
 * a function is defined using def
 * @param x
 * @return
 */
def addOne(x: Int): Int = x + 1

// you can call a function
addOne(3)

/*
here is a block comment
 */