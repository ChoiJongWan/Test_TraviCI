package LargestG;

public class Largest {
	public static int lagest(int[] list) {
		int index;
		int max=0;
		for(index = 0; index <list.length; index++) {
			if(list[index] > max) {
				max = list[index];
			}
		}
		return max;
	}

}
