package com.sparkdatagenerator.feed

import org.scalatest.{FunSuite, Matchers}

class FeedTest extends FunSuite with Matchers {

  test("isIndependent should be true for feed with no columns") {

    val feed = Feed("feed1", List.empty[Column])

    feed.isIndependent shouldEqual true
  }

  test("isIndependent should be true if no columns come from other feeds") {

    val feed = Feed("feed1",
      List(
        Column("column1", "String", None),
        Column("column2", "String", None)
      ))

    feed.isIndependent shouldEqual true
  }

  test("isIndependent should be false if one column depends on another feed") {

    val feed = Feed("feed1",
      List(
        Column("column1", "String", Some("otherFeed")),
        Column("column2", "String", None)
      ))

    feed.isIndependent shouldEqual false
  }
}
