// https://scastie.scala-lang.org/C99bjnWQR4WWUEIrwEEfPQ

class User(val id: Int, val name: String, val email: Option[String])

val users = List(
    User(1, "Jane", Some("jane@example.com")),
    User(2, "Jack", None),
)

def getUser(id: Int): Option[User] = {
  this.users.find(user => user.id == id)
}

def sendEmail(id: Int) = {
  getUser(id).map(
    user => user.email.map(
      email => println(s"Send email to: $email")
    ).getOrElse(printf("Error: no email provided for %s\n", user.name))
  ).getOrElse(println(s"No user with id: $id"))
}

getUser(1).map(user => println(user.name))
getUser(2).map(user => println(user.name))
sendEmail(1)
sendEmail(2)
sendEmail(3)
