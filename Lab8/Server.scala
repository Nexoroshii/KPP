import akka.actor.Actor

import scala.collection.mutable.ListBuffer

object Server {

  class Receiver extends Actor {
    override def receive = {
      case AddNotify(name, footage) => {
        listOfVideos.append(new Video(name, footage))
        println(s"Added new Video named $name")
      }
      case DeleteNotify(name) => {
        val index = listOfVideos.indexWhere(p => p.GetName() == name)
        listOfVideos.remove(index)
        println(s"Deleted Video named $name")
      }
      case FindNotify(name) => {
        val index=listOfVideos.indexWhere(p => p.GetName() == name)
        if(index==(-1)) println(s"No Video named $name")
        else println(listOfVideos(index))
      }
    }
  }
  val destination =new Receiver
  lazy val listOfVideos:ListBuffer[Video] = new ListBuffer[Video]
}

