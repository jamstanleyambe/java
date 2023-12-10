import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    JButton button;
    MyFrame(){
        button = new JButton();
        button.setBounds(500, 500 , 200 ,100);
        button.addActionListener(e -> System.out.println("poo"));
        button.setText("button");
        button.setBackground(Color.blue);
        button.setFont(new Font("comic snaps" , Font.BOLD, 50 ));




        this.setSize(1000,1000);
        this.setVisible(true);
        this.setLayout(null);
        this.setTitle("this is for the button");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(button);


    }
    }












































//the method two

//
//import javax.swing.*;
//        import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class MyFrame extends JFrame implements ActionListener {
//    JButton button;
//    MyFrame(){
//        button = new JButton();
//        button.setBounds(500, 500 , 100 ,200);
//        button.addActionListener(e -> System.out.println("poo"));
//
//
//        this.setSize(1000,1000);
//        this.setVisible(true);
//        this.setLayout(null);
//        this.setTitle("this is for the button");
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.add(button);
//
//
//    }
//
//    /**
//     * Invoked when an action occurs.
//     *
//     * @param e the event to be processed
//     */
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource()==button){
//            System.out.println("poom pooom");
//        }
//    }
//}
