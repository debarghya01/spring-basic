package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		// Just for testing it out
				
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		
		return 3;
	}
}
