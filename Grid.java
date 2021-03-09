import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.*;

import java.awt.*;
public class Grid  {
    JPanel boardPanel;
    JButton[][] board;
    private Picture firstHole;
    private Picture secondHole;
    private Picture thirdHole;
    private Picture fourthHole;
    Squirrel redSquirrel;
    Squirrel selectedSquirrel;
    Picture emptySquarePicture;

    public Grid(){
        //make squirrel
        redSquirrel = new Squirrel();
        boardPanel = new JPanel();
        //create the layout
        boardPanel.setLayout(new GridLayout(4, 4));
        board = new JButton[4][4];
        //make a picture for the main board piece
        emptySquarePicture = new Picture("icons/Empty.png", 0);
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                board[i][j] = new JButton(emptySquarePicture);
                board[i][j].setBorder(null);
            }
        }
        //make a picture for the holes
        firstHole = new Picture("icons/Hole.png", 0);
        secondHole = new Picture("icons/Hole.png", 0);
        thirdHole = new Picture("icons/Hole.png", 0);
        fourthHole = new Picture("icons/Hole.png", 0);

        board[0][2].setIcon(firstHole);
        board[1][0].setIcon(secondHole);
        board[2][1].setIcon(thirdHole);
        board[3][3].setIcon(fourthHole);

        //boardWindow.setLayout(boardLayout);
        // add the buttons to the panel
        this.updateBoard();
 

    }

    public void updateBoard(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                boardPanel.add(board[i][j]);
            }
        }
    }

    public void clearBoard(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j].setIcon(emptySquarePicture);
                board[i][j].setBorder(null);
            }
        }
        board[0][2].setIcon(firstHole);
        board[1][0].setIcon(secondHole);
        board[2][1].setIcon(thirdHole);
        board[3][3].setIcon(fourthHole);
        uploadFlower();
    }

    // public void addActionListenerBoard(){
    //     for (int i = 0; i < 4; i++) {
    //         for (int j = 0; j < 4; j++) {
    //             board[i][j].addActionListener(this);
    //         }
    //     }
    // }

    public void uploadSquirrels(){
        board[redSquirrel.headYCoordinate][redSquirrel.headXCoordinate].setIcon(redSquirrel.head);
        board[redSquirrel.tailYCoordinate][redSquirrel.tailXCoordinate].setIcon(redSquirrel.tail);
        board[2][2].setIcon(new Picture("icons/GreySquirrel1Nut.png", 0));
        board[3][2].setIcon(new Picture("icons/GreySquirrel2.png", 0));
    }

    public void uploadFlower(){
        board[2][1].setIcon(new Picture("icons/Flower.png", 0));
    }

    public void setHoles(){
        if(board[1][1].getIcon() == redSquirrel.head) {
            System.out.println("squirel detected");
        }
        System.out.println(board[1][1].getIcon());
    }


    // public void squirelClicked(ActionEvent e){
    //     if(e.getSource() == redSquirrel.head){
    //         selectedSquirrel = redSquirrel;
    //         System.out.println("red squirrel clicked");
    //     }
    // }
}
