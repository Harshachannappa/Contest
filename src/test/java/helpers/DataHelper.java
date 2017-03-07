package helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DataHelper {

	public static HashMap<String,String> storeValues = new HashMap();


	public static List<HashMap<String,String>> data()
	{


		List<HashMap<String,String>> mydata = new ArrayList<>();//Change the compatitble to JRE 7
		try
		{

			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//testData/TestData-seleniumframework.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheet("TestData");
			//Row HeaderRow = sheet.getRow(0);
			
			//mydata.sheet.getRow(1).getCell(0).getStringCellValue();
	    	
			//mydata.add("password",sheet.getRow(1).getCell(1).getStringCellValue());
		
				HashMap<String,String> currentHash = new HashMap<String,String>();
				
				currentHash.put("username",sheet.getRow(1).getCell(0).getStringCellValue());
		    	
				currentHash.put("password",sheet.getRow(1).getCell(1).getStringCellValue());
				
				//currentHash.put(sheet.getRow(1).getCell(0).getStringCellValue(), sheet.getRow(1).getCell(1).getStringCellValue());
				mydata.add(currentHash);
				//System.out.println(currentHash);
				//System.out.println(mydata);
				fs.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return mydata;

	}
	
	
	public static List<HashMap<String,String>> write(int i,String price, String result)
	{
	try {
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//testData/TestData-seleniumframework.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheet("Result");	
		System.out.println("Entered Excel");
		
			sheet.createRow(i).createCell(1).setCellValue(result);
			sheet.createRow(i).createCell(2).setCellValue(price);
		
		
		
		FileOutputStream fout=new FileOutputStream(new File(System.getProperty("user.dir")+"//src//test//resources//testData/TestData-seleniumframework.xlsx"));
		workbook.write(fout);
		fout.close();
		System.out.println("Excel Updated");
	    	} 
	
	    	catch (Exception e) {
	    		
	    		}
	return null;
		
		}
		
}
