package mvctest.service

import mvctest.domain.Person
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class PersonService @Autowired()(private val repo: PersonRepository) {

  @Transactional
  def addIfNotExists(person: Person) = {
    if (repo.findOne(person.id) == null) {
      repo.save(person)
    }
  }

  def findOneOf(id: Long) = {
    repo.findOne(id)
  }

  def getAllPeople() = {
    repo.findAll()
  }
}
