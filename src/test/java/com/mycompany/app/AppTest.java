package com.mycompany.app;

import junit.framework.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }
    
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp()
    {
        int result = 2 - 2;	
	assertTrue( result == 0 );
    }
}
