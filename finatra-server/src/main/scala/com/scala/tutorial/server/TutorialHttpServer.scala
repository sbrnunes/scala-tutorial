package com.scala.tutorial.server

import com.scala.tutorial.controllers.HelloController
import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.filters.CommonFilters
import com.twitter.finatra.http.routing.HttpRouter
import com.twitter.finatra.logging.modules.Slf4jBridgeModule


object TutorialHttpServerMain extends TutorialHttpServer

class TutorialHttpServer extends HttpServer{
  override def modules = Seq(Slf4jBridgeModule)

  override def configureHttp(router: HttpRouter): Unit = {
    router
//      .filter[LoggingMDCFilter[Request, Response]]
//      .filter[TraceIdMDCFilter[Request, Response]]
      .filter[CommonFilters]
      .add(new HelloController)
  }
}
