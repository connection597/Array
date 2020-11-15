package array; //알파벳에 아스키코드 출력

public class ArrayTset5 {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch ='A';
		
		for(int i =0; i < alphabets.length; i++,ch++) {
			alphabets[i]= ch; //아스키 값에 각 요소 저장
		}
		for(int i =0; i < alphabets.length; i++) {
			System.out.println(alphabets[i]+","+(int)alphabets[i]);
		}
	}

}
