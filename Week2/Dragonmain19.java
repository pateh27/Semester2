package Week2;

public class Dragonmain19 {
   public static void main(String[] args) {
    Dragon19 dg1 = new Dragon19();
    dg1.x = 3;
    dg1.y = 6;
    dg1.width = 8;
    dg1.heigth = 9;

    dg1.moveRigth();
    dg1.detectCollision(dg1.x, dg1.y);    
    dg1.moveRigth();
    dg1.detectCollision(dg1.x, dg1.y);    
    dg1.moveRigth();
    dg1.detectCollision(dg1.x, dg1.y);    
    dg1.moveLeft();
    dg1.detectCollision(dg1.x, dg1.y);    
    dg1.moveLeft();
    dg1.detectCollision(dg1.x, dg1.y);    
    for (int i = 1; i <= 10;) {
        dg1.moveUp();
        i++;   
    }    
    dg1.detectCollision(dg1.x, dg1.y);    
    }
}
