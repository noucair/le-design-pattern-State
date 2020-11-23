package ma.inpt.sudcloudiot;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")

public class TestState extends Frame implements ActionListener  {
	// GUI attributes.
	private Button pushButton = new Button("Push Operation");
	private Button pullButton = new Button("Pull Operation");
	private Button exitButton = new Button("Exit");
	private TextArea textArea = new TextArea();
	
	// The Context.
	private Context context = null;
	
	public TestState() {
		super("Welcome to SUD-Cloud&IoT State Pattern");
		context = new Context();
		setupWindow();
		//textArea.setBackground(Color.red);
		//textArea.setSize(200,100);
		}
		private void setupWindow() { // Setup GUI 
	      textArea.setBackground(Color.red);
		  textArea.setSize(200,100);
		  pushButton.setForeground(Color.black);
		  pullButton.setForeground(Color.black);
		  exitButton.setForeground(Color.black);
		  this.setLayout(new FlowLayout());
		  this.add(pushButton);
		  this.add(pullButton);
		  this.add(exitButton);
		  this.add(textArea);
		  pushButton.addActionListener(this);
		  pullButton.addActionListener(this);
		  exitButton.addActionListener(this);
		}

			// Handle GUI actions.
		public void actionPerformed(@SuppressWarnings("exports") ActionEvent event) {
		Object src = event.getSource();
		if (src == pushButton) {
		System.out.println("Before push(): color = "+context.getState().getColor());
		context.push(); 
		textArea.setBackground(context.getState().getColor());
		System.out.println("After push(): color = "+context.getState().getColor());
		}
		else if (src == pullButton) {
			context.pull();
			textArea.setBackground(context.getState().getColor());
			}
			else if (src == exitButton) {
			System.exit(0);
			}
			}
			// Main method.

public static void main(String[] argv) {
			TestState gui = new TestState();
			gui.setSize(450,250);
			gui.setVisible(true);
			}//end main()

	

}