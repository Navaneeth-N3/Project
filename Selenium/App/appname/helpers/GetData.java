package com.appname.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData {
	
	public static String fromExcel(String filepath, String sheetName, 
			int rIndex, int cIndex)
	{
		String data = null;
		File  f = new File(filepath);
		try{
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
					
			Sheet st = wb.getSheet(sheetName);
			Row r = st.getRow(rIndex);
			Cell c = r.getCell(cIndex);
			data = c.toString();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
	public static String fromProperties(String filepath, String key)
	{
		String value = null;
		File f = new File(filepath);
		FileInputStream fis;
		try 
		{
			fis = new FileInputStream(f);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}	
		return  value;
	}

}
