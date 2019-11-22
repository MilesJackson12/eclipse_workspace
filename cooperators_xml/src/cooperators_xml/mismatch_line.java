package cooperators_xml;

public class mismatch_line {
	String xml1;
	String xml2;
	mismatch_line next;
	
	public mismatch_line() {
		xml1 = null;
		xml2 = null;
		next = null;
	}
	
	public mismatch_line(String xml1, String xml2) {
		this.xml1 = xml1;
		this.xml2 = xml2;
		this.next = null;
	}
	
	public void add_next(mismatch_line next) {
		this.next = next;
	}
	
	public void printstack() {
		System.out.println(this.xml1);
		System.out.println(this.xml2);
	
		System.out.println();
		
		if (this.next != null) {
			this.next.printstack();
		}
	}
	
}
