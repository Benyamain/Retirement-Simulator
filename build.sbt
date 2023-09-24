ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.4"

lazy val root = (project in file("."))
  .settings(
    name := "Retirement-Simulator",
    idePackagePrefix := Some("org.retirement.simulator")
  )
