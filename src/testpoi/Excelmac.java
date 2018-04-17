package testpoi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;

public class Excelmac {
	public static XSSFWorkbook wb;

	public static XSSFSheet sheet;

	public static XSSFRow row;

	public static XSSFCell cell;

	public static FileInputStream fis;
	
//	public static OutputStream fis1;

	public static void main(String[] args) throws IOException {

	// TODO Auto-generated method stub

	String value=getCelldata(1,0);

	System.out.println(value);

//	String value1=getCelldata(1,0);
//
//	System.out.println(value1);

	String value2=setCelldata("hello1",3,1);

	System.out.println(value2);

	}

	private static String setCellvalue(int i, int j) {

		// TODO Auto-generated method stub

		return null;

		}

		public static String getCelldata( int rownum,int col) throws IOException

		{

		fis =new FileInputStream("/Users/arnabbhuiya/Documents/poiTest.xlsx");
			
		wb=new XSSFWorkbook(fis);

		sheet=wb.getSheet("script");

		row=sheet.getRow(rownum);

		cell=row.getCell(col);

		return cell.getStringCellValue();

		}

		public static String setCelldata(String text,int rownum,int col) throws IOException

		{

		fis =new FileInputStream("/Users/arnabbhuiya/Documents/poiTest.xlsx");
		
		wb=new XSSFWorkbook(fis);

		sheet=wb.getSheet("script");

		row=sheet.getRow(rownum);

		cell=row.getCell(col);

		cell.setCellValue(text);

		
		
		FileOutputStream fos = new FileOutputStream("/Users/arnabbhuiya/Documents/poiTest.xlsx");
		wb.write(fos);
		fos.close();
		String celldata1= cell.getStringCellValue();
		return celldata1;

		}


} 
