package ex0403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeAisatsu {
	public static void main(String[] args) {
		System.out.println("現在の時刻を入力してください");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			int t = Integer.parseInt(line);
			if (0 <= t && t <= 11) {
				System.out.println("おはようございます");
			} else if (t == 12) {
				System.out.println("お昼です");
			} else if (13 <= t && t <= 18) {
				System.out.println("こんにちは");
			} else if (19 <= t && t <= 23) {
				System.out.println("こんばんは");
			} else {
				System.out.println("時刻の範囲を超えています");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
