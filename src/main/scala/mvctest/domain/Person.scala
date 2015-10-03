package mvctest.domain

import java.lang.Long
import javax.persistence.{Entity, GeneratedValue, Id}

import org.hibernate.validator.constraints.NotEmpty

import scala.beans.BeanProperty

@Entity
class Person {

  @Id
  @GeneratedValue
  @BeanProperty
  var id: Long = _

  @BeanProperty
  @NotEmpty
  var name: String = _

  @BeanProperty
  @NotEmpty
  var address: String = _

  @BeanProperty
  @NotEmpty
  var zip: String = _


  override def toString = s"Person($id, $name, $address, $zip)"
}