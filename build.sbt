ThisBuild / scalaVersion := "2.12.20"

ThisBuild / organization := "me.kosik.interwalled"

releaseVersionFile := file("version.sbt")


val root = (project in file("."))
  .settings(name := "ailist")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % Test

// SBT Release
import ReleaseTransformations._
releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runClean,
  runTest,
  setReleaseVersion,
  commitReleaseVersion,
  tagRelease,
  setNextVersion,
  commitNextVersion,
  pushChanges
)
