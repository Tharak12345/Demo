package programming;

public class Demo {
	public static void main(String args[]) {
		int[] array = {10, 20, 50, 100, 1000, 40, 1001, 60};
		int max=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max= array[i];
			}
		}
		System.out.println(max);
	}

}
