/**
  * Created by User on 08/02/2017.
  */
object HelloWorld extends App {
  val ax= new MyConnector1()
//  val y= MyConnector
 val x=new MyConnector1//.db.getData("Andrew")
 val y=new MyConnector1//.db.getData("Arkless")
  println(x.db.getData("Andrew"))
  println(y.db.getData("Arkless"))
}
