package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//program to filter given ArrayList in STREAM-API

public class Filter {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(11);
		numbers.add(13);
		numbers.add(15);
		numbers.add(16);
		numbers.add(17);
		numbers.add(19);
		
		List<Integer> even = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(even);
		
	}

}
