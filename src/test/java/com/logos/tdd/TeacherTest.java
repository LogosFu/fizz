package com.logos.tdd;

import static com.logos.tdd.Teacher.fizzBuzz;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TeacherTest {

  @ParameterizedTest
  @CsvSource({"1,1", "2,2", "4,4", "1294,1294"})
  void should_return_number_when_fizz_buzz_given_number_normal(Integer given, String number) {
    final String fizzBuzzResult = fizzBuzz(given);
    assertThat(fizzBuzzResult).isEqualTo(number);
  }

  @ParameterizedTest
  @CsvSource({"3,Fizz", "6,Fizz", "3333,Fizz"})
  void shouldReturnFizzWhenFizzBuzzGivenNumberMultipleOf3(Integer given, String number) {
    final String fizzBuzzResult = fizzBuzz(given);
    assertThat(fizzBuzzResult).isEqualTo(number);
  }

  @ParameterizedTest
  @CsvSource({"5,Buzz", "10,Buzz", "5555,Buzz"})
  void shouldReturnBuzzWhenFizzBuzzGivenNumberMultipleOf5(Integer given, String number) {
    final String fizzBuzzResult = fizzBuzz(given);
    assertThat(fizzBuzzResult).isEqualTo(number);
  }

  @ParameterizedTest
  @CsvSource({"7,Whizz", "14,Whizz", "77,Whizz"})
  void shouldReturnWhizzWhenFizzBuzzGivenNumberMultipleOf7(Integer given, String number) {
    final String fizzBuzzResult = fizzBuzz(given);
    assertThat(fizzBuzzResult).isEqualTo(number);
  }

  @ParameterizedTest
  @CsvSource({"1200,FizzBuzz", "600,FizzBuzz", "900,FizzBuzz"})
  void shouldReturnFizzBuzzWhenFizzBuzzGivenNumberMultipleOf3And5(Integer given, String number) {
    final String fizzBuzzResult = fizzBuzz(given);
    assertThat(fizzBuzzResult).isEqualTo(number);
  }

  @ParameterizedTest
  @CsvSource({"770,Whizz", "70,Whizz", "700,Whizz"})
  void shouldReturnBuzzWhizzWhenFizzBuzzGivenNumberMultipleOf7And5(Integer given, String number) {
    final String fizzBuzzResult = fizzBuzz(given);
    assertThat(fizzBuzzResult).isEqualTo(number);
  }

  @ParameterizedTest
  @CsvSource({"420,FizzBuzzWhizz", "8190,FizzBuzzWhizz"})
  void shouldReturnFizzBuzzWhizzWhenFizzBuzzGivenNumberMultipleOf7And5(Integer given,
      String number) {
    final String fizzBuzzResult = fizzBuzz(given);
    assertThat(fizzBuzzResult).isEqualTo(number);
  }

  @ParameterizedTest
  @CsvSource({"13,Fizz", "13,Fizz", "33,Fizz"})
  void shouldReturnFizzWhenFizzBuzzGivenNumberHas3(Integer given, String number) {
    final String fizzBuzzResult = fizzBuzz(given);
    assertThat(fizzBuzzResult).isEqualTo(number);
  }

  @ParameterizedTest
  @CsvSource({"35,BuzzWhizz", "65,Buzz", "95,Buzz"})
  void shouldReturnResultWhenFizzBuzzGivenNumberHas5(Integer given, String number) {
    final String fizzBuzzResult = fizzBuzz(given);
    assertThat(fizzBuzzResult).isEqualTo(number);
  }

  @ParameterizedTest
  @CsvSource({"17,17", "65,Buzz", "95,Buzz"})
  void shouldReturnResultWhenFizzBuzzGivenNumberHas7(Integer given, String number) {
    final String fizzBuzzResult = fizzBuzz(given);
    assertThat(fizzBuzzResult).isEqualTo(number);
  }
}