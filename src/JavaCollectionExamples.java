import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaCollectionExamples {
	
	public static <Interger> void main(String args[]) {
		List<Integer> num=Arrays.asList(10,20,45,89,55);
		//to find even numbers from list
		num.stream().filter(n->n%2==0).forEach(System.out::println);
		
		
	}

}
