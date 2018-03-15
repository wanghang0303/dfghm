package org.aptech.maven02;

import org.aptech.maven01.Welcome;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       int[] array = {13,4,35,67,32,12};
       Welcome w = new Welcome();
       w.sort(array);
    }
}
