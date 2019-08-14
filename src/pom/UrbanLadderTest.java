package pom;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UrbanLadderTest {
	public static void Wr(String Sheetname,int rownum,int cellnum,String data) throws EncryptedDocumentException, InvalidFormatException, IOException {
	FileInputStream fis=new FileInputStream("./Sheet1.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	wb.getSheet(Sheetname).createRow(rownum).createCell(cellnum).setCellValue(data);
	FileOutputStream fio=new FileOutputStream("./Sheet1.xlsx");
	wb.write(fio);
	wb.close();
	}
}
