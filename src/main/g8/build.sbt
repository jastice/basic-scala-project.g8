name := "$name;format="norm"$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scala_version$"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.1.0" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.11.3" % "test" withSources() withJavadoc(),
  "org.rogach" %% "scallop" % "0.9.5" withSources(), // command line parser
  "com.propensive" %% "rapture-io" % "0.9.0", // friendly io
  "com.typesafe" %% "scalalogging-slf4j" % "1.0.1",
  // "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.0.1", // scala-logging for scala 2.11
  "ch.qos.logback" % "logback-classic" % "1.0.13",
  "org.scalaz" %% "scalaz-core" % "7.0.6" withSources()
)

initialCommands := "import $organization$.$name;format="lower,word"$._"

