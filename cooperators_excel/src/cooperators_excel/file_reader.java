package cooperators_excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class file_reader {
	
	public static client_full[] read_client_full() throws Exception{
		
		File excel = new File("files/SampleXL1_11112019.xlsx");
    	FileInputStream fis = new FileInputStream(excel);
    	XSSFWorkbook book = new XSSFWorkbook(fis);
    	XSSFSheet sheet = book.getSheetAt(0);
    	
    	int size = sheet.getLastRowNum();
    	client_full[] client_list = new client_full[size];
    	
    	Iterator<Row> itr = sheet.iterator();
    	itr.next();
    	int index = 0;
    	
    	while (itr.hasNext()) {
            Row row = itr.next();


            String city = row.getCell(0).getStringCellValue();
            
            String prov = "";
        	if (row.getCell(1) != null) {prov = row.getCell(1).getStringCellValue();}

        	String country = row.getCell(2).getStringCellValue();

        	String cif_party_id = row.getCell(3).getStringCellValue();

        	String admin_client = row.getCell(4).getStringCellValue();
               
             
            client_list[index] = new client_full(city, prov, country, cif_party_id, admin_client);
            index++;
    	}
    	
    
    	book.close();
    	return client_list;
	}
	
	public static client_search[] read_search_clients() throws Exception{
		
		File excel = new File("files/SampleXL2_11112019.xlsx");
    	FileInputStream fis = new FileInputStream(excel);
    	XSSFWorkbook book = new XSSFWorkbook(fis);
    	XSSFSheet sheet = book.getSheetAt(0);
    	
    	int size = sheet.getLastRowNum();
    	client_search[] client_list = new client_search[size];
    	
    	Iterator<Row> itr = sheet.iterator();
    	itr.next();
    	int index = 0;
    	
    	while (itr.hasNext()) {
            Row row = itr.next();

            String pid = row.getCell(0).getStringCellValue();
            
            String prov = "";
        	if (row.getCell(1) != null) {prov = row.getCell(1).getStringCellValue();}
                   
            client_list[index] = new client_search(prov, pid);
            index++;
    	}
    	
    
    	book.close();
    	return client_list;
	}
}
