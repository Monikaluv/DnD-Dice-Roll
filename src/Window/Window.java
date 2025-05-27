package Window;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Program.*;

public class Window
{
    JFrame window;
    LayoutManager grid;

    public Window()
    {
        window = new JFrame("DnD Dice Roll");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        setup(3,5);
    }

    public void setup(int i, int j)
    {
        window.getContentPane().removeAll();
        window.validate();
        grid = new GridLayout(i,j);
        window.setLayout(grid);
        JButton diceButton = new JButton();
        JButton arrButton = new JButton();
        JButton exitButton = new JButton();

        diceButton.setText("Die");
        arrButton.setText("Array");
        exitButton.setText("Exit");
        setupMainButtons(diceButton, arrButton, exitButton);
        
        JPanel[][] panelholder = new JPanel[i][j];

        for(int m = 0; m < i; m++)
        {
            for(int n = 0; n < j; n++)
            {
                panelholder[m][n] = new JPanel();
                window.add(panelholder[m][n]);
            }
        }
        panelholder[1][0].add(diceButton);
        panelholder[1][4].add(arrButton);
        panelholder[2][2].add(exitButton);

        window.setSize(500, 500);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    public void DiceScreen()
    {
        window.getContentPane().removeAll();
        window.validate();
        int i = 5;
        int j = 7;
        GridLayout dieLayout = new GridLayout(i, j);

        JButton d4 = new JButton("D4");
        JLabel d4Label = new JLabel();
        JButton d6 = new JButton("D6");
        JLabel d6Label = new JLabel();
        JButton d8 = new JButton("D8");
        JLabel d8Label = new JLabel();
        JButton d10 = new JButton("D10");
        JLabel d10Label = new JLabel();
        JButton d12 = new JButton("D12");
        JLabel d12Label = new JLabel();
        JButton d20 = new JButton("D20");
        JLabel d20Label = new JLabel();
        JButton d100 = new JButton("D100");
        JLabel d100Label = new JLabel();
        JButton back = new JButton("Back");
        JButton reset = new JButton("reset");

        JButton[] buttonArr = {d4, d6, d8, d10, d12, d20, d100, back, reset};
        JLabel[] LabelArr = {d4Label, d6Label, d8Label, d10Label, d12Label, d20Label, d100Label};

        setupDiceButtons(buttonArr, LabelArr);
        window.setLayout(dieLayout);

        JPanel[][] panelholder = new JPanel[i][j];
        for(int m = 0; m < i; m++)
        {
            for(int n = 0; n < j; n++)
            {
                panelholder[m][n] = new JPanel();
                window.add(panelholder[m][n]);
            }
        }
        panelholder[1][0].add(d4);
        panelholder[1][1].add(d6);
        panelholder[1][2].add(d8);
        panelholder[1][3].add(d10);
        panelholder[1][4].add(d12);
        panelholder[1][5].add(d20);
        panelholder[1][6].add(d100);

        panelholder[2][0].add(d4Label);
        panelholder[2][1].add(d6Label);
        panelholder[2][2].add(d8Label);
        panelholder[2][3].add(d10Label);
        panelholder[2][4].add(d12Label);
        panelholder[2][5].add(d20Label);
        panelholder[2][6].add(d100Label);

        panelholder[3][2].add(reset);
        panelholder[3][4].add(back);


        window.setSize(500, 500);
        window.setLocationRelativeTo(null);
        window.setVisible(true);       
    }

    public void ArrayScreen()
    {
        window.getContentPane().removeAll();
        window.validate();
        int i = 6;
        int j = 3;
        GridLayout arrayLayout = new GridLayout(i, j);

        JButton RollButton = new JButton();
        RollButton.setText("Roll");
        JButton BackButton = new JButton();
        BackButton.setText("Back");
        JLabel RollLabel = new JLabel();

        setupArrayButtons(RollButton, RollLabel, BackButton);

        window.setLayout(arrayLayout);

        JPanel[][] panelholder = new JPanel[i][j];
        for(int m = 0; m < i; m++)
        {
            for(int n = 0; n < j; n++)
            {
                panelholder[m][n] = new JPanel();
                window.add(panelholder[m][n]);
            }
        }

        panelholder[1][1].add(RollButton);
        panelholder[3][1].add(RollLabel);
        panelholder[5][1].add(BackButton);

        window.setSize(500, 500);
        window.setLocationRelativeTo(null);
        window.setVisible(true);        
    }

    public void exit()
    {
        window.dispose();
    }

    private void Roll(JLabel varLabel)
    {
        CharacterRoller roller = new CharacterRoller();
        roller.StatArrayRoll();
        varLabel.setText(roller.toString());
    }

    private void setupMainButtons(JButton varDie, JButton varArr, JButton varExit)
    {
        varDie.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              DiceScreen();
            }
            
        });

        varArr.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayScreen();
            }
            
        });
        varExit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                exit();
            }
            
        });
    }

    private void setupArrayButtons(JButton varRoll, JLabel varLabel, JButton varBack)
    {
        varRoll.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Roll(varLabel);
            }
            
        });

        varBack.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setup(3, 5);
            }
            
        });
    }

    private void setupDiceButtons(JButton[] varButtons, JLabel[] varLabels)
    {
        varButtons[7].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setup(3, 5);
            }
            
        });
    }
}