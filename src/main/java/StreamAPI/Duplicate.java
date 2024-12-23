package StreamAPI;


import java.util.*;
import java.util.stream.Collectors;

//program to find duplicate element StreamAPI?
public class Duplicate {
	
	public static void main(String[] args) {

//		List<Integer> list = Arrays.asList(2, 5, 9, 14, 2, 67, 1, 89, 34, 14, 53, 41, 89);
//		Set<Integer> duplicate = list.stream().filter(e -> Collections.frequency(list, e) > 1)
//				.collect(Collectors.toSet());
//
//		System.out.println(duplicate);

		List<Integer> list = Arrays.asList(2, 5, 9, 14, 2, 67, 1, 89, 34, 14, 53, 41, 89);
		Set<Integer> duplicate = new HashSet<Integer>();
		Set<Integer> dup = list.stream().filter(e -> !duplicate.add(e)).collect(Collectors.toSet());

		//add method of HashSet returns false if the element is already in the set

		//filter method filters out elements that r already presents
		System.out.println(dup);

		// Remove duplicacy...

//		List<Integer> list = Arrays.asList(2, 5, 9, 14, 2, 67, 1, 89, 34, 14, 53, 41, 89);
//		List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
//		System.out.println(collect);

		
	}

}
