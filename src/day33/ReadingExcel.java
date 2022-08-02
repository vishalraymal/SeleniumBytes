package day33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("D:\\RahulShetty\\Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int total_row = sheet.getLastRowNum();
		int total_cell= sheet.getRow(1).getLastCellNum();
		System.out.println("Rows:"+total_row);
		System.out.println("cells:"+total_cell);
		
		for(int i=0; i <= total_row;i++)
		{
			XSSFRow current_row= sheet.getRow(i);
			for(int j=0; j< total_cell; j++)
			{
				XSSFCell cell = current_row.getCell(j);
				String cellData= cell.toString();
				System.out.print(cellData+ "           |");
			}
			
			System.out.println();
		}
		workbook.close();
		file.close();
	}

}
