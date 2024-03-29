package assignmentsubmission;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Stulogin extends JFrame implements ActionListener {
    JButton login,SignUp;
    JTextField  ETextField, PTextField;
    
    Stulogin(){
        setTitle("ASSIGNMENT SUBMISSION");
        setLayout(null);//imagelayout
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/th.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon (i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70,10,100,100);//icon size from frame
        
        add(label);//Frame
        JLabel text=new JLabel("Student login");
        add(text);//add fun used to add in farme
        text.setFont(new Font("Showcard Gothic",Font.BOLD ,50));//text size
        text.setBounds(200,40,400,100);//visible text
        
        JLabel Enrollno=new JLabel("Enrollment No:");
        add(Enrollno);//add fun used to add in farme
        Enrollno.setFont(new Font("Raleway",Font.BOLD ,30));//text size
        Enrollno.setBounds(120,200,400,100);//visible text
        
         ETextField=new JTextField();
        ETextField.setBounds(400,234,250,30);//x+width of enroll y=box position
        add(ETextField);
  
        JLabel Password=new JLabel("Password :");
        add(Password);//add fun used to add in farme
        Password.setFont(new Font("Raleway",Font.BOLD ,30));//text size
        Password.setBounds(120,260,500,100);//visible text
        //textfield
        PTextField=new JTextField();
        PTextField.setBounds(400,300,250,30);//x+width of enroll y=box position
        add(PTextField);
        
        getContentPane().setBackground(Color.GRAY);//frame color
        setSize(800,480);//frame size
        setVisible(true);
      
        setLocation(350,200);
        
     login =new JButton("lOG IN");
    login.setBounds(300,408,100,30);
    login.setBackground(Color.lightGray);
    login.addActionListener(this);
    add(login);
    
    /* SignUp =new JButton("Sign Up");
    SignUp.setBounds(450,408,100,30);
    SignUp.setBackground(Color.lightGray);
    SignUp.addActionListener(this);
    add(SignUp);*/
    } public void actionPerformed(ActionEvent ae){
      ae.getSource();
    }
    public static void main(String[] args) {
        new Stulogin();
    }
}
