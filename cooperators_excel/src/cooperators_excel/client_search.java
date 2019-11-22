package cooperators_excel;

public class client_search {

	String province;
	String public_id;
	int public_id_no;
		
		
	public client_search(String prov, String pid) {
		province = prov;
		public_id = pid;
		String[] temp = pid.split(":", 2);
		public_id_no = Integer.parseInt(temp[1]);
			
	}
		
}


