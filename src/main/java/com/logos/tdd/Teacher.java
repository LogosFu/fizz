package com.logos.tdd;

import java.util.stream.IntStream;
import org.junit.platform.commons.util.StringUtils;

public class Teacher {

  public static void main(String[] args) {
    IntStream.range(1, Integer.MAX_VALUE).forEach(i -> System.out.println(fizzBuzz(i)));
  }

  protected static String fizzBuzz(Integer i) {
    if (i.toString().contains("7")) {
      return getSpecialRuleOfMultipleForHave7(i);
    }
    if (i.toString().contains("5")) {
      return getSpecialRuleOfMultipleForHave5(i);
    }
    if (i.toString().contains("3")) {
      return getRuleForHave3();
    }
    return getSpecialRuleOfMultiple(i);
  }

  private static String getSpecialRuleOfMultipleForHave7(Integer i) {
    if (i.toString().contains("3")){
     return getRuleForHave3();
    }
    String result = "";
    if (isMultipleOfNumber(i, 3)) {
      result += "Fizz";
    }
    if (isMultipleOfNumber(i, 7)) {
      result += "Whizz";
    }
    result = normalRule(i, result);
    return result;
  }

  private static String getRuleForHave3() {
    return "Fizz";
  }

  private static String getSpecialRuleOfMultipleForHave5(Integer i) {
    String result = "";
    if (isMultipleOfNumber(i, 5)) {
      result += "Buzz";
    }
    if (isMultipleOfNumber(i, 7)) {
      result += "Whizz";
    }
    result = normalRule(i, result);
    return result;
  }

  private static String getSpecialRuleOfMultiple(Integer i) {
    String result = "";
    if (isMultipleOfNumber(i, 3)) {
      result += "Fizz";
    }
    if (isMultipleOfNumber(i, 5)) {
      result += "Buzz";
    }
    if (isMultipleOfNumber(i, 7)) {
      result += "Whizz";
    }
    result = normalRule(i, result);
    return result;
  }

  private static String normalRule(Integer i, String result) {
    if (StringUtils.isBlank(result)) {
      result = i.toString();
    }
    return result;
  }

  private static boolean isMultipleOfNumber(Integer target, Integer number) {
    return target % number == 0;
  }
}
