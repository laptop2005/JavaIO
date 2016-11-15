package com.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;

public class Test_09_BufferedWriter {
	public void fileWrite(){
		
		Calendar calendar = Calendar.getInstance();
		long startTimeMilli = calendar.getTimeInMillis();
		
		File file = new File("C:/Users/Jeong Woo suk/Documents/test.txt");
		
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try {
			fos = new FileOutputStream(file);
			osw = new OutputStreamWriter(fos,"UTF-8");
			bw = new BufferedWriter(osw, 1024);
			
			String content1 = "Hello FileOutputStream!";
			String newline = "\r\n";
			String content2 = "Hi FileOutputStream;;";
			String content3 = "픽미픽미픽미업";
			String content4 = "뷁똵꿗";
			
			for(int inx=0;inx<100000;inx++){
				bw.write(content1);
				bw.write(newline);
				bw.write(content2);
				bw.write(newline);
				bw.write(content3);
				bw.write(content4);
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
			if(bw!=null){
				try {
					bw.close();
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
		Test_09_BufferedWriter obj = new Test_09_BufferedWriter();
		obj.fileWrite();
	}
}
