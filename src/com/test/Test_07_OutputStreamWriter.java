package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;

public class Test_07_OutputStreamWriter {
	public void fileWrite(){
		
		Calendar calendar = Calendar.getInstance();
		long startTimeMilli = calendar.getTimeInMillis();
		
		File file = new File("C:/Users/Jeong Woo suk/Documents/test.txt");
		
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		
		try {
			fos = new FileOutputStream(file);
			osw = new OutputStreamWriter(fos, "EUC-KR");
			
			//파일에 쓸 내용
			String content1 = "Hello FileOutputStream!";
			String newline = "\r\n";
			String content2 = "Hi FileOutputStream;;";
			String content3 = "픽미픽미픽미업";
			String content4 = "뷁똵꿗";
			
			for(int inx=0;inx<100000;inx++){
				osw.write(content1);
				osw.write(newline);
				osw.write(content2);
				osw.write(newline);
				osw.write(content3);
				osw.write(content4);
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
			if(osw!=null){
				try {
					osw.close();
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
		Test_07_OutputStreamWriter obj = new Test_07_OutputStreamWriter();
		obj.fileWrite();
	}
}
