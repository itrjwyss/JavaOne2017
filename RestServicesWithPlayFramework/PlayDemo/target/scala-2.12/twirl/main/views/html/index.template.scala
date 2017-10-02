
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("JavaOne17")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
  """),format.raw/*4.3*/("""<h1>"""),_display_(/*4.8*/message),format.raw/*4.15*/("""</h1>
""")))}),format.raw/*5.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 01 17:32:12 PDT 2017
                  SOURCE: /Users/itrjwyss/Documents/presentations/2017/0110JavaOne/javaone17/app/views/index.scala.html
                  HASH: 028bfeb12102b13ca62fb223f399b7426a0e38de
                  MATRIX: 948->1|1060->18|1088->21|1113->38|1152->40|1181->43|1211->48|1238->55|1274->62
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|37->5
                  -- GENERATED --
              */
          