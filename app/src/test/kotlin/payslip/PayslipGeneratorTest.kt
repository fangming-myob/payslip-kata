/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package payslip

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class PayslipGeneratorTest() : DescribeSpec({
    describe("Payslip generator") {
        it("should return payslip with gross income 0, income tax 0, net income 0 when annual salary is 0") {
            PayslipGenerator.generate(0) shouldBe Payslip(0, 0, 0)
        }

        it("should return payslip with gross income 833, income tax 0, net income 833 when annual salary is 10,000") {
            PayslipGenerator.generate(10_000) shouldBe Payslip(833, 0, 833)
        }

        it("should return payslip with gross income 1517, income tax 0, net income 1517 when annual salary is 18,200") {
            PayslipGenerator.generate(18_200) shouldBe Payslip(1517, 0, 1517)
        }

        it("should return payslip with gross income 1667, income tax 29, net income 1638 when annual salary is 20,000") {
            PayslipGenerator.generate(20_000) shouldBe Payslip(1667, 29, 1638)
        }

        it("should return payslip with gross income 3083, income tax 298, net income 2785 when annual salary is 37,000") {
            PayslipGenerator.generate(37_000) shouldBe Payslip(3083, 298, 2785)
        }

        it("should return payslip with gross income 3529, income tax 442, net income 3087 when annual salary is 42,345") {
            PayslipGenerator.generate(42_345) shouldBe Payslip(3529, 442, 3087)
        }

        it("should return payslip with gross income 7250, income tax 1652, net income 5598 when annual salary is 87,000") {
            PayslipGenerator.generate(87_000) shouldBe Payslip(7250, 1652, 5598)
        }

        it("should return payslip with gross income 12696, income tax 3667, net income 9029 when annual salary is 152,350") {
            PayslipGenerator.generate(152_350) shouldBe Payslip(12696, 3667, 9029)
        }

        it("should return payslip with gross income 15000, income tax 4519, net income 10481 when annual salary is 180,000") {
            PayslipGenerator.generate(180_000) shouldBe Payslip(15000, 4519, 10481)
        }
    }
})
