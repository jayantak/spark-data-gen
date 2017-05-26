package com.sparkdatagenerator.feed

case class Feed(name: String, columns: List[Column]) {

  val isIndependent: Boolean = columns.forall(_.from.isEmpty)
}
