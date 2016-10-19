import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommandffrf() {
		PlanetExplorer PE = new PlanetExplorer(10,10, "");
		assertEquals("(3,0)", PE.executeCommand("fff"));
	}
}
