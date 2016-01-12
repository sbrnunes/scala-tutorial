
lazy val versions = new {
  val finatra = "2.1.2"
  val guice = "4.0"
  val logback = "1.1.3"
}

// Module specific dependencies
libraryDependencies +=  "com.twitter.finatra" %% "finatra-http" % versions.finatra
libraryDependencies += "com.twitter.finatra" %% "finatra-httpclient" % versions.finatra
libraryDependencies += "com.twitter.finatra" %% "finatra-slf4j" % versions.finatra
libraryDependencies += "ch.qos.logback" % "logback-classic" % versions.logback
//libraryDependencies += "com.twitter.inject" %% "inject-core" % versions.finatra

// Module specific test dependencies
libraryDependencies += "com.twitter.finatra" %% "finatra-http" % versions.finatra % "test"
libraryDependencies += "com.twitter.finatra" %% "finatra-http" % versions.finatra % "test" classifier "tests"
libraryDependencies += "com.twitter.finatra" %% "finatra-jackson" % versions.finatra % "test"
libraryDependencies += "com.twitter.finatra" %% "finatra-jackson" % versions.finatra % "test" classifier "tests"
libraryDependencies += "com.twitter.inject" %% "inject-server" % versions.finatra % "test"
libraryDependencies += "com.twitter.inject" %% "inject-server" % versions.finatra % "test" classifier "tests"
libraryDependencies += "com.twitter.inject" %% "inject-app" % versions.finatra % "test"
libraryDependencies += "com.twitter.inject" %% "inject-app" % versions.finatra % "test" classifier "tests"
libraryDependencies += "com.twitter.inject" %% "inject-core" % versions.finatra % "test"
libraryDependencies += "com.twitter.inject" %% "inject-core" % versions.finatra % "test" classifier "tests"
libraryDependencies += "com.twitter.inject" %% "inject-modules" % versions.finatra % "test"
libraryDependencies += "com.twitter.inject" %% "inject-modules" % versions.finatra % "test" classifier "tests"

libraryDependencies += "com.google.inject.extensions" % "guice-testlib" % versions.guice % "test"

libraryDependencies += "org.mockito" % "mockito-core" % "1.9.5" % "test"
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.3" % "test"
libraryDependencies += "org.specs2" %% "specs2" % "2.3.12" % "test"

resolvers += "Twitter" at "http://maven.twttr.com"