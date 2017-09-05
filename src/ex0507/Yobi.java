package ex0507;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yobi {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("0～6を入力してください。対応した曜日を表示します。");
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			switch (n) {
			case 0:
				System.out.println("日曜日です。");
				break;

			case 1:
				System.out.println("月曜日です。");
				break;

			case 2:
				System.out.println("火曜日です。");
				break;

			case 3:
				System.out.println("水曜日です。");
				break;

			case 4:
				System.out.println("木曜日です。");
				break;

			case 5:
				System.out.println("金曜日です。");
				break;

			case 6:
				System.out.println("土曜日です。");
				break;

			default:
				System.out.println("0～6の範囲で入力してください。");
				break;
			}
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字を入力してください。");
		}
	}
}
