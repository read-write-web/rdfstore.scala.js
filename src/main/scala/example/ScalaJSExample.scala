//package example
//
//import scala.language.dynamics
//
//import scala.scalajs.js
//import js.Dynamic.{ global => g }
//import org.scalajs.jquery.{jQuery => jQ, JQueryXHR, JQueryAjaxSettings}
////import scala.scalajs.js.{Dictionary, String, Any}
//
//
//
//
//object ScalaJSExample {
//  val console = js.Dynamic.global.console
//  def main(): Unit = {
//    console.log("hello")
//    val title = jQ("#h1")
//    title.replaceWith("<h2>New Title<h2>")
//    val paragraph = g.document.createElement("p")
//    paragraph.innerHTML = "<strong>It works now!</strong>"
//    g.document.getElementById("playground").appendChild(paragraph)
//     val ttl=jQ("#turtle")
//    val json = util.jsObj[JQueryAjaxSettings](
//      url = "http://www.w3.org/People/Berners-Lee/card",
//      success = (data: js.Any, textStatus: js.String, jqXHR: JQueryXHR) => {
//        console.log(s"data=$data,text=$textStatus,jqXHR=$jqXHR");
//        js.Dictionary()
//      },
//      error = (jqXHR: JQueryXHR, textStatus: js.String, errorThrow: js.String) => {
//        console.log(s"jqXHR=$jqXHR,text=$textStatus,err=$errorThrow");
//        js.Dictionary()
//      },
//      `type` = "GET"
//    )
//    jQ.ajax(json)
////    jQ.ajax(js.Dictionary(
////      "url" -> {val str: js.Any = "http://www.w3.org/People/Berners-Lee/card"; str},
////      "success" ->  { val res: js.Any =  test _; res },
////      "error" -> { val res: js.Any = err _; res } ,
////      "type" -> { val str: js.Any = "GET"; str }
////    ).asInstanceOf[JQueryAjaxSettings]
////    )
//
//  }
//
//  private def test(data: js.Any, textStatus: js.String, jqXHR: JQueryXHR): js.Dynamic = {
//    console.log(s"data=$data,text=$textStatus,jqXHR=$jqXHR");
//    null
//  }
//
//  private def err(jqXHR: JQueryXHR,  textStatus: js.String, errorThrow: js.String) : js.Any = {
//    console.log(s"jqXHR=$jqXHR,text=$textStatus,err=$errorThrow");
//    js.Dictionary()
//  }
//}
//
//
