/**
  * Created by User on 08/02/2017.B
  */
object MyDataBase extends MyDataBase

trait MyDataBase {
  def getData(x:String)={println("HERE!!!!!!!!!!!");if (x=="Andrew") "Allowed"
  else "Denied"}
}
