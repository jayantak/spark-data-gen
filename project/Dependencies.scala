import sbt._

object Dependencies {

  private val scalaTest                 = "org.scalatest"             %%  "scalatest"                 % "3.0.1"
  private val json4sJackson              = "org.json4s"                %%  "json4s-jackson"             % "3.5.2"

  val test: Seq[ModuleID] = Seq(scalaTest).map(_ % "test")
  val core: Seq[ModuleID] = Seq(json4sJackson)

  val all: Seq[ModuleID] = test ++ core
}