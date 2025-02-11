package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Rebecca");
		list.add("Malu");
		list.add("Anita");
		list.add("Perola");
		list.add("Sophia");
		list.add("Rosa");
        list.add(2, "Marina");
        list.add("Michele");
        
        System.out.println(list.size());
        
        list.remove("Marina");
        
        System.out.println(list.size());
        
		for(String x: list) {
			System.out.println(x);
		}
		System.out.println("-----------------------------");
		//list.remove(3);
		list.removeIf(x-> x.charAt(0) == 'P');
		System.out.println(list.size());
		
		for(String x: list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------");
		System.out.println("Index of Rebecca : "+ list.indexOf("Rebecca"));
		System.out.println("Index of Malu = " + list.indexOf("Malu"));
		System.out.println("--------------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("----------------------------------");
		String name = list.stream().filter(x->x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
