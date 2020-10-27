package animalKingdom;

abstract class Animal {
    // comeback and make make it work without static since using static on a protected object is bad practice
    protected String move;
    protected String breath;
    protected String reproduce;

    // supertype constructor
    public Animal() {

    }

    public Animal(String move, String breath, String reproduce) {
        this.move = move;
        this.breath = breath;
        this.reproduce = reproduce;
    }

    // needs this abstract methoed to access methoed from Mammals at parent Animal
    abstract int getYear();
    abstract String getName();


    // setting and getting how the animals move
   void setMove(String move) {
       this.move = move;
   }

    String getMove() {
        return move;
    }

    // setting and getting how the animals breath
    void setBreath(String breath) {
       this.breath = breath;
    }

    String getBreath() {
       return breath;
    }

    // setting and getting how the animals reproduce
    void setReproduce(String reproduce) {
       this.reproduce = reproduce;
    }

    String getReproduce() {
       return reproduce;
    }


}