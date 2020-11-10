package lesson8;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GraphicsShell extends JFrame {

    public GraphicsShell(int range) {

        int number = (int) (Math.random() * range);

        JFrame graphicsShell = new JFrame("Угадай число");
        graphicsShell.setSize(300, 300);

        JLabel task = new JLabel("Угадайте число от 0 до 9");
        task.setBounds(65, 30, 220, 20);
        graphicsShell.add(task);

        JTextField userAnswer = new JTextField("");
        userAnswer.setBounds(50, 65, 200, 30);
        graphicsShell.add(userAnswer);

        JButton answerButton = new JButton("Ответить");
        answerButton.setBounds(110, 105, 80, 20);
        graphicsShell.add(answerButton);

        JLabel commentDown = new JLabel("Загаданное число меньше");
        commentDown.setBounds(75, 145, 220, 20);
        graphicsShell.add(commentDown);
        commentDown.setVisible(false);

        JLabel commentUP = new JLabel("Загаданное число больше");
        commentUP.setBounds(75, 145, 220, 20);
        graphicsShell.add(commentUP);
        commentUP.setVisible(false);

        JLabel commentWin = new JLabel("Поздравляю с победой!");
        commentWin.setBounds(75, 145, 220, 20);
        graphicsShell.add(commentWin);
        commentWin.setVisible(false);


        JLabel reStart = new JLabel("Хотите сыграть еще раз?");
        reStart.setBounds(75, 165, 220, 20);
        graphicsShell.add(reStart);
        reStart.setVisible(false);

        JButton yesButton = new JButton("Да");
        yesButton.setBounds(65, 195, 80, 20);
        graphicsShell.add(yesButton);
        yesButton.setVisible(false);

        JButton noButton = new JButton("Нет");
        noButton.setBounds(165, 195, 80, 20);
        graphicsShell.add(noButton);
        noButton.setVisible(false);


        JButton exitButton = new JButton("Выйти");
        exitButton.setBounds(110, 240, 80, 20);
        graphicsShell.add(exitButton);


        graphicsShell.setLayout(null);
        graphicsShell.setVisible(true);

        for (int i = 0; i < 5; i++) {
            answerButton.addActionListener(e -> {
                int inputNumber = Integer.parseInt(userAnswer.getText());
                if (inputNumber == number) {
                    commentDown.setVisible(false);
                    commentUP.setVisible(false);
                    yesButton.setVisible(true);
                    noButton.setVisible(true);
                    commentWin.setVisible(true);
                    reStart.setVisible(true);
                    yesButton.addActionListener(event -> {
                        reStart();
                    });
                    noButton.addActionListener(event -> {
                        System.exit(1);
                    });

                } else if (inputNumber > number) {
                    commentDown.setVisible(true);
                } else {
                    commentUP.setVisible(true);
                }
            });
        }

        exitButton.addActionListener(e -> {
            System.exit(1);
        });

    }

    public static void reStart() {
//        GraphicsShell(int range);
    }

}
