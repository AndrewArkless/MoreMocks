/**
  * Created by User on 08/02/2017.
  */

trait MyConnector{
  val db:MyDataBase
  def connector(user:String)={

    println(user)
    if (db.getData(user)=="Allowed") "ENTER"
    else "GOAWAY"
  }
}
class MyConnector1 extends MyConnector{
  val db: MyDataBase =MyDataBase
}




