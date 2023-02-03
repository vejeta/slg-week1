# slg-week1
Project from week one of the Scala Learning Group

Let's think of a simple scala model of an ETL: data must be extracted from an Origin, then transformed and finally loaded into some Destination. 
To make our lives easier, think only of an Origin and a Destination, transformation will happen in the Destination by now.

An Origin must have:

an extract function that will read from the source
a clean function that will clean the data
A Destination must have:

a save function that will store the data
a transform function that manipulates the data
We want not only one data source but two and not only one place to store the data but two.

To fulfill these requirements, a trait is a really helpful approach.

Exercise 1: Traits
DIF has an abstract structure that might be difficult to understand. traits are a daily basis in the project and it is important to have a proper understanding of them.

You may have noticed that we don't have any description of where data come from or goes yet. That is because what we have defined is an abstraction of what they have to do. And that is fine for now.

Exercise 1.1: Define Origin and Destination traits. Feel free to define the input data type.

Hints/Help

Any Origin must have an extract function that reads from a provided path and returns a certain type, a string, for example.

Any Origin must have a clean function that has the same input and output

Any Destination must have a save function that receives the cleaned data and saves it some place, that means it is not supposed to return any value in return.

Any Destination must have a transform function that function must have the same input and output

Now we have the abstraction, let's implement it.

Exercise 1.2: Create at least one implementation for each trait.

The source will be the resource/input folder of your project. Use the input.txt file that lives in the same folder as this file (sky-training/first) as an input data.
The destination is the resource/output folder of your project.
The data has a bunch of colon and semicolons randomly provided that create a lot of noise. Drop all of them.
All the letters are in uppercase, provide the proper format.
Merge all the pieces using this main function:

object Hello with App {
  val origin = //an instance of your implementation here
  val destination = //an instance of your implementation here

  val input = origin.extract(path)
  val cleaned =  origin.clean(input)
  val transformed = destination.transform(cleaned)
  destination.save(transformed)
}
