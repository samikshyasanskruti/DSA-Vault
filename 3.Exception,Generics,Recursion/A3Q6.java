
public class A3Q6 {
	public static <T> int count(T[] array, T item) {
		
		int occurence = 0;
		
		for(int i = 0; i<array.length; i++) {
			if(array[i] == item) {
				occurence++;
			}
		}
		return occurence;
	}

	public static void main(String[] args) {
		
		Integer iArray[] = {1,2,3,1,2,2,2};
		String eArray[] = {"First","Second","First"};
		Double dArray[] = {1.3,1.4,1.5,1.3,1.3};
		
		count(iArray, 2);
		count(eArray, "First");
		count(dArray, 1.3);

	}

}

//tutorialspoint.com/data_structures_algorithms/tower_of_hanoi.htm