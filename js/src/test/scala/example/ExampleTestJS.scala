package example

import utest._

import scala.scalajs.js

object ExampleTestJS extends TestSuite {

  def tests = TestSuite {
    'HelloWorld {
      assert(js.JSON.parse("5") == 5)
    }
  }
}
