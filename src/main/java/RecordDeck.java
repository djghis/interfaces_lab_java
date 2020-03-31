public class RecordDeck extends Components implements IPlay {

    private int speed;

    public RecordDeck(String make, String model,int speed){
        super(make, model);
        this.speed = speed;
    }

    public int play() {
        return this.speed;

    }
}
