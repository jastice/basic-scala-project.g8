name := "$name;format="norm"$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scala_version$"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.0" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.10.0" % "test" withSources() withJavadoc(),
  "org.rogach" %% "scallop" % "0.9.5" withSources(), // command line parser
  "com.typesafe" %% "scalalogging-slf4j" % "1.0.1",
  "ch.qos.logback" % "logback-classic" % "1.0.13",
  "org.scalaz" %% "scalaz-core" % "7.0.5" withSources()
)

initialCommands := "import $organization$.$name;format="lower,word"$._"

