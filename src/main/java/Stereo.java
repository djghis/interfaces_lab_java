public class Stereo extends Components implements IPlay {

    private String name;
    private int volume;


    public Stereo(String make, String model, String name, int volume) {
        super(make, model);
        this.name = name;
        this.volume = volume;
    }

    public String play() {
        return "I am a Stereo";
    }

    public void raiseVolume(){
        this.volume  += 1;
    }

    public void lowerVolume(){
        this.volume --;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
