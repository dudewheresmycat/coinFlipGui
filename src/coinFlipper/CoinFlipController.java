package coinFlipper;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CoinFlipController {

	@FXML
	private Button button;

	@FXML
	private Label label;

	@FXML
	private ImageView myImage;

	
	

	// This method is called when the FXML file is loaded
	public void initialize() {
		// Perform any necessary initialization here.
		
	}

	public void convertButtonListener(ActionEvent event) {
		Random num = new Random();
		
		int randomNum = num.nextInt(2);
		
		
		if (randomNum == 0) {
			Image heads = new Image(getClass().getResourceAsStream("heads.jpg"));
			myImage.setImage(heads);
		} else {
			Image tails = new Image(getClass().getResourceAsStream("tails.png"));
			myImage.setImage(tails);
		}
	}
}
