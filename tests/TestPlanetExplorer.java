import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommandffrf() {
		PlanetExplorer PE = new PlanetExplorer(10,10, "");
		assertEquals("(0,3,N)", PE.executeCommand("fff"));
	}
	
	@Test
	public void test_executeCommandout_of_planet() {
		PlanetExplorer PE = new PlanetExplorer(3,3, "");
		assertEquals("(0,2,N)", PE.executeCommand("b"));
	}
	
	@Test
	public void test_executeCommandffrfffb() {
		PlanetExplorer PE = new PlanetExplorer(100,100, "");
		assertEquals("(2,2,E)", PE.executeCommand("ffrfffb"));
	}
	
}
