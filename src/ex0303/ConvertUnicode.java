package ex0303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertUnicode {
	public static void main(String[] args) {
		System.out.println("文字列を入力してください");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			for (int i = 0; i < line.length(); i++) {
				System.out.println("'" + line.charAt(i) + "	'の文字コードは" + (line.charAt(i) + 0) + "です。");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
