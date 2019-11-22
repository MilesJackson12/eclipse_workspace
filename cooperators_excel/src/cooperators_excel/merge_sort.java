package cooperators_excel;

public class merge_sort {
	private static client_full[] aux;
	
	private static boolean less(client_full v, client_full w) {
		return v.compareTo(w) < 0;
	}
	
	private static void merge(client_full a[], int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		
		for (int k = low; k <= high; k++) {
			aux[k] = a[k];
		}
		
		for (int k = low; k <= high; k++) {
			if (i > mid) a[k] = aux[j++];
			else if (j > high) a[k] = aux[i++];
			else if (less(aux[j], aux[i])) a[k] = aux[j++];
			else a[k] = aux[i++];
		}
	}
	
	public static void mergeSort(client_full[] a, int n) {
		aux = new client_full[n];
		mergeSort(a, 0, n-1);
	}
	
	private static void mergeSort(client_full[] a, int low, int high) {
		if (high <= low) return;
		int mid = low + (high-low)/2;
		mergeSort(a, low, mid);
		mergeSort(a, mid+1, high);
		merge(a, low, mid, high);
	}
}
