package edit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Soln {
	
	List<Integer> list = new ArrayList<>();
	
	public int[] twoSum(int[] nums, int target) {
		list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		
		int index1 = 0;
		int index2 = 0;
		
		for(int number: list) {
			
		}
		
		return null;
	}
}
