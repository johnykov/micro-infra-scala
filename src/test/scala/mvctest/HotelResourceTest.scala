package mvctest

import mvctest.web.HotelController
import org.scalatest.{FunSuite, Matchers}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ui.ExtendedModelMap

class HotelResourceTest extends FunSuite with MicroserviceIntegrationSpec with Matchers {

  @Autowired
  private val hotelController: HotelController = null

  test("wiring works") {
    val model = new ExtendedModelMap()
    hotelController.list(model) should be("hotels/list")
  }

}