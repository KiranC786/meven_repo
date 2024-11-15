
package webelement;

import java.io.FileInputStream;
import java.io.IOException;

import javax.print.DocFlavor.STRING;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;import com.google.common.collect.Table.Cell;
import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class FetchTheData {
	public static void main(String[] args ,Object STRING , Object NUMERIC ) throws EncryptedDocumentException,IOException  {
		FileInputStream filepath = new FileInputStream("./src/test/resource/facebooklogindata");
		Workbook workbook = WorkbookFactory.create(filepath);
		Sheet sheet = workbook.getSheetAt(0);
		int numofRow = sheet.getLastRowNum();
		int numofCell = sheet.getRow(0).getLastCellNum();
		for(int r =0;r<= numofRow;r++);{
		Row row = workbook.getSheetAt(0).getRow(r);
		for (int c=0;c<numofCell;c++)
		{row.getCell(c);
		 CellType celltype=cell.getCellType();
		 try {
			try {
				if (CellType.equals (STRING))
					 System.out.println(Cell.getStingcellvalue);
				 else if (CellType.equals(NUMERIC)) {
					 System.out.println(cell..getStingcellvalue);
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		}
		
		
	}

}
}
