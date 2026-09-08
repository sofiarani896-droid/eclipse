package CODE;

public class Hello12 {
	static int binarysearch(int[] arr, int left, int rigth, int target) {
		if (left > rigth) {
			return - 1;
		}
		int mid = left + (right - left) / 2;
	
	
	if (arr[mid] == target) {
		return mid;
	}
	
	if (target < arr[mid]) {
		return binarySearch(arr,left, mid - 1, target);
		
		return  binarysearch(arr,  mid + 1, right, target);
	}
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70,80};
		int target = 60;
		
		int result = binarySearch(
				arr,
				0,
				arr.length - 1,
				target
			);
		if (result != -1) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found";)
		}
	}

}
