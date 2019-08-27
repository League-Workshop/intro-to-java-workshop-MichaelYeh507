package section2;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {
	
    public static void main(String[] args) throws Exception {
        // 1. Make a new Robot
Robot rob = new Robot();

        // 3. Put the robot's pen down
rob.penDown();

        // 6. Make the robot move as fast as possible
rob.setSpeed(100);

        // 5. Use a for loop to repeat everything below 4 times. 
for (int i = 0; i < 3; i++) {
	


        //         2. Move your robot 200 pixels
rob.move(150);

        //         4. Turn the robot 90 degrees to the right
rob.turn(120);
    	
    		// 7. Change steps 4 and 5 to draw a different shape (e.g. triangle (3-sides), pentagon (5-sides), decagon (10-sides)).
   
    }
}
}
