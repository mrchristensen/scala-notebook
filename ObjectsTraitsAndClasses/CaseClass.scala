// https://scastie.scala-lang.org/EOeVlyQYQ52m8yftAwHIgg

case class Person(name: String, age: Int)

val bob: Person = Person("Bob", 42)

val Person(name, age) = bob

val bobInTheFuture: Person = bob.copy(age = 75)

println(name)
println(age)
println(bob)
println(bobInTheFuture)
