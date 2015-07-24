package mvctest

import com.ofg.config.BasicProfiles
import com.ofg.infrastructure.environment.EnvironmentSetupVerifier
import org.springframework.boot.SpringApplication

object SampleWebApplication {
  def main(args: Array[String]) {
    val application = new SpringApplication(classOf[SampleConfig])
    application.addListeners(new EnvironmentSetupVerifier(BasicProfiles.all))
    application.run(args:_*)
  }
}