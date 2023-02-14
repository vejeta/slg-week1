package uk.sky.week1

import pureconfig.ConfigSource
import pureconfig.generic.auto._

object Config {

  sealed trait Mode
  case object ProcessString extends Mode
  case object ProcessListOfInt extends Mode

  case class ProjectConfig(mode: Mode)

  // def load(): ConfigReader.Result[ProjectConfig] = ConfigSource.default.load[ProjectConfig]
  def load(): ProjectConfig = ConfigSource
    .file("src/main/resources/application.conf")
    .loadOrThrow[ProjectConfig]
}
