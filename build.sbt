ThisBuild / scalaVersion := "2.12.20"

ThisBuild / organization := "me.kosik.interwalled"
ThisBuild / version := "0.1.0-SNAPSHOT"


val root = (project in file("."))
  .settings(name := "ailist")


libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % Test