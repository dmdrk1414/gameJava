import org.example.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.assertj.core.api.Assertions.*;

class MainTest  {
    @Test
    @DisplayName("main Test")
     void test () throws Exception {
        //given
        Main main = new Main();

        //when
        int t = main.test();

        //then
        assertThat(t).isEqualTo(1);

    }
}
