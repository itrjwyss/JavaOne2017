
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/itrjwyss/Documents/presentations/2017/0110JavaOne/javaone17/conf/routes
// @DATE:Sun Oct 01 17:40:22 PDT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
