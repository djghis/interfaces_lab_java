public class CdPlayer extends Components implements IPlay {

    private int cdNum;

    public CdPlayer(String make, String model, int cdNum){
        super(make, model);
        this.cdNum = cdNum;
    }


    public int play() {
        return this.cdNum;
    }
}
