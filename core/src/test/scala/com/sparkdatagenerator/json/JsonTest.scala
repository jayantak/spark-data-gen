package com.sparkdatagenerator.json

import org.json4s.DefaultFormats
import org.scalatest.{FunSuite, Matchers}
import org.json4s.jackson.JsonMethods.parse
import com.sparkdatagenerator.feed._

class JsonTest extends FunSuite with Matchers {

  private implicit val formats = DefaultFormats

  test("com.sparkdatagenerator.feed.Feed structure should be read from json string") {

    val jsonString =
      """{ "feeds" :
            [
              { "name" : "feed1",
                "columns" :
                  [
                    { "name" : "column1",
                      "datatype" : "string"
                      },
                    { "name" : "column2",
                      "datatype" : "integer",
                      "key" : "true"
                      }
                  ]
              }
            ]
          }""".stripMargin
    val parsedObject = parse(jsonString).extract[FeedSet]

    val expectedObject = FeedSet(List(
      Feed("feed1",
        List(
          Column("column1", "string", None),
          Column("column2", "integer", Some("true"))
        )
      )
    ))

    parsedObject shouldEqual expectedObject
  }
}
