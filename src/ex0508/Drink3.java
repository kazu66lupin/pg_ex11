package ex0508;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drink3 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("飲み物は何が好きですか？");
			System.out.println("a オレンジジュース");
			System.out.println("b コーヒー");
			System.out.println("c どちらでもない");
			System.out.println("a,b,cのどれかを選んでください。");
			String line = reader.readLine();
			char c;
			if (line.length() > 0) {
				c = line.charAt(0);
			} else {
				c = 'c';
			}
			switch (c) {
			case 'a':
				System.out.println("オレンジジュースです。");
				break;

			case 'b':
				System.out.println("コーヒーです。");
				break;

			default:
				System.out.println("どちらでもありません。");
				break;
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
