package array; //배열에 유효한 요소 값 출력

public class ArrayTest4 {

	public static void main(String[] args) {
		double[] data = new double[5];
		int size =0;
		
		data[0] =10.0; size++;
		data[1] =20.0; size++;
		data[2] = 30.0; size++; //값을 저장후 size변수 값에 증가
		
		for(int i =0; 1<size; i++) {
			System.out.println(data[i]);
		}

	}

}
