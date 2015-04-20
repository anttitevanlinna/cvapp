package com.herokuapp.anttitevanlinna.portfolioapp;

import junit.framework.TestCase;

/**
 * Created by ext-tevaan on 17.4.2015.
 */
public class WebReferencesTest extends TestCase{

    public void testLeft(){
        WebReferences.left();
        assertEquals(2,WebReferences.current);
    }
}
