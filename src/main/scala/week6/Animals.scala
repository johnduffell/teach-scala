package week6

sealed trait Animal

trait Bird extends Animal

case class Chicken(name: String) extends Bird
case class Swan(name: String) extends Bird


trait Mammal extends Animal

case class Human(name: String) extends Mammal
