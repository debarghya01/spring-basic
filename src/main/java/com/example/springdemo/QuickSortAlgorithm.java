package com.example.springdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{
	
	public int[] sort(int[] numbers) {
		//No sorting done, just for learning
		
		System.out.println("From quicksort");
		return numbers;
	}


}
