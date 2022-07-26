package edit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {

	public static void main(String[] args) {
		int[] a = { 3, 2, 4 };
		int target = 6;
		Solution sol = new Solution();

		for (int b : sol.twoSum(a, target)) {
			System.out.println(b);
		}

	}

	public int[] twoSum(int[] nums, int target) {
		List<Integer> twoAnswers = new ArrayList<>(2);

		int index = 0;
		int secondIndex = 0;

		for (int number : nums) {
			int test = target - number;
			
			List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

			List<Integer> newList = list.subList(index + 1, list.size());
			
			boolean var = checkInclusion(newList, test);
			if (var) {
				secondIndex = getIndexOf(newList, test) + index + 1;
				twoAnswers.add(index);
				twoAnswers.add(secondIndex);
				break;
			}
			index += 1;
		}

		return twoAnswers.stream().mapToInt(Integer::intValue).toArray();
	}

	public int getIndexOf(List<Integer> newList, int test) {

		return newList.indexOf(test);
	}

	public boolean checkInclusion(List<Integer> newList, int test) {
		
		for (int number : newList) {
			if (number == test) {
				return true;
			} else {
				continue;
			}
		}
		return false;
	}
}