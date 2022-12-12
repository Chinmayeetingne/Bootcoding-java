package oops;

public class Cricket {
    int players;
    int teams;
    String playingArea;
    String Umpires;
    String Innings;
    String clothing;
    String equipments;
    String type;
    int score;
    String stadium;
    int overs;

    public void rules(){
        System.out.println("Rules of cricket");

    }

    public void myteam(){
        System.out.println("This is my team");

    }
    boolean toss(){
        return true;
    }
    boolean calculateWinner(){
        return true;
    }


    public static void main(String[] args) {
        Cricket cricket = new Cricket();
        cricket.toss();//object calling
    }

}
