package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;

public class Test_08_InputStreamReader {
	public void fileRead(){
		Calendar calendar = Calendar.getInstance();
		long startTimeMilli = calendar.getTimeInMillis();
		
		File file = new File("C:/Users/Jeong Woo suk/Documents/test.txt");
		
		FileInputStream fis = null;
		InputStreamReader isr = null;
		
		try {
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis, "UTF-8");
			
			char[] tmp = new char[1];
			while(isr.read(tmp)!=-1){
				String str = new String(tmp);
				System.out.print(str);
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
			if(isr!=null){
				try {
					isr.close();
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
		Test_08_InputStreamReader obj = new Test_08_InputStreamReader();
		obj.fileRead();
	}
}
