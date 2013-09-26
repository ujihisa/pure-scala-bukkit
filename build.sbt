import AssemblyKeys._

name := "pure-scala-bukkit"

version := "1.0"

scalaVersion := "2.10.2"

resolvers += "org.bukkit" at "http://repo.bukkit.org/service/local/repositories/snapshots/content/"

libraryDependencies ++= Seq(
	"org.bukkit" % "bukkit" % "1.6.2-R1.1-SNAPSHOT",
	"javax.servlet" % "servlet-api" % "2.4" % "provided" // Fixes "Missing dependency 'class javax.servlet.ServletContext'"
	//"com.twitter" %% "util-collection" % "6.3.6"
)

javacOptions ++= Seq("-source", "1.5", "-target", "1.5") // for annotations

assemblySettings
