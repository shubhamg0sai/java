import javax.swing.*;
 import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
 public class EmployeeSalary 
{
 private JPanel Main; private JTextField txtempname; 
private JTextField txtsalary; 
private JTextField txttax;
 private JTextField txtnetsal;
 private JButton OKButton; 
public static void main(String[] args) 
{
 JFrame frame = new JFrame("EmployeeSalary"); frame.setContentPane(new EmployeeSalary().Main); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.pack(); 
frame.setVisible(true); 
} 
public EmployeeSalary()
 {
 OKButton.addActionListener(new ActionListener()
 {
 @Override public void actionPerformed(ActionEvent e) 
{ 
double salary=Double.parseDouble(txtsalary.getText()); 
double tax;
 if(salary>50000)
{
 tax=salary*10/100; 
} 
else if(salary>35000)
{
 tax=salary*5/100; 
}
 Else
{
 tax=0.00;
 }
 txttax.setText(String.valueOf(tax)); 
double nsal = salary-tax; 
txtnetsal.setText(String.valueOf(nsal)); 
} 
});
 } 
}
