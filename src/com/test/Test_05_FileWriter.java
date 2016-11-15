package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Test_05_FileWriter {
	public void fileWrite(){
		File file = new File("C:/Users/Jeong Woo suk/Documents/test.txt");
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			
			//파일에 쓸 내용
			String content1 = "Hello FileOutputStream!";
			String newline = "\r\n";
			String content2 = "Hi FileOutputStream;;";
			String content3 = "픽미픽미픽미업";
			
			fw.write(content1.toCharArray());
			fw.write(newline.toCharArray());
			fw.write(content2.toCharArray());
			fw.write(newline.toCharArray());
			fw.write(content3.toCharArray());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fw!=null){
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
				
	}
	
	public static void main(String[] args) {
		Test_05_FileWriter obj = new Test_05_FileWriter();
		obj.fileWrite();
	}
}
