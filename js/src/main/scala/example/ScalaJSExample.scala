package example

import scala.scalajs.js
import js.Dynamic.{ global => g }
import shared.SharedMessages

object ScalaJSExample extends js.JSApp {
  def main(): Unit = {
    g.document.getElementById("scalajsShoutOut").textContent = SharedMessages.itWorks
  }
}