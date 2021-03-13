//https://www.youtube.com/watch?v=AyqmShIFVCo&t=1s
//	Robot is a java class from AWT package, used to handle hard key event strokes

package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.testng.annotations.Test;

public class RobotClass01 {
	
	@Test
	public void robotTest() throws AWTException, InterruptedException, IOException {
		
		String command = "c:\\windows\\notepad.exe";
		Runtime run= Runtime.getRuntime();
		run.exec(command);
		
		Robot myrobot =new Robot();
		myrobot.keyPress(KeyEvent.VK_R);
		Thread.sleep(100);
		myrobot.keyPress(KeyEvent.VK_A);
		Thread.sleep(100);
		myrobot.keyPress(KeyEvent.VK_F);
		Thread.sleep(100);
		myrobot.keyPress(KeyEvent.VK_I);
		Thread.sleep(100);
				
	}

}
