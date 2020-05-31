object Main {
 def main(args:Array[String]): Unit ={

   Client.FindVideo("Moovie")
   Client.NewVideo("Moovie","perfect")
   Client.NewVideo("Comedy","super")
  Client.NewVideo("Triller","normal")
  Client.FindVideo("Comedy")
  Client.FindVideo("Moovie")
  Client.FindVideo("Triller")
  Client.DeleteVideo("Comedy")
  Client.FindVideo("Comedy")
 }
}
