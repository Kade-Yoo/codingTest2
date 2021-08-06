package com.company;

public class Solution {

	public int soulution(String S) {
		// 최댓값
		int result = 0;
		int serialNum = 1;
		int maxLength = getMaxLength(S);
		System.out.println(maxLength);
		char firstChar = S.charAt(0);
		// 풀이
		for (int index = 0; index < S.length() - 1; index++) {
			if (S.length() == index + 1) {
				result += (maxLength - serialNum);
			}

			if (S.charAt(index + 1) == firstChar) {
				serialNum = serialNum + 1;
				continue;
			}

			result += (maxLength - serialNum);
			firstChar = S.charAt(index + 1);
			serialNum = 1;
		}

		return result;
	}

	private int getMaxLength(String S) {
		int maxLength = 0;
		int serialNum = 0;
		char firstChar = S.charAt(0);
		for (int index = 0; index < S.length() - 1; index++) {
			if (S.charAt(index + 1) == firstChar) {
				serialNum = serialNum + 1;
			} else {
				serialNum = 0;
			}

			if (maxLength < serialNum) {
				maxLength = serialNum;
			}

			if (S.length() != index + 1) {
				firstChar = S.charAt(index + 1);
			}
		}

		return maxLength;
	}
}
