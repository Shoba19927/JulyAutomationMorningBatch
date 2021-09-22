package com.sgtesting.reflectiondemo;
import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReflectionDemo1 {

public static String path=null;
		public static void main(String[] args) {
		//	path=System.getProperty("user.dir");
			FileInputStream fin=null;
			Workbook wb=null;
			Sheet sh1=null;
			Sheet sh2=null;
			Sheet sh=null;
			Row row=null;
			Cell cell=null;
			try
			{
				//fin=new FileInputStream("D:\\ExampleAutomation\\Automation\\Web-Automation\\DataFiles\\Book1.xlsx");
				fin=new FileInputStream("D:\\ExampleAutomation\\Automation\\Web-Automation\\DataFiles\\Book2.xlsx");
				wb=new XSSFWorkbook(fin);
				
				int sc=wb.getNumberOfSheets();
				for(int i=0;i<sc;i++)
				{
				
					String sname=wb.getSheetName(i);
			        System.out.println(sname);
			        sh=wb.getSheet(sname);
			        int rc=sh.getPhysicalNumberOfRows();
			    
				for(int r=1;r<rc;r++)
				{
					row=sh.getRow(r);
					cell=row.getCell(0);
					String methodname=cell.getStringCellValue();
					cell=row.getCell(1);
					String pkgClassName=cell.getStringCellValue();

					System.out.println(methodname+ "  ---->  "+pkgClassName);

					Class cls=Class.forName(pkgClassName);
					Object obj=cls.newInstance();

					Method method=obj.getClass().getMethod(methodname, null);
					method.invoke(obj, null);
				}
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					fin.close();
					wb.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}

		}
	}

