package coursera

import org.scalatest.funsuite.AnyFunSuite

class RecFunTest extends AnyFunSuite {

  import RecFun.*

  test("pascal: col=0, row=2 (edge of triangle)") {
    assert(pascal(0, 2) === 1)
  }

  test("pascal: col=1, row=2 (middle of triangle)") {
    assert(pascal(1, 2) === 2)
  }

  test("pascal: col=1, row=3") {
    assert(pascal(1, 3) === 3)
  }

  test("pascal: col=2, row=4") {
    assert(pascal(2, 4) === 6)
  }

  test("pascal: col=0, row=0 (top of triangle)") {
    assert(pascal(0, 0) === 1)
  }

  test("pascal: col=3, row=3 (edge of triangle)") {
    assert(pascal(3, 3) === 1)
  }

  test("pascal: col=5, row=5 (edge of triangle)") {
    assert(pascal(5, 5) === 1)
  }
}
