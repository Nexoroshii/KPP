import akka.actor.{ActorSystem, Props}

object Client {
  implicit val system = ActorSystem("ExampleSystem")

  val client = system.actorOf(Props(Server.destination))
  def NewVideo(name:String,footage:String): Unit ={
    client ! new AddNotify(name,footage)
  }
  def FindVideo(name:String): Unit ={
    client ! new FindNotify(name)
  }
  def DeleteVideo(name:String): Unit = {
    client!new DeleteNotify(name)
  }



}
