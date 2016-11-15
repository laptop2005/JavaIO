package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test_02_FileInputStream {
	
	public void fileRead(){
		//�����͸� �Է��� ���� ��ü�� �ϳ� ������
		File file = new File("C:/Users/Jeong Woo suk/Documents/test.txt");
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream(file);
			
			//������ ����Ʈ �迭�� �о���� ���� ����
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
