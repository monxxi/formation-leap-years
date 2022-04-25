package tdd.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeapYearsTest {

    @Test
    public void leapYear2000() {
       // Given

       // When

       // Then
        assertThat(LeapYear.isLeapYear(2000)).isTrue();
    }

}