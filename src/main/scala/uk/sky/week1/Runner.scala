package uk.sky.week1

object Runner extends App {

    val origin = new originString("/Users/rel21/Documents/IntelliJ-workspace/ScalaLearningGroup/scala-learning-group-project-week1/src/main/scala/resource/input.txt")
    val destination = new destinationString
    val input = origin.extract(encoding = "UTF-8")
    val cleaned = origin.clean(input)
    val transformed = destination.transform(cleaned)
    destination.save(transformed)

}

// Questions:

// How do the ways of working discussed in the Domain Modelling article we read last week relate to the project we just completed?
// Where do they come in, or do they not apply here?

// What's the difference between type classes and generics?
// What's the benefit of type classes?

// https://docs.scala-lang.org/scala3/book/types-type-classes.html#:~:text=A%20type%20class%20is%20an,Comparator%5BT%5D%20.
