public class A3Q5 {
	
	public static < E > void printArray( E[] inputArray) {
		
		for(int i = 0; i<inputArray.length ; i++) {
			System.out.print(inputArray[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		Integer iArray[] = {1,2,3};
		String eArray[] = {"First","Second"};
		Double dArray[] = {1.3,1.4,1.5};
		
		System.out.println("Integer array: ");
		printArray(iArray);
		
		System.out.println("String array: ");
		printArray(eArray);
		
		System.out.println("Double array: ");
		printArray(dArray);

	}

}
