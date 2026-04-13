import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleWindowProgram {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window Program");
        frame.setLayout(new FlowLayout());
        frame.setSize(450, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField(10);
        JCheckBox checkBox = new JCheckBox("Check Me");
        
        String[] options = {"List Item 1", "List Item 2", "List Item 3"};
        JComboBox<String> choiceList = new JComboBox<>(options);
        
        JButton button = new JButton("Submit");
        JLabel label = new JLabel("Output will be shown here");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                boolean isChecked = checkBox.isSelected();
                String choice = (String) choiceList.getSelectedItem();
                
                label.setText("Input: " + text + " | Checked: " + isChecked + " | Choice: " + choice);
            }
        });

        frame.add(new JLabel("Enter Text:"));
        frame.add(textField);
        frame.add(checkBox);
        frame.add(choiceList);
        frame.add(button);
        frame.add(label);

        frame.setVisible(true);
    }
}
