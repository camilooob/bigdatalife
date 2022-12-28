ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % latest.release, 
  "org.apache.spark" %% "spark-sql" % latest.release,
  "com.typesafe" % "config" % latest.release,
  "org.apache.kafka" % "kafka-clients" % latest.release,
  "org.apache.kafka" % "connect-json" % latest.release,
  "org.apache.kafka" % "connect-runtime" % latest.release,
  "org.apache.kafka" % "kafka-streams" % latest.release,
  "org.apache.kafka" %% "kafka-streams-scala" % latest.release,
  "com.fasterxml.jackson.core" % "jackson-databind" % latest.release,
  "org.apache.kafka" % "connect-runtime" % latest.release,
  "io.confluent" % "kafka-json-serializer"  % latest.release,
  "javax.ws.rs" % "javax.ws.rs-api" % "2.1.1" artifacts( Artifact("javax.ws.rs-api", "jar", "jar")) 
)

lazy val root = (project in file("."))
  .settings(
    name := "lifeworld"
  )
