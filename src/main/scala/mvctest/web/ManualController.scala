package mvctest.web

import mvctest.service.DataAccess
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

import scala.concurrent.Await
import scala.util.{Success, Failure}

@RestController
@RequestMapping(Array("/slick"))
class ManualController @Autowired()(private val personDao: DataAccess){

  @RequestMapping
  def card():String = {
    import scala.concurrent.ExecutionContext.Implicits.global
    import scala.concurrent.duration._
    val backendResult = personDao.getAll().map(o => o.map(_._2).mkString(","))

    backendResult.onComplete {
      case Success(n) => println(n)
      case Failure(e) => println(e.getMessage)
    }

    Await.result(backendResult, 2 seconds)
  }

  @RequestMapping(Array("/add"))
  def add() = {
    personDao.add("jan")
  }
}
