package com.payal.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// Cutomer - 1 Alice, 2 Bob, 3 Charlie
		// Order - 1,1,100 2,1,100 3,2,100, 4,3,50

		// Alice 200
		// Bob 100
		// Charlie 50

		List<Customer> customerList = Arrays.asList(new Customer(1, "Alice"), new Customer(2, "Bob"),
				new Customer(3, "Charlie"));

		List<Order> orders = Arrays.asList(new Order(1, 1, 100), new Order(2, 1, 100), new Order(3, 2, 100),
				new Order(4, 3, 50));

		Map<String, Double> totalMap = orders.stream()
				.collect(
						Collectors
								.groupingBy(
										order -> customerList.stream().filter(c -> c.getId() == order.getCustomerId())
												.findFirst().get().getName(),
										Collectors.summingDouble(Order::getAmount)));

		totalMap.forEach((name, total) -> System.out.println(name + " -> " + total));
	}

}
