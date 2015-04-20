package com.herokuapp.anttitevanlinna.portfolioapp;

/**
 * Created by ext-tevaan on 16.4.2015.
 */
public class WebReferences {

    static String[] pages = {
            "http://anttitevanlinna.herokuapp.com/#mobile?skipnavi",
            "http://anttitevanlinna.herokuapp.com/#portfolio?skipnavi",
            "http://anttitevanlinna.herokuapp.com/#why?skipnavi"
    };

    static int current = 0;

    public static String current() {
        return pages[current];
    }

    public static void right(){
        current++;
        current = current % 3;
    }

    public static void left(){
        current += 2;
        current = current % 3;
    }

}
