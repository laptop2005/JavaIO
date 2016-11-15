package com.test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test_04_BufferedInputStream {
	public void fileRead(){
		//�����͸� �Է��� ���� ��ü�� �ϳ� ������
		File file = new File("C:/Users/Jeong Woo suk/Documents/test.txt");
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis, 1024);
			
			//������ ����Ʈ �迭�� �о���� ���� ����
			byte[] tmp = new byte[1024];
			int size = 0;
			long totalSize = 0;
			while((size = bis.read(tmp))!=-1){
				String str = new String(tmp,0,size);
				System.out.print(str);
				totalSize += size;
			}
			
			System.out.println(totalSize);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bis!=null){
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Test_04_BufferedInputStream obj = new Test_04_BufferedInputStream();
		obj.fileRead();
	}
}
