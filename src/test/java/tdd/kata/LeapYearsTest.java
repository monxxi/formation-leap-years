package tdd.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeapYearsTest {

  @Test
  public void leapYear2000() {
    assertThat(LeapYear.isLeapYear(2000)).isTrue();
  }

  @Test
  public void year2001() {
    assertThat(LeapYear.isLeapYear(2001)).isFalse();
  }

  @Test
  public void year400() {
    assertThat(LeapYear.isLeapYear(400)).isTrue();
  }

  @Test
  public void year2004() {
    assertThat(LeapYear.isLeapYear(2004)).isTrue();
  }
}
