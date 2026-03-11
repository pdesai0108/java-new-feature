package com.payal.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StremAPIDemo {

	public static void main(String[] args) {
		
		System.out.println("1. Filter Even Numbers from a List");
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
		
	}

}
