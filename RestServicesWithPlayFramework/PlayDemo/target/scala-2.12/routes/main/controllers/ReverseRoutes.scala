
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/itrjwyss/Documents/presentations/2017/0110JavaOne/javaone17/conf/routes
// @DATE:Sun Oct 01 17:40:22 PDT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:7
  class ReverseJsonController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def catchObject(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "catchObject")
    }
  
    // @LINE:7
    def returnHash(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "returnHash")
    }
  
    // @LINE:8
    def returnObject(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "returnObject")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:12
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
