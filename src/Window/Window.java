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
        

        setup(5,5);
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
        arrButton.setText("Manual Array");
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
        int i = 0;
        int j = 0;
        GridLayout dieLayout = new GridLayout(i, j);
        

        window.setLayout(dieLayout);
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
                setup(5, 5);
            }
            
        });
    }
}