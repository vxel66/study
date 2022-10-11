package 기본.Programming;

import 기본.Programming.org.opentutorials.iot.DimmingLights;
import 기본.Programming.org.opentutorials.iot.Elevator;
import 기본.Programming.org.opentutorials.iot.Lighting;
import 기본.Programming.org.opentutorials.iot.Security;

import javax.swing.*;

public class OkJavaGoInHomeInput {

    public static void main(String[] args) {

        String id = JOptionPane.showInputDialog("Enter a ID");
        String bright = JOptionPane.showInputDialog("Enter a bright level");

        // Elevator call
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);

        // Security off
        Security mySecurity = new Security(id);
        mySecurity.off();

        // Light on
        Lighting hallLamp = new Lighting(id+ "/ Hall Lamp");
        hallLamp.on();

        Lighting floorLamp = new Lighting(id+ "/ floorLamp");
        floorLamp.on();

        DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
        moodLamp.setBright(Double.parseDouble(bright));
        moodLamp.on();


    }

}
