
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;


/**
 * Set view size before taking picture. It's worth to mention that size has to
 * be set before opening camera.
 * 
 * @author Bartosz Firyn (SarXos)
 */
public class TakePictureDifferentSizeExample {

	public static void main(String[] args) throws IOException {
		Webcam webcam = Webcam.getDefault();
		webcam.setViewSize(new Dimension(640,480));
		webcam.open();
		ImageIO.write(webcam.getImage(), "PNG", new File("C://Users/hanyu/Desktop/DEV/test2.png"));
		webcam.close();
	}

}