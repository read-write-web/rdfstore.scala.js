package util

import scala.scalajs.js
import scala.language.dynamics

/**
 * Created by hjs on 25/12/2013.
 */
object jsObj extends scala.Dynamic {
  //code by Benjamin Jackman published to the Scala.js mailing list on Dec 16
    def applyDynamicNamed[A](name: String)(args: (String, js.Any)*): A = {
      println(s"applyDynamicNamed($name)(args: $args")
      if (name != "apply") {
        sys.error("Call jsObj like this jsObj(x=1, y=2) which returns a javascript object that is {x:1,y:2}")
      }
      val obj = js.Object().asInstanceOf[js.Dictionary]
      args.foreach { case (name, value) =>
        obj(name) = value
      }
      obj.asInstanceOf[A]
    }
    //Allows for jsObj()
    def applyDynamic[A](name : String)(args: Nothing*) = {
      if (args.nonEmpty) {
        sys.error("Call jsObj only with named parameters.")
      }
      js.Object().asInstanceOf[A]
    }

    //Note that jsObj can also be given a type parameter
    //that type will be used as the return type,
    //However it's just a NOP and doesn't do real type
    //safety


}
