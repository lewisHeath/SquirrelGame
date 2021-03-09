import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Arrows{
    JButton topArrow;
    JButton bottomArrow;
    JButton leftArrow;
    JButton rightArrow;

    public Arrows(){
        //create the arrow buttons
        Picture topPicture = new Picture("icons/BigArrow.png", 0);
        Picture bottomPicture = new Picture("icons/BigArrow.png", 180);
        Picture leftPicture = new Picture("icons/Arrow.png", 270);
        Picture rightPicture = new Picture("icons/Arrow.png", 90);

        // make them buttons
        topArrow = new JButton(topPicture);
        bottomArrow = new JButton(bottomPicture);
        leftArrow = new JButton(leftPicture);
        rightArrow = new JButton(rightPicture);

        // remove the borders
        topArrow.setBorder(null);
        bottomArrow.setBorder(null);
        leftArrow.setBorder(null);
        rightArrow.setBorder(null);


    }
}
