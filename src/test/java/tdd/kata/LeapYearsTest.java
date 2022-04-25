package tdd.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeapYearsTest {

    @Test
    public void leapYear2000() {
        assertThat(Years.isLeapYear(2000)).isTrue();
    }

    @Test
    public void year2001() {
        assertThat(Years.isLeapYear(2001)).isFalse();
    }

    @Test
    public void year400() {
        assertThat(Years.isLeapYear(400)).isTrue();
    }

    @Test
    public void year2008() {
        assertThat(Years.isLeapYear(2008)).isTrue();
    }

  @Test
  public void year1900() {
    assertThat(Years.isLeapYear(1900)).isFalse();
  }

  @Test
  public void year1700() {
    assertThat(Years.isLeapYear(1700)).isFalse();
  }

}
