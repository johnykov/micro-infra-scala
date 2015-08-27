package mvctest

import com.ofg.config.BasicProfiles
import com.ofg.infrastructure.environment.EnvironmentSetupVerifier
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SampleConfig

object SampleWebApplication extends App {
  val application = new SpringApplication(classOf[SampleConfig])
  application.addListeners(new EnvironmentSetupVerifier(BasicProfiles.all))
  application.run(args: _*)
}