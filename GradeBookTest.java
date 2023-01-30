import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest 
{
	GradeBook g1;
	GradeBook g2;
	
	@Before
	public void setUp() throws Exception 
	{
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(50);
		g1.addScore(75);
		
		g2.addScore(89);
		g2.addScore(63);
	}

	@After
	public void tearDown() throws Exception 
	{
		g1 = null;
		g2 = null;
	}

	@Test
	public void testAddScore() 
	{
		assertTrue(g1.toString().equals("50.0 75.0 "));
		assertTrue(g2.toString().equals("89.0 63.0 "));
		
		assertEquals(2,g1.getScoresSize(), .001);
		assertEquals(2,g2.getScoresSize(), .001);
	}

	@Test
	public void testSum() 
	{
		assertEquals(125,g1.sum(), .0001);
		assertEquals(152,g2.sum(), .0001);
	}

	@Test
	public void testMinimum() 
	{
		assertEquals(50,g1.minimum(), .001);
		assertEquals(63,g2.minimum(), .001);
	}

	@Test
	public void testFinalScore() 
	{
		assertEquals(75,g1.finalScore(), .001);
		assertEquals(89,g2.finalScore(), .001);
	}

}
