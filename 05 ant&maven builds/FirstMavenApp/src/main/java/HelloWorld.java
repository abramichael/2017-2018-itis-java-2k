public class HelloWorld {
	
	public String greet(String lang) {

		switch(lang) {
			case "es":
				return "Hola";
			default:
				return "Hello";
		}

	}

	public static void main(String [] args) {
		
		HelloWorld hw = new HelloWorld();
		System.out.println(hw.greet("es"));
		
	}
	
	
}