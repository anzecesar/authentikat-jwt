
name := "authentikat-jwt"

organization := "com.jason-goodwin"

scalaVersion := "2.12.1"

crossScalaVersions := Seq("2.10.4", "2.11.7", "2.12.1") //sbt '+ publish'

parallelExecution := false

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
  "commons-codec" % "commons-codec" % "1.9",
  "org.json4s" %% "json4s-native" % "3.4.2",
  "org.json4s" %% "json4s-jackson" % "3.4.2",
  "org.scalatest" %% "scalatest" % "3.0.1" % Test
)

credentials += Credentials(Path.userHome / ".mdialog.credentials")

resolvers ++= Seq(
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
)

bintrayRepository := "maven"


licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

//publishTo := {
//  val nexus = "https://oss.sonatype.org/"
//  if (isSnapshot.value)
//    Some("snapshots" at nexus + "content/repositories/snapshots")
//  else
//    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
//}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>http://github.com/jason-goodwin.com/authentikat-jwt</url>
  <licenses>
    <license>
      <name>Apache2</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.html</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:jasongoodwin/authentikat-jwt.git</url>
    <connection>scm:git:git@github.com:jasongoodwin/authentikat-jwt.git</connection>
  </scm>
  <developers>
    <developer>
      <id>jasongoodwin</id>
      <name>Jason Goodwin</name>
      <url>http://refactoringfactory.wordpress.com</url>
    </developer>
  </developers>)

credentials += Credentials("Sonatype Nexus Repository Manager",
                           "oss.sonatype.org",
                           "<your username>",
                           "<your password>")
