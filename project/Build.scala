import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

  val appName         = "ReactiveMongo-Demo-TailableCursors"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "org.reactivemongo" %% "play2-reactivemongo" % "0.9"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // settings
  )
}
