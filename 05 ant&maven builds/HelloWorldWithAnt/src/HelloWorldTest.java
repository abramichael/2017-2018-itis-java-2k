import org.junit.*;

public class HelloWorldTest {

	@Test
	public void testThatHWSupportsSpanish() {
		HelloWorld hw = new HelloWorld();
		Assert.assertEquals(
			"Hola".toLowerCase(), 
			hw.greet("es").toLowerCase()
		);
	}



}