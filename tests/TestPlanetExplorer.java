import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommandffrf() {
		PlanetExplorer PE = new PlanetExplorer(10,10, "");
		assertEquals("(0,3,N)", PE.executeCommand("fff"));
	}
	
	@Test
	public void test_executeCommandffrfffb() {
		PlanetExplorer PE = new PlanetExplorer(100,100, "");
		assertEquals("(0,3,N)", PE.executeCommand("ffrfffb"));
	}
	
}
