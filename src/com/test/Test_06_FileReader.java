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
			
			//FileInputStream�� byte�迭�� �������� �ݸ� FileOutputStream�� char�迭�� ������ �� �� ���ڿ� Ưȭ�Ǿ� �ִٰ� �� �� �ְ�
			//char�� 2����Ʈ �� ������ �ѱ۵� ������ �ʴ´�
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
