package com.payal.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StremAPIDemo {

	public static void main(String[] args) {
		
		/*System.out.println("1. Filter Even Numbers from a List");
		System.out.println("Input - List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);");
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> result = nums.stream().filter(n -> n%2 ==0).toList();
		
		System.out.println("Output - " + result);
		
		System.out.println("************");
		
		System.out.println("2. Find Maximum in List");
		System.out.println("Input - List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);");
		
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		int max = numbers.stream().max(Integer :: compare).orElseThrow();
		System.out.println("Output - " + max);
		
		System.out.println("************");
		
		System.out.println("3.Sort a list of integers in descending order");
		System.out.println("Input - List<Integer> numbers = Arrays.asList(3, 5, 1, 4, 2);");
		
		List<Integer> list = Arrays.asList(3, 5, 1, 4, 2);
		List<Integer> sortedDescList = list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println("Output - " + sortedDescList);
		
		System.out.println("************");
		
		System.out.println("4.Count Strings with Specific Prefix - Count strings starting with a specific prefix, e.g., “A”");
		System.out.println("Input - List<String> names = Arrays.asList(\"Alice\", \"Bob\", \"Annie\", \"Alex\", \"Charlie\");");
		
		List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
		List<String> namesStartsWithA = names.stream().filter(name -> name.startsWith("A")).toList();
		System.out.println("Output - " + namesStartsWithA);
		
		System.out.println("************");
		
		System.out.println("5.Find First Non-Repeated Character in a String");
		System.out.println("Input - String input = \"swiss\"");
		
		String input = "swiss";
		
		Optional<Character> firstUniqueChar = input.chars().mapToObj(c -> (char) c)
				.filter(c -> input.indexOf(c) == input.lastIndexOf(c)).findFirst();
		
		System.out.println("Ouput - " + firstUniqueChar);*/
		
		System.out.println("6.Find second smallest element");
		
		int[] numbers = {3,4,2,1,5,1};
		int secondSmallest = Arrays.stream(numbers)
				.distinct()
				.sorted()
				.skip(1)
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Couldnt find second smallest number"));
		
		System.out.println("Second smallest number is : " + secondSmallest);
		
		System.out.println("************");
		
		System.out.println("7.Common Elements in two arrays");
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {4,5,6,7,8};
		
		List<Integer> commonElems = Arrays.stream(arr1)
				.filter(arr1Num -> Arrays.stream(arr2).anyMatch(arr2Num -> arr2Num == arr1Num))
				.boxed()
				.collect(Collectors.toList());
		
		System.out.println("Common Elements between two arrays : " + commonElems);
		
		System.out.println("************");
		
		System.out.println("8.Count occurances of each element in integer array - {1, 2, 3, 2, 1, 4, 2, 4, 5}");
		
		int[] arr = {1, 2, 3, 2, 1, 4, 2, 4, 5};
		
		Map<Integer, Long> freqMap = Arrays.stream(arr)
				.boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		freqMap.forEach((key, value) -> {
			System.out.println(key + " occurs " + value + " time.");
		});
		
		System.out.println("************");
		
		System.out.println("9.Count occurances of each character in string - swiss");
		
		String s = "swiss";
		
		Map<Character, Long> charFreqMap = s.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		charFreqMap.forEach((key, value) -> {
			System.out.println(key + " occurs " + value + " time.");
		});
		
		System.out.println("************");
		
		System.out.println("10.Reverse Array in-place -  {1,2,3,4,5}");
		
		int[] nums = {1,2,3,4,5};
		
		IntStream.range(0, nums.length/2).forEach(i -> {
			int temp = nums[i];
			nums[i] = nums[nums.length - i - 1];
			nums[nums.length - i - 1] = temp;
		});
		
		System.out.println("reversed Array : " + Arrays.toString(nums));
		
		System.out.println("************");
		
		System.out.println("11.Find string with max length - {banana, avacado, apple}");
		
		String[] fruits = {"banana","avacado", "apple"};
		
		int maxLength = Arrays.stream(fruits).mapToInt(string -> string.length()).max().orElse(0);
		System.out.println("Max Len for a string : " + maxLength);
		
		System.out.println("************");
		
		System.out.println("12.Count occurances of e - Apple is sweet fruit");
		
		String str = "Apple is sweet fruit";
		long eCount = str.chars().filter(c -> c == 'e').count();
		
		System.out.println("Occurances of e - " + eCount);
		
		
	}

}
