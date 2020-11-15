package array; //배열 길이 만큼 출력하기

public class ArrayTest3 {

	public static void main(String[] args) {
		double[] data = new double[5]; //길이가 5인 배열 선언
		
		data[0] =10.0;
		data[1] =20.0;
		data[2] = 30.0;
		
		for(int i =0; i<data.length; i++) { // 천체 배열 길이 만큼 반복
			System.out.println(data[i]);
		}

	}

}
