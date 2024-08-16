name := "spark-connect-example"

organization := "com.hyukjinkwon"

version := "0.0.1"

scalaVersion := "2.13.14"

libraryDependencies += "org.apache.spark" %% "spark-sql-api" % "3.5.2"

libraryDependencies += "org.apache.spark" %% "spark-connect-client-jvm" % "3.5.2"
