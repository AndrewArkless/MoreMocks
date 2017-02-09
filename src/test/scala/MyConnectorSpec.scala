import org.scalatest.{BeforeAndAfterAll, FlatSpec, Matchers, WordSpecLike}

import org.scalatest.mock.MockitoSugar
import org.mockito.Mockito._

class MyConnectorSpec extends WordSpecLike with Matchers with MockitoSugar {
  val mockMyDase: MyDataBase =mock[MyDataBase]
  val c=new MyConnector1{
    override val db: MyDataBase =mockMyDase
  }
  "calling myConnector" should {
    "return allowed " in {
      when(mockMyDase.getData("Andrew")).thenReturn("Allowed")
      c.connector("Andrew") shouldBe "ENTER"
    }
  }
}
