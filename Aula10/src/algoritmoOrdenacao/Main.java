package algoritmoOrdenacao;

public class Main {

	public static void main(String[] args) {
		/*
		BubbleSort bsort = new BubbleSort();
		int [] v = {5,8,2,20,15,6};
		bsort.BubbleSort(v);
		for(int x : v) {
			System.out.println(x);
		}*/
		
		InsertSort isort = new InsertSort();
		int [] v = {5,8,2,20,15,6};
		isort.InsertSort(v);
		for(int x : v) {
			System.out.println(x);
		}
		

	}

}
