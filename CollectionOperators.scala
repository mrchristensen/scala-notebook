// https://scastie.scala-lang.org/iyMTW7WXTyW4wHqRlNKqNQ
val numbers = List(1, 2, 3, 4, 5)

// foreach: Apply a function to each element
println("foreach:")
numbers.foreach(num => println(s"Number: $num"))

// forall: Check if all elements satisfy a condition
val areAllPositive = numbers.forall(_ > 0)
println(s"forall (all positive): $areAllPositive")

// map: Apply a function to each element and create a new collection
val squares = numbers.map(num => num * num)
println(s"map (squares): $squares")

// flatten: Combine nested collections into a single collection
val nestedList = List(List(1, 2), List(3, 4), List(5))
val flattenedList = nestedList.flatten
println(s"flatten: $flattenedList")

// flatMap: Map each element to a collection and flatten the result
val sentences = List("Scala is fun", "I love programming", "FlatMap is useful")
val words = sentences.flatMap(sentence => sentence.split(" "))
println(s"flatMap (words from list of sentences): $words")

// fold: Aggregate elements using an initial value and a binary operation
val sum = numbers.fold(0)(_ + _)
println(s"fold (sum): $sum")

// foldLeft: Fold elements from the left
val leftFoldResult = numbers.foldLeft("Start")((str, num) => s"$str -> $num")
println(s"foldLeft (list): $leftFoldResult")

// foldRight: Fold elements from the right
val rightFoldResult = numbers.foldRight("END")((num, str) => s"$str -> $num")
println(s"foldRight (list): $rightFoldResult")

// reduce: fold without an initial value
val reduceSum = numbers.reduce(_ + _)
println(s"reduce (sum): $reduceSum")

// filter: Select elements that satisfy a condition
val evenNumbers = numbers.filter(_ % 2 == 0)
println(s"filter (even): $evenNumbers")

// partition: Splits collection into two, depending on condition
val (even, odd) = numbers.partition(_ % 2 == 0)
println(s"partition (even): $even")
println(s"partition (odd): $odd")

// groupBy: Partition as a map
val grouped = numbers.groupBy(_ % 2 == 0)
println(s"group (even and odd): $grouped")

// zip: combines two collections into pairs
val letters = List("a", "b", "c")
val zipped = letters.zip(numbers)
println(s"zip (pairs): $zipped")
