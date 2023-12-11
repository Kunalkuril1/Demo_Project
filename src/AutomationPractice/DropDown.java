package AutomationPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DropDown {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Automation Project\\Software\\chromedriver-win64\\chromedriver.exe"); // set the broswer exe path

		FileInputStream fis = new FileInputStream("D:\\Java\\Book1.xlsx");

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sh = wb.getSheet("Sheet1");

		int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();

		for (int i = 0; i <= rowCount; i++) {

			Row rw = sh.getRow(i);

			for (int j = 0; j <= rw.getLastCellNum(); j++) {
				System.out.println(rw.getCell(j).getStringCellValue() + " ");
			}
		}

	}

}
