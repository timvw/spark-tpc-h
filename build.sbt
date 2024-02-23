version := "1.0"
scalaVersion := "2.13.8"

val sparkVersion = "3.5.1"

// Note the dependencies are provided
libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion % "provided"
libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion % "provided"

