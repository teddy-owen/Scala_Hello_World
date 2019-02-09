class CubeCalculatorTest extends org.scalatest.FunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(1) === 1)
    assert(CubeCalculator.cube(2) === 8)
    assert(CubeCalculator.cube(3) === 27)
    assert(CubeCalculator.cube(4) === 64)
  }
}
