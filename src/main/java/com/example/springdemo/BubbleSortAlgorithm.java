package com.example.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] numbers) {
		//No sorting done, just for learning
		
		System.out.println("From Boublesort");
		return numbers;
	}

}
