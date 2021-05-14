package deneme;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaIO {

	public static void main(String[] args) throws IOException {
		File myFile = new File("file.txt");
		myFile.createNewFile();
		
		Scanner fileReader = new Scanner(myFile);
		
		FileWriter fileWriter = new FileWriter(myFile);
		
		fileWriter.write("Merhaba");
		fileWriter.write("\nBen Dilruba");
		fileWriter.flush();
		while(fileReader.hasNext())
			System.out.println(fileReader.next());
		
		fileReader.close();
		fileWriter.close();
		
		bufferedWriterAndReader();
	}

	private static void bufferedWriterAndReader() throws IOException {
		
		File mySecondFile = new File("buffer.txt");
		FileWriter buffer = new FileWriter(mySecondFile);
		BufferedWriter bufferedWriter = new BufferedWriter(buffer);
		
		FileReader read = new FileReader(mySecondFile);
		BufferedReader bufferedReader = new BufferedReader(read);
		
		bufferedWriter.write(15);
		bufferedWriter.newLine();
		bufferedWriter.append("Merhaba 15").append(" \n Merhaba dünya");
		bufferedWriter.flush();
		
		for(int i=0; i<12; i++)
			System.out.println((char) bufferedReader.read());
		System.out.println(bufferedReader.readLine());
		System.out.println(bufferedReader.readLine());
		bufferedWriter.close();
		bufferedReader.close();
	}

}
