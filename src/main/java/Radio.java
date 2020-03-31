public class Radio {

    private String name;

    public Radio(String name){
        this.name = name;
    }


    public String tune(){
        return "You are being tune to " + this.name + ". Thank you for listening.";
    }

}
