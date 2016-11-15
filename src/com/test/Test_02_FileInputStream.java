package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test_02_FileInputStream {
	
	public void fileRead(){
		//데이터를 입력할 파일 객체를 하나 만들자
		File file = new File("C:/Users/Jeong Woo suk/Documents/test.txt");
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream(file);
			
			//파일을 바이트 배열로 읽어오기 위한 변수
			byte[] tmp = new byte[2];
			int size = 0;
			int totalSize = 0;
			while((size = fis.read(tmp))>0){
				String str = new String(tmp);
				System.out.print(str);
				totalSize += size;
			}
			
			System.out.println(totalSize);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Test_02_FileInputStream obj = new Test_02_FileInputStream();
		obj.fileRead();
	}
	
}
