import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;

  JTextField inputName;

  JLabel helloName;

  JButton sayHello;


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

    //initialize the mainPanel
    mainPanel = new JPanel();
    //disable any layout helpers
    mainPanel.setLayout(null);

    //initialize the text JTextField
    inputName = new JTextField();
    //set location and bounds
    inputName.setBounds(200,50,400,30);

    //initialize the JLabel
    helloName = new JLabel();
    //set location and bounds
    helloName.setBounds(200,160,400,30);

    //initialize the JButton
    sayHello = new JButton("Say Hello");
    //set location and bounds
    sayHello.setBounds(350,230,100,30);
    //set the action command on the buttons
    sayHello.addActionListener(this);

    //add the button to the mainPanel
    mainPanel.add(sayHello);

    //add the label to the mainPanel
    mainPanel.add(helloName);

    //add the text fields to the panel
    mainPanel.add(inputName);
    
    //add the panel to the window
    frame.add(mainPanel);
 
  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    if(command.equals("Say Hello")){
      //get the name from the box
      String name = inputName.getText();

      //say hello to the user
      helloName.setText("Hello " + name);
    }
  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
