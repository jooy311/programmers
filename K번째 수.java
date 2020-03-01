import java.util.*;
import java.io.*;

public class solution {
	public static int[] solution(int[] array, int[][] commands) {
		int i, j, k;
		int[] answer = new int[commands.length];// commands함수에서 나오는 각각의 값을 배열에 담는 정답배열
		int[] test;
		int length; // i부터 j까지의 길이를 구하기 위한 길이(j-i)
		
		for (int t = 0; t < (commands.length); t++) { // commands의 행의 갯수만큼돌때
			i = commands[t][0]; // 시작
			j = commands[t][1]; // 끝
			k = commands[t][2]; // k번재 숫자
			length = (j - i);
			test = new int[length + 1];
			int temp = 0;
			for (int s = i - 1; s < j; s++)
				test[temp++] = array[s];
			Arrays.sort(test); //sort해주는거를 바로위의 for문에 해서 오류가 계속 발생했음.
			answer[t] = test[k - 1];// array에서 ij에 해당하는 k번재 수를 이제 구하면 됨
		} // 첫번재 for문 끝
		return answer;
	}
}
