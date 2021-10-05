package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.DataProvider;

public class WebBase 
{
	@DataProvider(name="Login Data")
	public String[][] getLoginData()
	{
		
		String loginData[][]= {{"admin","admin123"},{"ess","ess,123"}};
		return loginData;
		
	 }
	@DataProvider(name="LoginCSVData")
	public String[][]getLoginCSVData()throws IOException
	{
		String fileName="C:\\Users\\Piyush\\eclipse-workspace\\selenium-automation-framework\\src\\main\\resources\\txt file";
		File file=new File(fileName);
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String loginData[][]=new String[3][2];
		String line;
		
		int i=0;
		while((line=br.readLine())!=null)
		{
			String []data=line.split(",");
			loginData [i]=data;
			i++;
		}
		return loginData;
	}
	
}
