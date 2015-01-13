# Example project showing "cross building" with Scala.js 0.6.0-M3 and testing with uTest.

#### 1. https://github.com/sjrd/scala-js-example-app/blob/cross/build.sbt
Demonstrates use pf crossProject API from build.sbt
Does not demonstrate shared code from uTests.

#### 2. https://github.com/sjrd/play-with-scalajs-example/blob/m3-with-cross-utest/project/Build.scala
Demonstrates use of PlayScalaJS from a Build.scala (not build,sbt)

Shares https://github.com/sjrd/play-with-scalajs-example/blob/m3-with-cross-utest/shared/src/main/scala/shared/SharedMessages.scala
between a test https://github.com/sjrd/play-with-scalajs-example/blob/m3-with-cross-utest/shared/src/test/scala/shared/SharedTest.scala and an application https://github.com/sjrd/play-with-scalajs-example/blob/m3-with-cross-utest/js/src/main/scala/example/ScalaJSExample.scala

#### 3. https://github.com/vmunier/play-with-scalajs-example/blob/upgrade-to-scala-js-v0.6.0-M3/project/Build.scala
Similar to previous

#### To note

* build.sbt defines the "shared" project
* No need to create symlinks to 'shared'
* Have to manually create the Idea module dependencies.


![Alt text](https://raw.githubusercontent.com/SemanticBeeng/scala-js-example-app-cross/master/img/scalajs-example.png "Project dependencies in IDEA")

* Shared code is accessible in JS test and application
* See the scala-js Google Group thread called "Scala.js] multi module Play Framework build with utest" for insights
from Sébastien Doeraene (https://groups.google.com/forum/#!forum/scala-js)
