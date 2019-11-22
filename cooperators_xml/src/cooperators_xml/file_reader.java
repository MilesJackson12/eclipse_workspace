package cooperators_xml;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class file_reader {
	public static mismatch_line read_data() throws Exception{
		mismatch_line output = new mismatch_line();
		mismatch_line curr = output;
		
		Reader xml1 = new BufferedReader(new FileReader(""));
    	BufferedReader buff1 = new BufferedReader(xml1);
    	
    	Reader xml2 = new BufferedReader(new FileReader(""));
    	BufferedReader buff2 = new BufferedReader(xml2);
    	
    	String xml1line = buff1.readLine();
    	String xml2line = buff2.readLine();
    	
    	while (xml1line != null || xml2line != null) {
    		if (xml1line != xml2line) {
    			mismatch_line mismatch = new mismatch_line(xml1line, xml2line);
    			curr.add_next(mismatch);
    			curr = mismatch;
    		}
    		xml1line = buff1.readLine();
    		xml2line = buff2.readLine();
    		
    	}
    	
    	buff1.close();
    	buff2.close();
    	
    	return output;
	}
    	
}
