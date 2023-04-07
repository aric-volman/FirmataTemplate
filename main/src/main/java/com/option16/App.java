package com.option16;

// Imports Firmata4J
import org.firmata4j.firmata.*;

import java.io.IOException;

import org.firmata4j.IODevice;
import org.firmata4j.Pin.Mode;

/**
 * Hello world!
 * Connects to Firmata Firmware and runs Blink via Serial connection
 */
public class App 
{
    public static final int blinkPin = 13; // In-built LED
    public static void main( String[] args )
    {
        IODevice arduino = new FirmataDevice("COM3");
        System.out.println( "Hello World!" );

        try {
            arduino.start();
            System.out.println("Board started.");
            arduino.ensureInitializationIsDone();
        } catch (IOException | InterruptedException e) {
            System.out.println("ERROR: Arduino start failed.");
            e.printStackTrace();
        }

        try {
            // PUT ARDUINO CODE HERE
            while (true) {
                arduino.getPin(blinkPin).setMode(Mode.OUTPUT);
                // Blnks every half-second
                arduino.getPin(blinkPin).setValue(1);
                Thread.sleep(500);
                arduino.getPin(blinkPin).setValue(0);
                Thread.sleep(500);
            }
        } catch (IllegalStateException | IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
