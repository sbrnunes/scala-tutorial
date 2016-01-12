package com.scala.tutorial.controllers

import com.scala.tutorial.model.HelloRequest
import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class HelloController extends Controller {

  get("/hello") { request: Request =>
    info(request)
    "Hello " + request.params.getOrElse("name", "unknown person")
  }

  get("/hello/:name") { request: Request =>
    info(request)
    "Hello " + request.params.getOrElse("name", "unknown person")
  }

  post("/hello") { request: HelloRequest =>
    info(request)
    response.created("Hello " + request.first + " " + request.last)
  }
}
