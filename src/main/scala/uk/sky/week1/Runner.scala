package uk.sky.week1

import uk.sky.week1.Config.{ProcessListOfInt, ProcessString}

object Runner extends App {

    val projectMode = Config.load().mode


    if(projectMode == ProcessListOfInt) {

        val intListOrigin = new IntListOrigin("src/main/resources/textFiles/input2.txt")
        val listOfIntDestination = new ListOfIntDestination
        val listOfIntInput = intListOrigin.extract(encoding = "UTF-8")
        val listOfIntCleaned = intListOrigin.clean(listOfIntInput)
        val listOfIntTransformed = listOfIntDestination.transform(listOfIntCleaned)
        listOfIntDestination.save(listOfIntTransformed)


    } else {
        val stringOrigin = new StringOrigin("src/main/resources/textFiles/input1.txt")
        val stringDestination = new StringDestination
        val input = stringOrigin.extract(encoding = "UTF-8")
        val cleaned = stringOrigin.clean(input)
        val transformed = stringDestination.transform(cleaned)
        stringDestination.save(transformed)
    }
}

// Questions:

// How do the ways of working discussed in the Domain Modelling article we read in the first week relate to the project we just completed?
// Where do they come in, or do they not apply here?

// Why doesn't the commented out load() method in Config.scala work?
//https://github.com/lightbend/config#standard-behavior
