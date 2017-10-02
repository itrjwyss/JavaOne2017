
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/itrjwyss/Documents/presentations/2017/0110JavaOne/javaone17/conf/routes
// @DATE:Sun Oct 01 17:40:22 PDT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:7
  JsonController_0: controllers.JsonController,
  // @LINE:12
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:7
    JsonController_0: controllers.JsonController,
    // @LINE:12
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_1, JsonController_0, Assets_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, JsonController_0, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """returnHash""", """controllers.JsonController.returnHash"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """returnObject""", """controllers.JsonController.returnObject"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """catchObject""", """controllers.JsonController.catchObject"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_JsonController_returnHash1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("returnHash")))
  )
  private[this] lazy val controllers_JsonController_returnHash1_invoker = createInvoker(
    JsonController_0.returnHash,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JsonController",
      "returnHash",
      Nil,
      "POST",
      this.prefix + """returnHash""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_JsonController_returnObject2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("returnObject")))
  )
  private[this] lazy val controllers_JsonController_returnObject2_invoker = createInvoker(
    JsonController_0.returnObject,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JsonController",
      "returnObject",
      Nil,
      "GET",
      this.prefix + """returnObject""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_JsonController_catchObject3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("catchObject")))
  )
  private[this] lazy val controllers_JsonController_catchObject3_invoker = createInvoker(
    JsonController_0.catchObject,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JsonController",
      "catchObject",
      Nil,
      "POST",
      this.prefix + """catchObject""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:7
    case controllers_JsonController_returnHash1_route(params) =>
      call { 
        controllers_JsonController_returnHash1_invoker.call(JsonController_0.returnHash)
      }
  
    // @LINE:8
    case controllers_JsonController_returnObject2_route(params) =>
      call { 
        controllers_JsonController_returnObject2_invoker.call(JsonController_0.returnObject)
      }
  
    // @LINE:9
    case controllers_JsonController_catchObject3_route(params) =>
      call { 
        controllers_JsonController_catchObject3_invoker.call(JsonController_0.catchObject)
      }
  
    // @LINE:12
    case controllers_Assets_versioned4_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
