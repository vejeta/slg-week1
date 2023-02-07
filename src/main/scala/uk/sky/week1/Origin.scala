package uk.sky.week1

import scala.io.Source

trait Origin[A] {
  def extract(path: String, encoding: String): A
  def clean(input: A): A = input
}

class StringOrigin(val path: String) extends Origin[String] {

  override def extract(path: String = this.path, encoding: String): String = {
    val source = Source.fromFile(path, encoding)
    val contents = source.mkString
    source.close()
    contents
  }

  override def clean(input: String): String = {
    input
      .toLowerCase
      .filter(c => c != ';' && c != '\n')
      .replace(':', '.')
      .split('.')
      .foldLeft("")((str, elem) => str.concat(elem.stripLeading().capitalize.appendedAll(". ")))
  }
}

class IntListOrigin(val path: String) extends Origin[List[Int]] {

  override def extract(path: String = this.path, encoding: String): List[Int] = {

    val source = Source.fromFile(path, encoding)
    val contents = source.getLines().map(_.toInt).toList
    source.close()
    contents
  }

}



