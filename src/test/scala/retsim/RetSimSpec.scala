package org.retirement.simulator
package retsim

import org.scalactic.{Equality, TolerantNumerics, TypeCheckedTripleEquals}
import org.scalatest.{Matchers, WordSpec}

class RetSimSpec extends WordSpec with Matchers with TypeCheckedTripleEquals {
  implicit val doubleEquality: Equality[Double] = TolerantNumerics.tolerantDoubleEquality(0.0001)

  "RetSim.futureCapital" should {
    "simulate the amount of savings I will have in n months" in {
      val actual = RetSim.futureCapital(
        interestRate = 0.04 / 12, nbOfMonths = 25 * 12,
        netIncome = 3000, currentExpenses = 2000,
        initialCapital = 10000
      )
      val expected = 541267.1990
      actual should ===(expected)
    }
  }
}
