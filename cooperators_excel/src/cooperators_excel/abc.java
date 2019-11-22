package cooperators_excel;

public class abc {
	
	static client_full[] client_list;
	static client_search[] client_search_list;
	static client_full[] output_list;

	public static void main(String[] args) throws Exception {

		client_list = file_reader.read_client_full();

		merge_sort.mergeSort(client_list, 109654);
		
		client_search_list = file_reader.read_search_clients();
		
		output_list = new client_full[client_search_list.length];
		
		for (int i = 0; i < client_search_list.length; i++) {
			int index = bin_search.binSearch(client_list, client_search_list[i].public_id_no);
			if (index > 0) {
				output_list[i] = new client_full();
				output_list[i].copyClient(client_list[index]);		
			}
		}
		
		System.out.println(output_list[0].province);
		System.out.println(output_list[0].admin_client);
		
		file_writer.write_output(output_list);
		
		
	}

}
