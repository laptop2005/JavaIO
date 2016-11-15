package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test_06_FileReader {
	public void fileRead(){
		File file = new File("C:/Users/Jeong Woo suk/Documents/test.txt");
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			
			//FileInputStream은 byte배열로 가져오는 반면 FileOutputStream은 char배열로 가져와 좀 더 문자에 특화되어 있다고 할 수 있고
			//char는 2바이트 기 때문에 한글도 깨지지 않는다
			char[] tmp = new char[1];
			while(fr.read(tmp)!=-1){
				String str = new String(tmp);
				System.out.print(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Test_06_FileReader obj = new Test_06_FileReader();
		obj.fileRead();
	}
}
