package uk.sky.week1

import java.io.PrintWriter

trait Destination[A] {
  def save(clean: A): Unit
  def transform(input: A): A
}

class StringDestination extends Destination[String] {

  override def save(clean: String): Unit = {
    val out = new PrintWriter("src/main/resources/textFiles/output1.txt")
    out.println(clean)
    out.close()
  }

  override def transform(input: String): String =
    input + s"\nThis data has been transformed."
}

class ListOfIntDestination extends Destination[List[Int]] {

  override def save(clean: List[Int]): Unit = {
    val out = new PrintWriter("src/main/resources/textFiles/output2.txt")
    out.println(clean)
    out.close()
  }

  override def transform(input: List[Int]): List[Int] =
    input.concat(List(6, 7, 8, 9))

}
