import sbt._

object Dependencies {

  private val scalaTest                 = "org.scalatest"             %%  "scalatest"                 % "3.0.1"

  val test: Seq[ModuleID] = Seq(scalaTest).map(_ % "test")
  val core: Seq[ModuleID] = Seq()

  val all: Seq[ModuleID] = test ++ core
}