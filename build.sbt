
name := "spark-data-generator"

version := "0.1"

scalaVersion := "2.12.2"

lazy val core = Project("spark-data-generator", file("."))
  .settings(Settings.core: _*)
  .settings(Defaults.itSettings : _*)