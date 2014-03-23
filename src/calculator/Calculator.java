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
    double value = 0.0, summ = 0.0;
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
    minus.addActionListnere(new minusActionListener());
    JButton multiply = new JButton("*");
    multiply.addActionListener(new multiplyActionListener());
    JButton divide = new JButton("/");
    divide.addActionListener(new divideActionListener());
    JButton clean = new JButton("CE");
    clean.addActionListener(new cleanActionListener());
    JButton sqrt = new JButton("√");
    sqrt.addActionListener(new sqrtActionListener());
    field = new JTextArea(1,20);
    field.setLineWrap(true);
    field.setEditable(false);
    JPanel panel = new JPanel();
    panel.add(seven);
    panel.add(eight);
    panel.add(nine);
    panel.add(four);
    panel.add(five);
    panel.add(six);
    panel.add(one);
    panel.add(two);
    panel.add(three);
    panel.add(zerro);
    panel.add(dot);
    panel.add(equals);
    panel.add(plus);
    panel.add(minus);
    frame.add(BorderLayout.NORTH, field);
    frame.add(BorderLayout.CENTER, panel);
    frame.setSize(150,200);
    frame.setVisible(true);
    frame.setResizable(false);
    frame.setLocation(200,200);
    }
    
    public void plus(){
        if (button == ""){} else {
            value = Double.parseDouble(button);            
            summ += value;
            s += summ;
            field.setText(s);
            button = "";}
            s = "";
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
