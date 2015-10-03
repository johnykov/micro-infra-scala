package mvctest.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import slick.driver.PostgresDriver.api._

@Component
class DataAccess @Autowired()(val db: Database) {
  val personTable = TableQuery[PersonTable]

  def getAll() = {
    val result = db.run(personTable.result)
    result
  }

  def add(input: String) = {
    val setup = DBIO.seq(
      personTable +=(14, input)
    )
    db.run(setup)
  }
}

class PersonTable(tag: Tag) extends Table[(Int, String)](tag, "PERSON") {
  def id = column[Int]("ID", O.PrimaryKey)

  def name = column[String]("NAME")

  def * = (id, name)
}