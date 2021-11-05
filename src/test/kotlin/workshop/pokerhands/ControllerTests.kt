package workshop.pokerhands

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get


@WebMvcTest(CoolController::class)
internal class ControllerTests {
    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun doSomethingCool() {
        mockMvc.get("/coolstuff")
            .andExpect {
                status { isOk() }
            }
    }
}