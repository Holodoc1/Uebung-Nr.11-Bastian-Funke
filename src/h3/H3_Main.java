package h3;

import java.util.Arrays;

public class H3_Main {
	
	public static void main(String[] args) {
		int[] arr = {33,6,22,8,-7,66,4,5,11,2,3};
		System.out.println(Arrays.toString(mergeSort(arr)));
	}
	
	public static int[] mergeSort(int[] arr) {
		if(arr.length <= 1) return arr;
		else {
			int mitte = arr.length / 2;
			int[] links = new int[mitte];
			for(int i = 0; i < links.length; i++) {
				links[i] = arr[i];
			}
			int[] rechts = new int[arr.length - mitte];
			for(int i = 0; i < rechts.length; i++ ) {
				rechts[i] = arr[mitte + i];
			}
			links = mergeSort(links);
			rechts = mergeSort(rechts);
			return merge(links,rechts);
		}
	}
	
	private static int[] merge(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length + arr2.length];
		int indexResult = 0;
		int index1 = 0;
		int index2 = 0;
		while(index1 < arr1.length && index2 < arr2.length) {
			if(arr1[index1] < arr2[index2]) {
				result[indexResult] = arr1[index1];
				index1++;
			}else {
				result[indexResult] = arr2[index2];
				index2++;
			}
			indexResult++;
		}
		while(index1 < arr1.length) {
			result[indexResult] = arr1[index1];
			index1++;
			indexResult++;
		}
		while(index2 < arr2.length) {
			result[indexResult] = arr2[index2];
			index2++;
			indexResult++;
		}
		return result;
	}
}
