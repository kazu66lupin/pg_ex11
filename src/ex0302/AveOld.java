package ex0302;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AveOld {
	public static void main(String[] args){
		System.out.println("一人目の年齢を入力してください");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = reader.readLine();
			int toshi1 = Integer.parseInt(line);
			System.out.println("二人目の年齢を入力してください");
			String line2 = reader.readLine();
			int toshi2 = Integer.parseInt(line2);
			double ave = (double)(toshi1+toshi2)/2;
			System.out.println("二人の平均年齢はです。" + ave);
		}catch(IOException e){
			System.out.println(e);
		}catch(NumberFormatException e){
			System.out.println("年齢が正しくありません");
		}
	}
}
