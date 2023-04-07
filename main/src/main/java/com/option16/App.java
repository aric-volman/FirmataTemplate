package com.option16;

// Imports Firmata4J
import org.firmata4j.firmata.*;
import org.firmata4j.IODevice;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        IODevice arduino = new FirmataDevice("COM3");
        System.out.println( "Hello World!" );

        try {
            arduino.start();       // start comms with board;
            System.out.println("Board started.");
            arduino.ensureInitializationIsDone();
        }
        catch (Exception ex) {
            System.out.println("couldn't connect to board.");
        } finally {
            System.out.println("I love Firmata!");
        }
    }
}
