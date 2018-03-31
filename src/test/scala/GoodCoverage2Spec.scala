import org.specs2.mutable._

/**
 * Created by tbarke001c on 7/8/14.
 */
class Good2CoverageSpec extends Specification {

  "GoodCoverage2" should {
    "sum two numbers" in {
      GoodCoverage2.sum(1, 2) mustEqual 3
    }
  }
}
