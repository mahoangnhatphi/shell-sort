package shellsort;

class ShellSort {
	int a[];

	public ShellSort(int[] a) {
		super();
		this.a = a;
	}

	public void shellSort() {
		int gap = a.length / 2;
		while (gap > 0) {
			for (int i = gap; i < a.length; i++) {
				int temp = a[i];
				int j = i;
				while (j >= gap && a[j - gap] > temp) {
					a[j] = a[j - gap];
					j -= gap;
				}
				a[j] = temp;
			}
			gap /= 2;
		}
	}
}

public class TestShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 12, 34, 54, 2, 3 };
		ShellSort shellSort = new ShellSort(a);
		shellSort.shellSort();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
