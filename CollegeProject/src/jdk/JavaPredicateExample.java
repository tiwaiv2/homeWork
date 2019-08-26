package jdk;

import java.util.function.Predicate;

public class JavaPredicateExample {
	
	public static void main(String[] args) {
		
		Predicate<Integer> condition= (i)->i>10;
		
		System.out.println(predEample(condition,9));
		
	}
	
public static  boolean  predEample(Predicate<Integer> i,int number){
	
	return i.test(number);
}
}


