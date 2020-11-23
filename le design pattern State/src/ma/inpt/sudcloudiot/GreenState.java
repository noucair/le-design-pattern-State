package ma.inpt.sudcloudiot;
import java.awt.*;
public class GreenState extends State {
	// Next state for the Black state:
		// On a push(), go to "red"
		// On a pull(), go to "green"
		public void handlePush(Context c) {
		c.setState(new BlackState());
		}
		public void handlePull(Context c) {
		c.setState(new BlueState());
		}
		@SuppressWarnings("exports")
		public Color getColor() {return (Color.green);}


}