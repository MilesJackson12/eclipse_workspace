package cooperators_excel;

public class bin_search {
	public static int binSearch(client_full[] list, int id) {
		int low = 0;
		int high = list.length;
		while((high - low) > 10) {
			int mid = (low + (high-1))/2;
			int comp = list[mid].compareTo(id);
			if (comp == 0) return mid;
			else if (comp < 0) low = mid + 1;
			else high = mid-1;
		}
		
		for (int i = low; i <= high; i++) {
			if (list[i].compareTo(id) == 0) return i;
		}
		
		return -1;
				
	}
}
