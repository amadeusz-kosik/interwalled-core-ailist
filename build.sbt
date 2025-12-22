ThisBuild / scalaVersion := "2.12.20"

ThisBuild / organization := "me.kosik.interwalled"

val aiList = (project in file("ailist"))
  .settings(name := "ailist")

val root = (project in file("."))
  .aggregate(aiList)


aiList / releaseVersionFile  := file("version.sbt")
aiList / libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % Test

// SBT Release
import ReleaseTransformations._

aiList / releaseProcess := Seq[ReleaseStep](
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
