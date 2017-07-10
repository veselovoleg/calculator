
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class calcFrame extends JFrame  {

    private static final long serialVersionUID = 1L;
    JTextArea display = new JTextArea(); //дислей калькулятора
    JTextArea displayRes = new JTextArea(); //дислей калькулятора
    JPanel buttonPannel = new JPanel(new GridLayout(5,3));//Панель кнопок



    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");

    JButton buttonOpAddition= new JButton("+");
    JButton buttonOpDeduction = new JButton("-");
    JButton buttonOpDivision = new JButton("/");
    JButton buttonOpMultiplication = new JButton("*");
    JButton buttonOpBack = new JButton("C");
    JButton buttonOpStart = new JButton("=");

    int firstValue = 0; //заведем переменную для первого числа
    String operation = "+"; //заведем переменную для операций

    public calcFrame() {
        setTitle("Калькулятор");
        setBounds(300,300,300,300);
        setLayout(new BorderLayout());

        button0.addActionListener(new ActionListener() { //добавляем слушатели событий для кнопок
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"0");
                displayRes.setText(displayRes.getText()+"0");
            }
        });
        button1.addActionListener(new ActionListener() { //добавляем слушатели событий для кнопок
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"1");
                displayRes.setText(displayRes.getText()+"1");
            }
        });
        button2.addActionListener(new ActionListener() { //добавляем слушатели событий для кнопок
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"2");
                displayRes.setText(displayRes.getText()+"2");
            }
        });
        button3.addActionListener(new ActionListener() { //добавляем слушатели событий для кнопок
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"3");
                displayRes.setText(displayRes.getText()+"3");
            }
        });
        button4.addActionListener(new ActionListener() { //добавляем слушатели событий для кнопок
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"4");
                displayRes.setText(displayRes.getText()+"4");
            }
        });
        button5.addActionListener(new ActionListener() { //добавляем слушатели событий для кнопок
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"5");
                String tempText = display.getText()+"5";
                displayRes.setText(displayRes.getText()+"5");
            }
        });
        button6.addActionListener(new ActionListener() { //добавляем слушатели событий для кнопок
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"6");
                displayRes.setText(displayRes.getText()+"6");
            }
        });
        button7.addActionListener(new ActionListener() { //добавляем слушатели событий для кнопок
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"7");
                displayRes.setText(displayRes.getText()+"7");
            }
        });
        button8.addActionListener(
                new ActionListener() { //добавляем слушатели событий для кнопок
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"8");
                displayRes.setText(displayRes.getText()+"8");
            }
        }
        );
        button9.addActionListener(new ActionListener() { //добавляем слушатели событий для кнопок
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"9");
                displayRes.setText(displayRes.getText()+"9");
            }
        });

        buttonOpBack.addActionListener(new ActionListener() { //кнопка "С"
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = display.getText(); //то, что на дисплее, сохраним в переменную temp
                String temp2 = displayRes.getText();
                display.setText(temp.substring(0,temp.length()-1)); //удаляем одну цифру
                displayRes.setText(temp2.substring(0,temp2.length()-1));
            }
        });



        buttonOpAddition.addActionListener(new ActionListener() { //прописываем операции
            @Override
            public void actionPerformed(ActionEvent e) {

                firstValue = Integer.valueOf(displayRes.getText());
                display.setText(firstValue+" + ");
                displayRes.setText("");
                operation = "+";

            }
        });



        buttonOpDeduction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(displayRes.getText());
                displayRes.setText("");
                display.setText(firstValue+" - ");
                operation = "-";
            }
        });

        buttonOpDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(displayRes.getText());
                displayRes.setText("");
                display.setText(firstValue+" / ");
                operation = "/";
            }
        });

        buttonOpMultiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(displayRes.getText());
                displayRes.setText("");
                display.setText(firstValue+" * ");
                operation = "*";

            }
        });

        buttonOpStart.addActionListener(new ActionListener() { //Слушатель для знака "="
            @Override
            public void actionPerformed(ActionEvent e) {
                int secondValue = Integer.valueOf(displayRes.getText());
                if ("+".equals(operation)){
                    display.setText((firstValue+secondValue)+"");
                }
                if ("-".equals(operation)){
                    display.setText((firstValue-secondValue)+"");
                }
                if ("/".equals(operation)){
                    display.setText((firstValue/secondValue)+"");
                }
                if ("*".equals(operation)){
                    display.setText((firstValue*secondValue)+"");
                }
            }
        });

        add(display,BorderLayout.NORTH); //дисплей сверху, "север"
        add(displayRes);

        display.setFocusable(false); //Делаем так, чтобы в нем нельзя было писать
        add(buttonPannel,BorderLayout.CENTER); //кнопки по центру
        add(buttonOpStart, BorderLayout.SOUTH); //Знак "=" в самом низу

         //Добавляем кнопки к панели
        buttonPannel.add(button1);
        buttonPannel.add(button2);
        buttonPannel.add(button3);
        buttonPannel.add(button4);
        buttonPannel.add(button5);
        buttonPannel.add(button6);
        buttonPannel.add(button7);
        buttonPannel.add(button8);
        buttonPannel.add(button9);
        buttonPannel.add(buttonOpAddition);
        buttonPannel.add(button0);
        buttonPannel.add(buttonOpDeduction);
        buttonPannel.add(buttonOpDivision);
        buttonPannel.add(buttonOpMultiplication);
        buttonPannel.add(buttonOpBack);

        setVisible(true);
    }


}

