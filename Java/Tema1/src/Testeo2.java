
public class Testeo2 {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] array = new int[a.length];
		int retroceso = array.length - 1;
		for (int i = 0; i < a.length; i++) {
			array[i]=a[retroceso--];
			System.out.print(array[i]+" ");
		}
	}

}
