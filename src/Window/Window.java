package Window;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
        grid = new GridLayout(i,j);
        window.setLayout(grid);
        JButton diceButton = new JButton();
        JButton arrButton = new JButton();
        JButton exitButton = new JButton();

        diceButton.setText("Die");
        arrButton.setText("Manual Array");
        exitButton.setText("Exit");
        setupButtons(diceButton, arrButton, exitButton);
        
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
        int i = 0;
        int j = 0;
        GridLayout arrayLayout = new GridLayout(i, j);

        window.setLayout(arrayLayout);
    }

    public void exit()
    {
        window.dispose();
    }

    private void setupButtons(JButton varDie, JButton varArr, JButton varExit)
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
}