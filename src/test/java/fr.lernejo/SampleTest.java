package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {

    @Test
    void test_fact_1() {
        Sample s = new Sample();
        Assertions.assertThat(s.fact(6)).as("!6")
            .isEqualTo(720);
    }

    @Test
    void test_fact_2() {
        Sample s = new Sample();
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> s.fact(-1));
    }

    @Test
    void test_add_operation() {
        Sample s = new Sample();
        Assertions.assertThat(s.op(Sample.Operation.ADD, 4, 42)).as("4 + 42").isEqualTo(46);
    }

    @Test
    void test_mult_operation() {
        Sample s = new Sample();
        Assertions.assertThat(s.op(Sample.Operation.MULT, 4, 25)).as("4 * 25").isEqualTo(100);
    }
}
