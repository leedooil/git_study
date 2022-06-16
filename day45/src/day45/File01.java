package day45;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File01 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		fis = new FileInputStream("prac.txt");
		fos = new FileOutputStream("result.txt");
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int data;
		while((data=fis.read())!=-1) {
			bos.write(data);
		}
		bos.close();
		bis.close();
	}

}
