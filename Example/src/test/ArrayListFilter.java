package test;

import java.util.Arrays;
import java.util.List;
public class ArrayListFilter {
	
		public static void main(String[] args) {
			List<Integer> list =Arrays.asList(10,30,40,60,80);
			list.stream().filter(p-> p%2==0).forEach(c->System.out.println(c));
			
		
	}

}
