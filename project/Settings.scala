import sbt.Keys._
import sbt._

import scala.collection.immutable.Seq

object Settings {

  private lazy val generalSettings = Seq(
    name := "spark-data-generator",
    version := "0.1",
    scalaVersion := "2.12.2",
    scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Xfuture", "-Xlint", "-Xfatal-warnings")
  )
  private lazy val coreSettings = Seq(
    organization := "com.periscope.price.client2.etl",
    libraryDependencies ++= Dependencies.all,
    parallelExecution in Test := false
  )

  private lazy val shared = generalSettings

  lazy val root = shared
  lazy val core = shared ++ coreSettings
}
