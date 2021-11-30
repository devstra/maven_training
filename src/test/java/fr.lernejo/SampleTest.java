package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void fact_of_2_should_produce_2() {
        Sample s = new Sample();
        int num = 2;
        int factoriel = s.fact(num); // (2)
        Assertions.assertThat(factoriel).as("!2")
            .isEqualTo(2); // (2)
    }
    @Test
    void fact_of_negativ_should_throw_excpetion(){
        Sample s = new Sample();
        int num = -1;
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(()->s.fact(num));
    }
    @Test
    void sum_of_1_and_2_should_produce_3(){
        Sample s = new Sample();
        int a= 1;
        int b = 2;
        int sum = 1+2;
        Assertions.assertThat(s.op(Sample.Operation.ADD,a,b)).as("1+2").isEqualTo(3);
    }

    @Test
    void sum_of_3_and_5_should_produce_8(){
        Sample s = new Sample();
        int a= 3;
        int b = 5;
        int sum = a+b;
        Assertions.assertThat(s.op(Sample.Operation.ADD,a,b)).as("3+5").isEqualTo(8);
    }

    @Test
    void mult_of_5_and_4_should_produce_20(){
        Sample s = new Sample();
        int a = 5;
        int b = 4;
        int mult= 5*4;
        Assertions.assertThat(s.op(Sample.Operation.MULT,a,b)).as("5 * 4").isEqualTo(20);
    }

    @Test
    void mult_of_4_and_4_should_produce_16(){
        Sample s = new Sample();
        int a = 4;
        int b = 4;
        int mult= a*b;
        Assertions.assertThat(s.op(Sample.Operation.MULT,a,b)).as("4 * 4").isEqualTo(16);
    }
}
