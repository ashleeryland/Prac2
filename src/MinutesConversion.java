import javax.swing.*;

public class MinutesConversion
{
    public static void main(String[] args)
    {
        String minutes;
        minutes = JOptionPane.showInputDialog(null,
                "Enter a number:", "Salary dialog 1",
                JOptionPane.INFORMATION_MESSAGE);
        double hours = Integer.parseInt(minutes) / 60;
        double days = hours / 24;
        JOptionPane.showMessageDialog(null, "Minutes : " + minutes +
                "\nHours : " + hours + "\nDays: " + days);
    }


}
