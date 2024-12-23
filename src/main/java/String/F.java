package String;

public class F {
	
	
	private final String name;
	private final String username;
	private final String password;
	
	
	public F(String name, String username, String password) {
		
		this.name = name;
		this.username = username;
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public String getUsername() {
		return username;
	}


	public String getPassword() {
		return password;
	}
	
	public static void main(String[] args) {
		F f1 = new F("Anuj","Anuj123","a1n2u3j4");
		
		System.out.println(f1.getName());
		System.out.println(f1.getUsername());
		System.out.println(f1.getPassword());
	}
	
	
	

}
