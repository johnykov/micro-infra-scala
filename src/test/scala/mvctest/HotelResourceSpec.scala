package mvctest

import mvctest.web.HotelController
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ui.ExtendedModelMap

@RunWith(classOf[JUnitRunner])
class HotelResourceSpec extends FlatSpec with MicroserviceIntegrationSpec with Matchers {

  @Autowired
  private val hotelController: HotelController = null

  "A controller" should "return a list" in {
    val model = new ExtendedModelMap()
    hotelController.list(model) should be("hotels/list")
  }

}
