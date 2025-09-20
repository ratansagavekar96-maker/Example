package test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
public class ArrayListFilter {
	
		public static void main(String[] args) {
			List<Integer> list =Arrays.asList(10,30,40,60,80);
			//list.stream().filter(p-> p%2==0).forEach(c->System.out.println(c));
			
			Set set = new LinkedHashSet();
			set.add(30);
			set.add(40);
			set.add(55);
			set.add(67);
			set.forEach(c->System.out.println(c));
			
			
			
			
		
	}

}
