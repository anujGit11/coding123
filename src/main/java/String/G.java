package String;

public class G { // count occurence of characters ...
	
	public static void main(String[] args) {
		
		
		
		String name = "Aakash";
	    char c = 'a';
	    int count = 0;
	    
	    for (int i = 0; i < name.length(); i++) {
			
	    	if(name.charAt(i) == c) {
	    		count ++;
	    	}
		}
	    
		System.out.println(count);
	}

}
