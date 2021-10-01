package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader
{
	public static void main(String[] args)throws IOException
	{
		String fileName="C:\\Users\\Piyush\\eclipse-workspace\\selenium-automation-framework\\src\\main\\resources\\txt file";
		File file=new File(fileName);
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
	}

}
