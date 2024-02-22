package Week2;

public class Dragon19 {
    int x, y, width, heigth;
    
    void moveLeft(){
        x -= 1;

    } 
    void moveRigth(){
        x += 1;

    }
    void moveUp(){
        y += 1;
    }
    void moveDown(){
        y -= 1;
    }
    void detectCollision(int x, int y){
        if ((x < 0 || x > width)||(y < 0 || y > heigth)) {
            System.out.println("GAME OVER");
            System.exit(0);
        }
    }
    void posisionDragon(){
        System.out.printf("\nDragon posision : X = %d, Y = %d\n",  x, y);
    }
}
