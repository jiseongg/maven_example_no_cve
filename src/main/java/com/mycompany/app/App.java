package com.mycompany.app;

import java.io.File;
import org.apache.commons.io.FilenameUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
        try {
            System.out.println( "Hello World!" );
            String fileName = FilenameUtils.normalize("//../foo");
        } catch (Exception e) {
            System.err.println("error occurred");
            System.err.println(e.toString());
        }
    }

}
