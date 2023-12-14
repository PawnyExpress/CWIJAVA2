public class ElmerFudd implements Observer, DisplayAttitude{

    private final String DEFAULT_ATTITUDE;
    private String attitude;
    private Subject fishAndGame;

    public ElmerFudd(Subject fishAndGame) {
        this.fishAndGame = fishAndGame;
        this.fishAndGame.registerObserver(this);
       
        /* this.fishAndGame = fishAndGame;
        this.fishAndGame.registerObserver(this); */


        this.attitude = DEFAULT_ATTITUDE = "I am wewacksing in my chaiw by the fiwe. Heh eh eh";
    }

    @Override
    public void display() {
        System.out.println(this);
        System.out.println(attitude);
    }

    @Override
    public void update(HuntingSeason season) {
        switch(season){
            case DUCK:
                attitude = "Be vewy vewy quiet. I'm hunting Ducks. Heh eh eh";
                break;
            case RABBIT:
                attitude = "Be vewy vewy quiet. I'm hunting Wabbits. Heh eh eh";
                break;
            case NONE:
                attitude = DEFAULT_ATTITUDE;
                break;
        }
    }

    public String toString() {
        return "My name is Elmer Fudd.";
    }
    
}
