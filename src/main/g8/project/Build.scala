import sbt._
import sbt.Keys._

object Build extends Build {

  lazy val rootProject = Project(id = "$name;format="norm"$", base = file("."), settings = Project.defaultSettings ++ Seq(
      name := "$name$",
      , organization := "$organization$",
      , version := "$version$",
      , scalaVersion := "$scala_version$"
    ) ++ seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)
  )
}
