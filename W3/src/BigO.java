import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BigO {
	public static boolean m1(int[] arr) { // O(n^2)
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean m1Version2(int[] arr) { //O(n)
        Set<Integer> k = new HashSet<>();
        for (int i: arr) {
        	k.add(i);
        }
        return k.size() != arr.length;




       }

	public static List<List<Integer>> m2(int[] nums) { //O(n^3)
		List<List<Integer>> result = new ArrayList<>();
		int n = nums.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
						Collections.sort(triplet); // avoid duplicates
						if (!result.contains(triplet)) {
							result.add(triplet);
						}
					}
				}
			}
		}

		return result;
	}
	
	public static List<List<Integer>> m2Version2(int[] nums) { // O(n^2)
		HashSet<List<Integer>> a = new HashSet<>();
		Arrays.sort(nums);
		int n = nums.length;
		for (int i = 0; i < n-2 ; i ++ ) {
			int l = i+1;
			int r = n-1;
			while (l<r) {
				int s = nums[i]+nums[l]+nums[r];
				if(s==0) {
					a.add(Arrays.asList(nums[i],nums[l],nums[r]));
					l++;
					r--;
					
				}
				else if (s<0) {
					l++;
				}
				else {
					r--;
				}
			}
		}
		return new ArrayList<>(a);}
       
	

}
