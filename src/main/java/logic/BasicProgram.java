package logic;

public class BasicProgram {
	
	
	
	public String ReverseString(String str) {
		
		char[] array = str.toCharArray();
		
		int start=0;
		int end=array.length-1;
		while(start<end) {
			char t=array[start];
			array[start]=array[end];
			array[end]=t;
			start++;
			end--;
		}
		return new String(array);
	}

}
