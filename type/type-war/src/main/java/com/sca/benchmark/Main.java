package com.sca.benchmark;

/**
 * Hello world!
 *
 */

import java.net.URL;
import java.net.URLClassLoader;

public class Main{
   public static void main (String args[]) {

        ClassLoader cl = ClassLoader.getSystemClassLoader();

        URL[] urls = ((URLClassLoader)cl).getURLs();

        for(URL url: urls){
        	System.out.println(url.getFile());
        }
         
   }
}