package com.scala.tutorial.model

import com.twitter.finatra.request.QueryParam

case class HelloRequest(
  @QueryParam first: String,
  @QueryParam last: String)
