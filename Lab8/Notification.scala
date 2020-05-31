abstract class Notification

case class AddNotify(name:String,footage:String) extends Notification
case class FindNotify(name:String) extends Notification
case class DeleteNotify(name:String) extends Notification
