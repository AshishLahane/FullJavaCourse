package AdvanceJava;

import java.util.Arrays;
import java.util.List;
//import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {

		List<String> names= Arrays.asList("Navin","john","king","ram");
		
		String finalV= names.stream().filter(str->str.contains("a")).findFirst().orElse("Not found");
		System.out.println(finalV);
		
	}

}
