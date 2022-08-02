package day33;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		FileOutputStream file = new FileOutputStream("D:\\RahulShetty\\Data1.xlsx");
		
		
		XSSFWorkbook workbook= new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("data");

		// Same Data
	/*	for(int r=0; r < 5; r++)
		{
			XSSFRow row= sheet.createRow(r);
			for(int c=0; c<3;c++)
			{
				XSSFCell cell = row.createCell(c);
				cell.setCellValue("WELCOME");
				//row.createCell(c).setCellValue("WELCOME");
			}
		} */
		
		// Different data
		for(int r=0; r < 5; r++)
		{
			XSSFRow row= sheet.createRow(r);
			System.out.println("Row no :"+r);
			for(int c=0; c<3;c++)
			{
				XSSFCell cell = row.createCell(c);
				System.out.print("Enter the data for cell no :"+c+" of Row no :"+r);
				String input_data= scan.next();
				cell.setCellValue(input_data);
				//row.createCell(c).setCellValue("WELCOME");
			}
			
			
		}
		
		workbook.write(file);
		workbook.close();
		file.close();
	}
}
