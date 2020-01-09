package com.logos.tdd;

import java.util.stream.IntStream;
import org.junit.platform.commons.util.StringUtils;

public class Teacher {

  public static void main(String[] args) {
    IntStream.range(1, Integer.MAX_VALUE).forEach(i -> System.out.println(fizzBuzz(i)));
  }

  protected static String fizzBuzz(Integer index) {
    if (index.toString().contains("7")) {
      return getSpecialRuleOfMultipleForHave7(index);
    }
    if (index.toString().contains("5")) {
      return getSpecialRuleOfMultipleForHave5(index);
    }
    if (index.toString().contains("3")) {
      return getRuleForHave3();
    }
    return getSpecialRuleOfMultiple(index);
  }

  private static String getSpecialRuleOfMultipleForHave7(Integer index) {
    if (index.toString().contains("3")) {
      return getRuleForHave3();
    }
    String result = "";
    if (isNumberMultipleOfOtherNumber(index, 3)) {
      result += "Fizz";
    }
    if (isNumberMultipleOfOtherNumber(index, 7)) {
      result += "Whizz";
    }
    result = toOrderToStringRole(index, result);
    return result;
  }

  private static String getRuleForHave3() {
    return "Fizz";
  }

  private static String getSpecialRuleOfMultipleForHave5(Integer index) {
    String result = "";
    if (isNumberMultipleOfOtherNumber(index, 5)) {
      result += "Buzz";
    }
    if (isNumberMultipleOfOtherNumber(index, 7)) {
      result += "Whizz";
    }
    result = toOrderToStringRole(index, result);
    return result;
  }

  private static String getSpecialRuleOfMultiple(Integer index) {
    String result = "";
    if (isNumberMultipleOfOtherNumber(index, 3)) {
      result += "Fizz";
    }
    if (isNumberMultipleOfOtherNumber(index, 5)) {
      result += "Buzz";
    }
    if (isNumberMultipleOfOtherNumber(index, 7)) {
      result += "Whizz";
    }
    result = toOrderToStringRole(index, result);
    return result;
  }

  private static String toOrderToStringRole(Integer order, String result) {
    if (StringUtils.isBlank(result)) {
      result = order.toString();
    }
    return result;
  }

  private static boolean isNumberMultipleOfOtherNumber(Integer number, Integer otherNumber) {
    return number % otherNumber == 0;
  }
}
