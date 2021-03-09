import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameBoard implements ActionListener{
    JFrame window;
    JPanel mainPanel;
    BorderLayout layout;
    Arrows arrows;
    Grid playArea;

    public GameBoard(){
        //create the panel
        layout = new BorderLayout();
        mainPanel = new JPanel();
        mainPanel.setLayout(layout);

        //create the arrows
        arrows = new Arrows();
        //add arrows to the window
        mainPanel.add("North", arrows.topArrow);
        mainPanel.add("South", arrows.bottomArrow);
        mainPanel.add("West", arrows.leftArrow);
        mainPanel.add("East", arrows.rightArrow);
        //add the grid in the center ~ needs to be built yet
        playArea = new Grid();
        mainPanel.add("Center", playArea.boardPanel);

        //creating the window
        window = new JFrame();
        window.setTitle("nut game");
        window.setSize(590, 590);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set visible to true
        window.setContentPane(mainPanel);
        window.getContentPane().setBackground(Color.black);
        window.setVisible(true);

        //add action listeners
        this.addActionListener();

        //set middle part up
        setGrid();
    }

    public void setGrid(){
        playArea.uploadSquirrels();
        playArea.uploadFlower();
        playArea.updateBoard();
        playArea.setHoles();
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == arrows.topArrow) {
            System.out.println("Top arrow");
            // somehow access the squirrel and board and move it
            playArea.clearBoard();
            playArea.redSquirrel.moveUp();
            playArea.uploadSquirrels();
        }
        if (e.getSource() == arrows.bottomArrow) {
            System.out.println("Bottom arrow");
            //move squirrel down
            playArea.clearBoard();
            playArea.redSquirrel.moveDown();
            playArea.uploadSquirrels();
        }
        if (e.getSource() == arrows.leftArrow) {
            System.out.println("Left arrow");
            playArea.clearBoard();
            playArea.redSquirrel.moveLeft();
            playArea.uploadSquirrels();
        }
        if (e.getSource() == arrows.rightArrow) {
            System.out.println("Right arrow");
            playArea.clearBoard();
            playArea.redSquirrel.moveRight();
            playArea.uploadSquirrels();
        }
        if(e.getSource() == playArea.board[0][0]){
            System.out.println("board panel");
        }
    }

    public void addActionListener(){
        arrows.topArrow.addActionListener(this);
        arrows.bottomArrow.addActionListener(this);
        arrows.leftArrow.addActionListener(this);
        arrows.rightArrow.addActionListener(this);
    }
}