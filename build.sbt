version := "1.0"
scalaVersion := "2.13.13"

val sparkVersion = "3.2.1"

// Note the dependencies are provided
libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion % "provided"
libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion % "provided"

