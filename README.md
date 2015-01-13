# Example application written in Scala.js

Demonstrates "cross building" with ScalaJS SBT plugin 0.6.0-M3.

Builds upon

# https://github.com/sjrd/scala-js-example-app/blob/cross/build.sbt
Demonstrates use pf crossProject API from build.sbt
Does not demonstrate shared code

# https://github.com/sjrd/play-with-scalajs-example/blob/m3-with-cross-utest/project/Build.scala
Demonstrates use of PlayScalaJS from a Build.scala (not build,sbt)

Shares https://github.com/sjrd/play-with-scalajs-example/blob/m3-with-cross-utest/shared/src/main/scala/shared/SharedMessages.scala
between a test https://github.com/sjrd/play-with-scalajs-example/blob/m3-with-cross-utest/shared/src/test/scala/shared/SharedTest.scala and an application https://github.com/sjrd/play-with-scalajs-example/blob/m3-with-cross-utest/js/src/main/scala/example/ScalaJSExample.scala

# https://github.com/vmunier/play-with-scalajs-example/blob/upgrade-to-scala-js-v0.6.0-M3/project/Build.scala
similar to previous

