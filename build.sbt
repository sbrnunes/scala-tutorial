
lazy val commonSettings = Seq(
  version := "0.2.0",
  scalaVersion := "2.11.4"
)

// Modules
lazy val root = project.in(file("."))
  .settings(commonSettings: _*)
  .aggregate(commons, finatraServer)

lazy val commons = project.in(file("commons"))
  .settings(commonSettings: _*)
  .settings(
    name := "commons")

lazy val finatraServer = project.in(file("finatra-server"))
  .settings(commonSettings: _*)
  .settings(
    name := "finatra-server")
  .dependsOn(commons)

