package ma.inpt.sudcloudiot;
import java.awt.*;
public class BlueState extends State {
	// Next state for the Black state:
		// On a push(), go to "red"
		// On a pull(), go to "green"
		public void handlePush(Context c) {
		c.setState(new GreenState());
		}
		public void handlePull(Context c) {
		c.setState(new RedState());
		}
		@SuppressWarnings("exports")
		public Color getColor() {return (Color.blue);}


}