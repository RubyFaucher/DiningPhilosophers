package diningphilosophers;

public class ChopStick {
    // Le nombre total de baguettes
    private static int stickCount = 3;
    // Le numéro de chaque baguette
    private final int myNumber;
    // Est-ce que ma baguette est libre ?
    private boolean iAmFree = true;

    public ChopStick() {
        // Chaque baguette est numérotée 
        myNumber = ++stickCount;
    }
    public void take() throws InterruptedException{
        while(!this.iAmFree){
            wait();
        }
        this.iAmFree=false;
        this.stickCount-=1;

    }
    public void release(){
        this.iAmFree=true;
        this.stickCount+=1;
    }

    // ...
    
    @Override
    public String toString() {
        return "Stick#" + myNumber;
    }
}
