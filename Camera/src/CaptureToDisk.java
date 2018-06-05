import java.nio.ByteBuffer;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamUtils;
import com.github.sarxos.webcam.util.ImageUtils;


public class CaptureToDisk {

	public static void main(String[] args) {
//https://github.com/sarxos/webcam-capture
		Webcam webcam = Webcam.getDefault();
		// creates test2.jpg
		WebcamUtils.capture(webcam, "C://Users/hanyu/Desktop/DEV/test2", "jpg");

	}
}