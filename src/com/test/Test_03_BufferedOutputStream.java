package com.test;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class Test_03_BufferedOutputStream {
	public void fileWrite(){
		
		Calendar calendar = Calendar.getInstance();
		long startTimeMilli = calendar.getTimeInMillis();
		
		//데이터를 입력할 파일 객체를 하나 만들자
		File file = new File("C:/Users/Jeong Woo suk/Documents/test.txt");
		
		//만약에 파일이 존재하지 않으면 새로 만들라고 하자
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
			//파일출력 스트림에 생성한 파일 객체를 생성자를 통해 보내면서 객체를 생성하자
			fos = new FileOutputStream(file);
//			fos = new FileOutputStream(file,true);
			
			bos = new BufferedOutputStream(fos);
//			bos = new BufferedOutputStream(fos, 1024);
			
			//파일에 쓸 내용
			String content1 = "Hello FileOutputStream!";
			String newline = "\r\n";
			String content2 = "Hi FileOutputStream;;";
			String content3 = "픽미픽미픽미업";
			
			//파일에 쓴다
			for(int inx=0;inx<100000;inx++){
				bos.write(content1.getBytes());
				bos.write(newline.getBytes());
				bos.write(content2.getBytes());
				bos.write(newline.getBytes());
				bos.write(content3.getBytes());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { //파일에 다 썼으면 파일출력 스트림을 닫자
			if(bos!=null){
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		Calendar calendar2 = Calendar.getInstance();
		long endTimeMilli = calendar2.getTimeInMillis();
		
		System.out.println(endTimeMilli - startTimeMilli);
	}
	
	public static void main(String[] args) {
		Test_03_BufferedOutputStream obj = new Test_03_BufferedOutputStream();
		obj.fileWrite();
	}
}
