package examples.example_161.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramFileWriter
{
	static void main(String[] args)
	{
		String[] lines = new String[] {
			"Good morning",
			"Good afternoon",
			"Good night"
		};
		
		String path = "C:\\temp\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) // true acrescenta ao arquivo
		{
			for(String line : lines)
			{
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
