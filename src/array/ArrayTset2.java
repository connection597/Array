package array;

public class ArrayTset2 {

	public static void main(String[] args) {
		int[] number = new int[] {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for(int i =0; i<number.length; i++) {
			sum += number[i];
		}
		System.out.println(sum);

	}

}
