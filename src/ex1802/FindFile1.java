package ex1802;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FindFile1 {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("使用法：java FindFile1 検索文字列 検索対象ファイル名");
			System.out.println("例：java FindFile1 System FindFile1.java");
			System.exit(0);
		}
		String string = args[0];
		String filename = args[1];
		try {
			int linenum = 1;
			String line;
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			while ((line = reader.readLine()) != null) {
				int n = line.indexOf(string);
				if (n >= 0) {
					System.out.println(linenum + ":" + line);
				}
				linenum++;
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println(filename + "が見つかりません。");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
