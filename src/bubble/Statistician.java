package bubble;

import java.util.*;


public class Statistician 
{
	private final static int N_REPETITIONS = 1000;
	
	
	//returns a array of random integers with values between -maxValue and maxValue
	private static int[] buildRandom(int length, int maxValue)
	{
		int[] array = new int[length];
		for (int i=0; i<length; i++)
			array[i] = (int)(Math.random()*(maxValue + 1));
		return array;
	}
	
	private static boolean isSorted(int[] a) {
		for(int i=0;i<a.length-2;i++) {
			if(a[i]>a[i+1]) {return false;}
		}
		return true;
	}
	
	private static void getStats(int arrayLength)
	{
		ArrayList<Long> visitCounts = new ArrayList<>();
		ArrayList<Long> swapCounts = new ArrayList<>();
		
		for (int i=0; i<N_REPETITIONS; i++){
			int[] array = buildRandom(arrayLength, arrayLength*100);
			BubbleSorter sorter = new BubbleSorter(array);
			sorter.sort();
			// Assert that the sorter sorted correctly.
			assert isSorted(sorter.getArray()) : "Array is sorted"; 
			// Append # visits and # swaps to the array lists.
			visitCounts.add(sorter.getNVisits());
			swapCounts.add(sorter.getNSwaps());
		}

		// Compute and print min/average/max number of visits.
		System.out.println("Minimum visits: " + findMin(visitCounts) + " Average visits: " + findAverage(visitCounts) + " maximum visits: " + findMax(visitCounts));
		// Compute and print min/average/max number of swaps.
		System.out.println("Minimum swaps: " + findMin(swapCounts) + " Average swaps: " + findAverage(swapCounts) + " maximum swap: " + findMax(swapCounts));
	}	
	
	public static long findMin(ArrayList<Long> b){
		long answer = Long.MAX_VALUE;
		for(int i = 0; i < b.size(); i++){
			if(b.get(i) < answer){
				answer = b.get(i);
			}
		}
		return answer;
	}

	public static long findMax(ArrayList<Long> b){
		long answer = Long.MIN_VALUE;
		for(int i = 0; i < b.size(); i++){
			if(b.get(i) > answer){
				answer = b.get(i);
			}
		}
		return answer;
	}
	
	public static double findAverage(ArrayList<Long> b){
		double answer = 0;
		for(int i = 0; i < b.size(); i++){
			answer += b.get(i);
		}
		answer = answer / b.size();
		return answer;
	}
	public static void main(String[] args)
	{	
		//int[] b = {5,24,1,25};
		int[] tiny = {1,24,5,25};
		int[] alreadySorted = {1,5,10,24};//fill in your example
		int[] backward = {24,10,5,1};//fill in your example
		
		System.out.println("Tiny");
		BubbleSorter tinySorted = new BubbleSorter(tiny);
		tinySorted.sort();
		System.out.println(tinySorted);
		
		// System.out.println("b sorter");
		// BubbleSorter b= new BubbleSorter(b);
		// b.sort();
		// System.out.println(b);
		System.out.println("Already Sorted");
		BubbleSorter alreadySort = new BubbleSorter(alreadySorted);
		alreadySort.sort();
		System.out.println(alreadySort);
		
		System.out.println("Backward");
		BubbleSorter backwardSorted = new BubbleSorter(backward);
		backwardSorted.sort();
		System.out.println(backwardSorted);

        System.out.println("1000:");
        getStats(1000);
        
		System.out.println("3000:");
		getStats(3000);
		
	}
}
