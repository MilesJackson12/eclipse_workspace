package cooperators_excel;

public class client_full {
	String city_name;
	String province;
	String country;
	String cif_party_id;
	String admin_client;
	int admin_client_id;
	
	public client_full() {
		city_name = "";
		province = "";
		country = "";
		cif_party_id = "";
		admin_client = "";
		admin_client_id = -1;
		
	}
	
	public client_full(String cn, String prov, String coun, String cifpid, String admin) {
		city_name = cn;
		province = prov;
		country = coun;
		cif_party_id = cifpid;
		admin_client = admin;
		String[] temp = admin_client.split(":", 2);
		admin_client_id = Integer.parseInt(temp[1]);
		
	}
	
	public void copyClient(client_full c) {
		city_name = c.city_name;
		province = c.province;
		country = c.country;
		cif_party_id = c.cif_party_id;
		admin_client = c.admin_client;
		admin_client_id = c.admin_client_id;
		
	}
	
	public int compareTo(client_full x) {
		if (this.admin_client_id > x.admin_client_id) return 1;
		if (this.admin_client_id < x.admin_client_id) return -1;
		else return 0;
	
	}
	
	public int compareTo(int x) {
		if (this.admin_client_id > x) return 1;
		if (this.admin_client_id < x) return -1;
		else return 0;
	
	}
	
}
