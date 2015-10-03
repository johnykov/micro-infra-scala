package mvctest.service

import mvctest.BaseSuite
import mvctest.domain.Person
import org.springframework.beans.factory.annotation.Autowired

class PersonServiceTest extends BaseSuite {

  @Autowired
  private val service: PersonService = null

  val address = """23234 """.stripMargin

  test("test transaction") {
    val person = new Person
    person.setId(4l)
    person.setName("name")
    person.setAddress(address)
    person.setZip("zip")
    service.addIfNotExists(person)

    println(service.getAllPeople())

    service.findOneOf(1l).getAddress shouldBe address
  }

}
