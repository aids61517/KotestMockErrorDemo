package com.aids61517.kotestmockerrordemo

import com.aids61517.kotestmockerrordemo.demo.DemoHandler
import com.aids61517.kotestmockerrordemo.demo.Provider
import io.kotest.core.spec.style.DescribeSpec
import io.mockk.coEvery
import io.mockk.mockk
import org.junit.Assert

class DemoHandlerTest: DescribeSpec({
    val provider = mockk<Provider>()

    val demoHandler = DemoHandler(
        provider = provider
    )

    beforeSpec {
        coEvery { provider.getString() } returns "test"
    }

    context("Test fetch data") {
        describe("fetch data") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data1") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data2") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data3") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data4") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data5") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data6") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data7") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data8") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data9") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data10") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data11") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data12") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data13") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data14") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data15") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data16") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data17") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data18") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data19") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data20") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data21") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data22") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data23") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data24") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data25") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data26") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data27") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data28") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data29") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data30") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data31") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data32") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data33") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data34") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data35") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data36") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data37") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data38") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data39") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data40") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data41") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data42") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
        describe("fetch data43") {
            demoHandler.fetchData()

            it("data should not be null") {
                Assert.assertTrue(demoHandler.data != null)
            }
        }
    }
})