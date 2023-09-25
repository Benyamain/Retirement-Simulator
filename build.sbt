ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.12.4"
ThisBuild / resolvers += "Artima Maven Repository" at "https://repo.artima.com/releases"
ThisBuild / libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"

lazy val root = (project in file("."))
  .settings(
    name := "Retirement-Simulator",
    idePackagePrefix := Some("org.retirement.simulator")
  )
