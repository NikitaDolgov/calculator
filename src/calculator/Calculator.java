/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Nikita
 */
public class Calculator {
    JTextArea field;
    String button = "",s = "";
    double value = 0.0, summ = 0.0, temp = 0.0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator cal = new Calculator();
        cal.create();
    }
    public void create(){
    JFrame frame = new JFrame("Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton zerro = new JButton("0");
    zerro.addActionListener(new ButtonActionListener("0"));
    JButton one = new JButton("1");
    one.addActionListener(new ButtonActionListener("1"));
    JButton two = new JButton("2");
    two.addActionListener(new ButtonActionListener("2"));
    JButton three = new JButton("3");
    three.addActionListener(new ButtonActionListener("3"));
    JButton four = new JButton("4");
    four.addActionListener(new ButtonActionListener("4"));
    JButton five = new JButton("5");
    five.addActionListener(new ButtonActionListener("5"));
    JButton six = new JButton("6");
    six.addActionListener(new ButtonActionListener("6"));
    JButton seven = new JButton("7");
    seven.addActionListener(new ButtonActionListener("7"));
    JButton eight = new JButton("8");
    eight.addActionListener(new ButtonActionListener("8"));
    JButton nine = new JButton("9");
    nine.addActionListener(new ButtonActionListener("9"));
    JButton dot = new JButton(".");
    dot.addActionListener(new ButtonActionListener("."));
    JButton plus = new JButton("+");
    plus.addActionListener(new plusActionListener());
    JButton equals = new JButton("=");
    equals.addActionListener(new equalsActionListener());
    JButton minus = new JButton("-");
    //minus.addActionListnere(new minusActionListener());
    JButton multiply = new JButton("*");
    //multiply.addActionListener(new multiplyActionListener());
    JButton divide = new JButton("/");
    //divide.addActionListener(new divideActionListener());
    JButton clean = new JButton("CE");
   // clean.addActionListener(new cleanActionListener());
    JButton sqrt = new JButton("√");
   // sqrt.addActionListener(new sqrtActionListener());
    field = new JTextArea(1,20);
    field.setLineWrap(true);
    field.setEditable(false);
    JPanel panel = new JPanel();
    panel.setLayout(null);
    seven.setBounds(4,10,41,30);
    panel.add(seven);
    eight.setBounds(50,10,41,30);
    panel.add(eight);
    nine.setBounds(95,10,41,30);
    panel.add(nine);
    divide.setBounds(140,10,41,30);
    panel.add(divide);
    clean.setBounds(185,10,50,30);
    panel.add(clean);
    four.setBounds(4,45,41,30);
    panel.add(four);
    five.setBounds(50,45,41,30);
    panel.add(five);
    six.setBounds(95,45,41,30);
    panel.add(six);
    multiply.setBounds(140,45,41,30);
    panel.add(multiply);
    sqrt.setBounds(185,45,50,30);
    panel.add(sqrt);
    one.setBounds(4,80,41,30);
    panel.add(one);
    two.setBounds(50,80,41,30);
    panel.add(two);
    three.setBounds(95,80,41,30);
    panel.add(three);
    minus.setBounds(140,80,41,30);
    panel.add(minus);
    equals.setBounds(185,80,50,65);
    panel.add(equals);
    zerro.setBounds(4,115,87,30);
    panel.add(zerro);
    dot.setBounds(95,115,41,30);
    panel.add(dot);
    plus.setBounds(140,115,41,30);
    panel.add(plus); 
    frame.add(BorderLayout.NORTH, field);
    frame.add(BorderLayout.CENTER, panel);
    frame.setSize(250,200);
    frame.setVisible(true);
    frame.setResizable(false);
    frame.setLocation(200,200);
    }
    public void minus(){
        if (button == "") {} else {
            value = Double.parseDouble(button);            
            summ = summ - value;
            s += summ;
            field.setText(s);
            button = "";
            s = "";
        }
    }
    public void plus(){
        if (button == ""){} else {
            value = Double.parseDouble(button);  
            temp = value;
            summ += value;
            s += summ;
            field.setText(s);
            button = "";
            s = "";
        }
    }
    public void equal(){
        if (button == "") {} else {
            value = Double.parseDouble(button);            
            summ += value;
            s += summ;
            field.setText(s);
            button = "";
            s = "";
            summ = 0.0;
        }
    }
    class minusActionListener implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            minus();
        }
    }
    class ButtonActionListener implements ActionListener{
        String a;
        ButtonActionListener(String q){
            a=q;
        }
        public void actionPerformed(ActionEvent event){
            button += a;
        }
    }
    class plusActionListener implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            plus();
        }
    }
    class equalsActionListener implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            equal();
        }
    }
}
