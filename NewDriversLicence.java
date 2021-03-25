import java.util.*;
import java.lang.Math;

public class NewDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String agents = sc.nextLine();
		String names = sc.nextLine();
		sc.close();

		int a = Integer.parseInt(agents);
		
		String[] others = names.split(" ");
		
	    List<String> everyone = new ArrayList<String>();
	    Collections.addAll(everyone,others);
		everyone.add(name);
	    Collections.sort(everyone);
	    
	    if(everyone.contains(name)) {
	    	double i = everyone.indexOf(name) + 1;
	    	int f = 20;
			double h = i/a;
			int g = (int)Math.ceil(h);
	    	for (int j = 1; j <= others.length+1; j++) {
		    	if(g == j) {
		    		f *= j;
		    		System.out.println(f);
		    	}
	    	}
    	}
	}
}