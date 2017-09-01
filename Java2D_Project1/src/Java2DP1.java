import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Filename:    Java2DP1
 * Author:      William Crutchfield
 * Date:        8/31/2017
 * Description: Creates an Animation JPanel that contains multiple images. Images are then
 * transformed depending on the frame of the Animation panel.
 */
public class Java2DP1 extends JFrame {

  /** Creates JFrame with Animation Panel */
  private Java2DP1() {

    Animation animation = new Animation(); // Construct Class with Graphics Component
    add(animation); // Add to JFrame

    setSize(800, 600); // Set Default Size
    setTitle("Java2D Animation"); // Set Title

    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Default Close
    setLocationRelativeTo(null); // Center the Frame
    setResizable(false); // Disable Resize
  }

  public static void main(String[] args) {
    Java2DP1 java2DP1 = new Java2DP1();
    java2DP1.setVisible(true);
  }
}
