
/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    
 ******************************************************************************/

import org.jointheleague.graphical.robot.Robot;


public class ChristmasTree {

	Robot rob  = new Robot("mini");
	
    public static void main(String[] args) {
        ChristmasTree ohChristmasTree = new ChristmasTree();
        ohChristmasTree.drawStar();
        ohChristmasTree.drawTreeBody();
        ohChristmasTree.drawTreeTrunk();
    }


    double treeWidth = 15;
    double scale = 1.1;    //This is how much the width of the tree increases with each layer down


    void drawTreeBody() {
        // 8. Change the color of the line the robot draws to forest green    

    	
    	rob.setPenColor(0, 255, 34);
rob.setSpeed(100);
        // 1. Make a variable for turnAmount and set it to 175
int turnamount = 175;

        // 2. Start the Robot facing to the right
rob.turn(90);

        // 5. Repeat steps 3 through 11, 11 times
for (int j = 0; j < 12; j++) {
	

            // 3. Move the robot the width of the tree
		rob.move((int)treeWidth);
			// 4. Turn the robot the current turnAmount to the right
			rob.turn(turnamount);
			// 6. Set the treeWidth to the current treeWidth times the scale
			treeWidth=treeWidth*scale;
            // 7. Move the robot the width of a tree again
			rob.move((int)treeWidth); 
    		// 9. Turn the robot the current turn amount to the LEFT
			rob.turn(-turnamount);
            // 10. Set the treeWidth to the current treeWidth times the scale again
    		treeWidth=treeWidth * scale;
            // 11. Decrease turnAmount by 1
    		turnamount = turnamount - 1;
}
}
    
    void drawTreeTrunk() {
        // 1. Move the robot half the width of the tree
rob.setSpeed(100);
rob.penUp();
    	rob.setPenColor(139, 69, 19);
    	rob.move((int)treeWidth / 2);
        // 2. Change the robot so that it is pointing straight down
rob.turn(90);
rob.penDown();
        // 4. Set the pen width to the tree width divided by 10
rob.setPenWidth((int)treeWidth/10);

        // 5. Change the color of the line the robot draws to brown


        // 3. Move the robot a quarter the tree width
rob.move((int)treeWidth/4);

    }
    
    void drawStar() {
        // * Optional: Draw a red star on top of the tree. Hint: 144 degrees makes a star.
    	
    	rob.setSpeed(100);rob.penDown();
    	rob.setPenColor(255, 0, 0);
    	for (int i = 0; i < 5; i++) {
			rob.move(30);
			rob.turn(144);
		}

    }


}

