package day46;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class File02 {

	public static void main(String[] args) {
		FileReader fr;
		FileWriter fw;
		BufferedReader br;
		BufferedWriter bw;
		
		try {
			fr=new FileReader("prac.txt");
			fw=new FileWriter("result.txt");
			
			br=new BufferedReader(fr);
			bw=new BufferedWriter(fw);
			String line;
			while((line=br.readLine())!=null) {
				bw.write(line);
			}
			bw.close();
			br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
