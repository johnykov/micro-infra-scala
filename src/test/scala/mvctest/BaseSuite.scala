package mvctest

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSuite}

@RunWith(classOf[JUnitRunner])
trait BaseSuite extends FunSuite with MicroserviceIntegrationSpec with Matchers
