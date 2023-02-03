package uk.sky.week1

import java.io.PrintWriter

trait Destination[A] {
  def save(clean: A): Unit
  def transform(input: A): A
}

class destinationString extends Destination[String] {

  override def save(clean: String): Unit = {
    val out = new PrintWriter("/Users/rel21/Documents/IntelliJ-workspace/ScalaLearningGroup/scala-learning-group-project-week1/src/main/scala/resource/output.txt")
    out.println(clean)
    out.close()
  }

  override def transform(input: String): String = {
    input + s"\nThis data has been transformed."
  }
}

