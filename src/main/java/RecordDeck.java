public class RecordDeck extends Components implements IPlay {

    private RecordSpeed recordSpeed;

    public RecordDeck(String make, String model, RecordSpeed recordSpeed ){
        super(make, model);
        this.recordSpeed = recordSpeed;
    }






    public RecordSpeed getSpeed() {
        return this.recordSpeed;
    }

    public String play() {
        return "RecordDeck playing at " + getSpeed() + " RPM.";
    }
}
