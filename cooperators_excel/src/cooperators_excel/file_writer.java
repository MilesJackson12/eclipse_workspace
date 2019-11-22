package cooperators_excel;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class file_writer {

	public static void write_output(client_full[] client_list) throws Exception {

        XSSFWorkbook book = new XSSFWorkbook(); 
        XSSFSheet sheet = book.createSheet("student Details"); 
  
        int rownum = 0; 
        // this creates a new row in the sheet 
        Row row = sheet.createRow(rownum++); 
        Cell hcell = row.createCell(0); 
        hcell.setCellValue("CITY_NAME"); 
        
        Cell hcell2 = row.createCell(1); 
        hcell2.setCellValue("PROVINCE"); 
        
        Cell hcell3 = row.createCell(2); 
        hcell3.setCellValue("COUNTRY");
        
        Cell hcell4 = row.createCell(3); 
        hcell4.setCellValue("CIF_PARTY_ID"); 
        
        Cell hcell5 = row.createCell(4); 
        hcell5.setCellValue("ADMIN_CLIENT_ID"); 
        


        for (int i = 0; i < client_list.length; i++) {
        	row = sheet.createRow(rownum++); 
            // this line creates a cell in the next column of that row 
            Cell cell = row.createCell(0); 
            cell.setCellValue(client_list[i].city_name); 
            
            Cell cell2 = row.createCell(1); 
            cell2.setCellValue(client_list[i].province); 
            
            Cell cell3 = row.createCell(2); 
            cell3.setCellValue(client_list[i].country);
            
            Cell cell4 = row.createCell(3); 
            cell4.setCellValue(client_list[i].cif_party_id); 
            
            Cell cell5 = row.createCell(4); 
            cell5.setCellValue(client_list[i].admin_client); 
            

        } 
        
        try { 
            FileOutputStream out = new FileOutputStream(new File("files/output.xlsx")); 
            book.write(out); 
            out.close();
            book.close();
            System.out.println("Complete"); 
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
        } 
	    
	}
}
