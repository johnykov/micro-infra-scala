package mvctest.service

import java.lang.Long

import mvctest.domain.Person
import org.springframework.data.jpa.repository.JpaRepository

trait PersonRepository extends JpaRepository[Person, Long]