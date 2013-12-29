// Turn this project into a Scala.js project by importing these settings
scalaJSSettings

scalaVersion := "2.11.0-M7"

name := "rdfstore.scala.js"

version := "0.1-SNAPSHOT"

scalacOptions ++= Seq("-language:dynamics")

// Specify additional .js file to be passed to package-js and optimize-js
unmanagedSources in (Compile, ScalaJSKeys.packageJS) +=
    baseDirectory.value / "js" / "rdfstore.startup.js"

//libraryDependencies += "org.scala-lang.modules.scalajs" %% "scalajs-jquery" % "0.2-SNAPSHOT"
