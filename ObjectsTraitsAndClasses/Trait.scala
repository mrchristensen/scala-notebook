// https://scastie.scala-lang.org/8XD9f7cXS8KoXieTntL97g

trait Person {
  val name: String
  val age: Int
}


val bob = new Person {
  override val name: String = "Bob"
  override val age: Int = 42
}

println(bob)

case class Bob(age: Int) extends Person {
  override val name: String = "Bob"
}

val youngBob = new Bob(7)
val oldBob = new Bob(80)
println(youngBob)
println(oldBob)
