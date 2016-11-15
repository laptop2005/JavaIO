package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class Test_01_FileOutputStream {
	
	public void fileWrite(){
		
		Calendar calendar = Calendar.getInstance();
		long startTimeMilli = calendar.getTimeInMillis();
		
		//�����͸� �Է��� ���� ��ü�� �ϳ� ������
		File file = new File("C:/Users/Jeong Woo suk/Documents/test.txt");
		
		//���࿡ ������ �������� ������ ���� ������ ����
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		FileOutputStream fos = null;
		
		try {
			
			//������� ��Ʈ���� ������ ���� ��ü�� �����ڸ� ���� �����鼭 ��ü�� ��������
			fos = new FileOutputStream(file);
//			fos = new FileOutputStream(file,true);
			
			//���Ͽ� �� ����
			String content1 = "Hello FileOutputStream!";
			String newline = "\r\n";
			String content2 = "Hi FileOutputStream;;";
			String content3 = "�ȹ��ȹ��ȹ̾�";
			
			//���Ͽ� ����
			for(int inx=0;inx<100000;inx++){
				fos.write(content1.getBytes());
				fos.write(newline.getBytes());
				fos.write(content2.getBytes());
				fos.write(newline.getBytes());
				fos.write(content3.getBytes());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { //���Ͽ� �� ������ ������� ��Ʈ���� ����
			if(fos!=null){
				try {
					fos.close();
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
		Test_01_FileOutputStream obj = new Test_01_FileOutputStream();
		obj.fileWrite();
	}
	
}
