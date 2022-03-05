package com.company.programmers.p20220305;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/81301?language=java
 *
 * 숫자 문자열과 영단어
 * 다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
 *
 * 1478 → "one4seveneight"
 * 234567 → "23four5six7"
 * 10203 → "1zerotwozero3"
 * 이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ s의 길이 ≤ 50
 * s가 "zero" 또는 "0"으로 시작하는 경우는 주어지지 않습니다.
 * return 값이 1 이상 2,000,000,000 이하의 정수가 되는 올바른 입력만 s로 주어집니다.
 */
public class NumberStrAndEnglishWords {

    private static final String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private static final String[] englishWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
    }

    public static int solution(String s) {
        return Integer.parseInt(replaceEnglishWordsToNumber(s));
    }

    private static String replaceEnglishWordsToNumber(String result) {
        for (int idx = 0; idx < englishWords.length; idx++) {
            result = result.replaceAll(englishWords[idx], number[idx]);
        }
        return result;
    }
}
