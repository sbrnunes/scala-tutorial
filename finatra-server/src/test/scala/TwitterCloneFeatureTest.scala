import com.scala.tutorial.server.TutorialHttpServer
import com.twitter.finatra.http.test.EmbeddedHttpServer
import com.twitter.inject.server.FeatureTest

class TwitterCloneFeatureTest extends FeatureTest {

  val server = new EmbeddedHttpServer(
    twitterServer = new TutorialHttpServer)

}
