package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;

public class Test_10_BufferedReader {
	public void fileRead(){
		Calendar calendar = Calendar.getInstance();
		long startTimeMilli = calendar.getTimeInMillis();
		
		//데이터를 입력할 파일 객체를 하나 만들자
		File file = new File("C:/Users/Jeong Woo suk/Documents/test.txt");
		
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis,"UTF-8");
			br = new BufferedReader(isr,1024);
			
			String line = null;
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		Calendar calendar2 = Calendar.getInstance();
		long endTimeMilli = calendar2.getTimeInMillis();
		
		System.out.println(endTimeMilli - startTimeMilli);
	}
	
	public static void main(String[] args) {
		Test_10_BufferedReader obj = new Test_10_BufferedReader();
		obj.fileRead();
	}
}
