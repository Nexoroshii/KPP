class Video(name: =>String, footage: =>String)
{
  def GetName() = name
  def GetFootage()=footage


  override def toString: String = s"INFO Video: $name, $footage"
}
