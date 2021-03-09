public class Squirrel {
    Picture head;
    Picture tail;
    //coordinates start from top left
    int headXCoordinate;
    int headYCoordinate;
    int tailXCoordinate;
    int tailYCoordinate;
    public Squirrel(){
        head = new Picture("icons/RedSquirrel1Nut.png", 270);
        tail = new Picture("icons/RedSquirrel2.png", 270);
        headXCoordinate = 1;
        headYCoordinate = 1;
        tailXCoordinate = 2;
        tailYCoordinate = 1;
    }
    
    public void moveUp(){
        if(headYCoordinate == 0 || tailYCoordinate == 0){
            System.out.println("illegal top move");
        }
        else {
            headYCoordinate -= 1;
            tailYCoordinate -= 1;
        }
    }

    public void moveDown() {
        if (headYCoordinate == 3 || tailYCoordinate == 3) {
            System.out.println("illegal bottom move");
        } else {
            headYCoordinate += 1;
            tailYCoordinate += 1;
        }
    }

    public void moveLeft(){
        if(headXCoordinate == 0 || tailXCoordinate == 0){
            System.out.println("illegal left move");
        }
        else {
            headXCoordinate -= 1;
            tailXCoordinate -= 1;
        }
    }

    public void moveRight() {
        if (headXCoordinate == 3 || tailXCoordinate == 3) {
            System.out.println("illegal left move");
        } else {
            headXCoordinate += 1;
            tailXCoordinate += 1;
        }
    }
}
