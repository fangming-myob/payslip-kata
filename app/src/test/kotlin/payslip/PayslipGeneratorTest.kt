/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package payslip

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class PayslipGeneratorTest() : DescribeSpec({
    describe("Payslip generator") {
        it("should return payslip with gross income 0, income tax 0, net income 0 when annual salary is 0") {
            PayslipGenerator().generate(0) shouldBe Payslip(0, 0, 0)
        }
    }
})
