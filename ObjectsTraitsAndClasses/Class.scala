// https://scastie.scala-lang.org/FYVqqqN9Q4aAkr2fjyrtjg

class Person(val name: String, val age: Int)


val bob: Person = new Person("Bob", 42)


object Person {

  def apply(name: String, age: Int) = new Person(name, age)

  def unapply(person: Person) = (person.name, person.age)
  
}

val stacy1: Person = Person.apply("Stacy", 5)
val stacy2: Person = Person("Stacy", 5) // syntactic sugar

val nameAndAge: (String, Int) = Person.unapply(bob)
val Person(name, age) = bob // syntactic sugar

println(nameAndAge)
println(name)
println(age)
println(bob)
