package mvctest

import com.ofg.config.BasicProfiles.TEST
import org.scalatest.{BeforeAndAfterEach, Suite}
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.test.context.{ActiveProfiles, ContextConfiguration, TestContextManager}

@WebAppConfiguration
@ActiveProfiles(Array(TEST))
@ContextConfiguration(classes = Array(classOf[SampleConfig]), loader = classOf[SpringApplicationContextLoader])
trait MicroserviceIntegrationSpec extends BeforeAndAfterEach{
    this: Suite =>

    override def beforeEach(): Unit = {
      new TestContextManager(classOf[MicroserviceIntegrationSpec]).prepareTestInstance(this)
      super.beforeEach()
    }
}